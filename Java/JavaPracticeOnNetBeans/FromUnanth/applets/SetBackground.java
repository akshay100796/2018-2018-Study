
package AboutMouse;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SetBackground extends JFrame implements ActionListener
{
    JButton red,blue,green,black;
    JFrame f;
    public SetBackground() 
    {
        f  = new JFrame();
        f.setLayout(new FlowLayout());
        f.setBounds(100, 100, 600, 600);
        
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        black = new JButton("Black");
        
        f.add(red);
        f.add(blue);
        f.add(green);
        f.add(black);
        
        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        black.addActionListener(this);
        
        
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == blue)
        {
            f.getContentPane().setBackground(Color.blue);
        }
        else if(e.getSource() == red)
        {
            f.getContentPane().setBackground(Color.red);
        }
        else if(e.getSource() == green)
        {
            f.getContentPane().setBackground(Color.green);
        }
        else if(e.getSource() == black)
        {
            f.getContentPane().setBackground(Color.black);
        }
        
    }
    
    public static void main(String[] args) 
    {
        SetBackground b = new SetBackground();
    }
}
