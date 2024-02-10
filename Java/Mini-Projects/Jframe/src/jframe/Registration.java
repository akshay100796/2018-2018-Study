package Jframe.src.jframe;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registration extends JFrame
{

    public Registration() throws HeadlessException 
    {
        super();
        JFrame j = new JFrame();
        j.setLayout(null);
        JLabel fname = new JLabel("First Name : ");
        fname.setBounds(50, 50, 100, 50);
        j.add(fname);
        JLabel lname = new JLabel("Last Name : ");
        lname.setBounds(50, 80, 100, 50);
        j.add(lname);
        JLabel email = new JLabel("Email ID : ");
        email.setBounds(50, 110, 100, 50);
        j.add(email);
        JLabel mob = new JLabel("Mobile No : ");
        mob.setBounds(50, 140, 100, 50);
        j.add(mob);
        
      
        
        JTextField fnameT = new JTextField();
        fnameT.setBounds(150, 60, 200, 25);
        j.add(fnameT);
        JTextField lnameT = new JTextField();
        lnameT.setBounds(150, 90, 200, 25);
        j.add(lnameT);
        JTextField mailT = new JTextField();
        mailT.setBounds(150,120,200,25);
        j.add(mailT);
        JTextField mobT = new JTextField();
        mobT.setBounds(150, 150, 200, 25);
        j.add(mobT);
        
        JButton ok = new JButton("Submit");
        ok.setBounds(150, 200, 100, 35);
        j.add(ok);
        
        JButton no = new JButton("Cancel");
        no.setBounds(280, 200, 100, 35);
        j.add(no);        

        ok.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showConfirmDialog(null,"Are you Sure "+mobT.getText()+" Permanant Mobile No? ");
                JOptionPane.showMessageDialog(null,"First Name : "+fnameT.getText()+"\nLast Name : "+lnameT.getText()+"\nEmail : "+mailT.getText()+"\nMobile No : "+mobT.getText());
            }
        });
        
        no.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        
        j.getContentPane().setBackground(Color.lightGray);
        
        
        j.setBounds(341, 191, 500, 500);
        j.setVisible(true);
        
    }
    
    public static void main(String[] args) 
    {
        Registration r = new Registration();
        
    }
}
