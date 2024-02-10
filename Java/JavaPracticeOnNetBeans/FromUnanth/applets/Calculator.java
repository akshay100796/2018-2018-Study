
package UnanthApplet;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Calculator extends Frame implements ActionListener
{
    Label Fno,Sno,Result;
    TextField FnoT,SnoT,ResultT;
    Button sum,sub,mult,div,exit,reset;
    public Calculator()
    {
        Frame f = new Frame("Calulator");
        f.setSize(250, 400);
        f.setLayout(new GridLayout(9, 2));
        Fno = new Label("First No  : ");
        Sno = new Label("Second No : ");
        Result = new Label("Result : ");
        
        FnoT = new TextField(15);
        SnoT = new TextField(15);
        ResultT = new TextField(15);
        ResultT.setEditable(false);
        
        sum = new Button("+");
        sub = new Button("-");
        mult = new Button("*");
        div = new Button("/");
        reset = new Button("Reset");
        exit = new Button("Exit");
        
        f.add(Fno);
        f.add(FnoT);
        f.add(Sno);
        f.add(SnoT);
        f.add(Result);
        f.add(ResultT);
        f.add(sum);
        f.add(sub);
        f.add(mult);
        f.add(div);
        f.add(reset);
        f.add(exit);
        
        sum.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);
        
        f.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == sum)
        {
            try{
                int x = Integer.parseInt(FnoT.getText());
                int y = Integer.parseInt(SnoT.getText());
                int z = x+y;
                ResultT.setText(String.valueOf(z));
            }catch(NumberFormatException n){JOptionPane.showMessageDialog(null, "Character's are not allowed");}
        }
        if(e.getSource() == sub)
        {
            try{
                int x = Integer.parseInt(FnoT.getText());
                int y = Integer.parseInt(SnoT.getText());
                int z = x-y;
                ResultT.setText(String.valueOf(z));
            }catch(NumberFormatException n){JOptionPane.showMessageDialog(null, "Character's are not allowed");}
        }
        if(e.getSource() == mult)
        {
            try{
                int x = Integer.parseInt(FnoT.getText());
                int y = Integer.parseInt(SnoT.getText());
                int z = x*y;
                ResultT.setText(String.valueOf(z));
            }catch(NumberFormatException n){JOptionPane.showMessageDialog(null, "Character's are not allowed");}
        }
        if(e.getSource() == div)
        {
            try{
                int x = Integer.parseInt(FnoT.getText());
                int y = Integer.parseInt(SnoT.getText());
                try{
                    int z = x/y;
                    ResultT.setText(String.valueOf(z));
                }catch(ArithmeticException a){JOptionPane.showMessageDialog(null, "Unable to Devide");}   
            }catch(NumberFormatException n){JOptionPane.showMessageDialog(null, "Character's are not allowed");}
        }
        if(e.getSource() == reset)
        {
            FnoT.setText("");
            SnoT.setText("");
            ResultT.setText("");
        }
        if(e.getSource() == exit)
        {
            System.exit(0);
        }
        
    }
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
    }
    
}
