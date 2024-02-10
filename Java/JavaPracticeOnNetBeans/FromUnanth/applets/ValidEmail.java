
package Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidEmail extends Applet implements ActionListener
{
    Label emailLable;
    TextField emailText;
    String Email;
    Button button;
    boolean valid = false;
    @Override
    public void init() 
    {
        setSize(400,200);
         
        emailLable = new Label("Email ID : ");
        add(emailLable);
        emailText = new TextField(30);
        add(emailText);
        button = new Button("Check Validation");
        button.setBackground(Color.lightGray);
        add(button);    
        button.addActionListener(this);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString(Email+" Is Valid Email ID : "+valid, 50 ,150);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Email = emailText.getText();
        if(Email.endsWith("@gmail.com"))
        {
            valid = true;
        }
        else
        {
            valid = false;
        }
        repaint();
    }
    
}
