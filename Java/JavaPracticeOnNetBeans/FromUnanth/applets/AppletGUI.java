/*
Enter Name :  ___________
Age        :  dropDown list 11 to 30
Gender     :  Male  Female
            
            Submit
        
*/
package Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AppletGUI extends Applet implements ActionListener
{
    Label fname,lname,email,genderL,ageL;
    TextField fnameT,lnameT,emailT;
    CheckboxGroup gender;
    Choice age;
    Button button;
    
    String Fname,Lname,Email,Gender;
    int Age;
    
    @Override
    public void init() 
    {
        setSize(240 , 300);
       
        fname = new Label("First Name : ");
        add(fname);
        fnameT = new TextField(10);
        add(fnameT);
        
        lname = new Label("Last Name  : ");
        add(lname);
        lnameT = new TextField(10);
        add(lnameT);
        
        email = new Label("Email ID   : ");
        add(email);
        emailT = new TextField(15);
        add(emailT);
        
        genderL = new Label("Gender : ");
        add(genderL);
        gender = new CheckboxGroup();
        add(new Checkbox("Male",gender,true));
        add(new Checkbox("Female",gender,false));
        
        ageL = new Label("Age : ");
        add(ageL);
        age = new Choice();
        age.addItem("11");age.addItem("12");
        age.addItem("13");age.addItem("14");
        age.addItem("15");age.addItem("16");
        age.addItem("17");age.addItem("18");
        age.addItem("19");age.addItem("20");
        age.addItem("21");age.addItem("22");
        age.addItem("23");age.addItem("24");
        
        add(age);
        
        button = new Button(" Submit ");
        add(button);
        
        button.addActionListener(this);
        
    }
     @Override
    public void paint(Graphics g) 
    {
        if(Fname == null || Lname == null || Age == 0)
        {
            g.setColor(Color.red);
            g.drawString("Please Enter All Data", 30, 180);
        }
        else
        {
            g.drawString("First Name : "+Fname, 30, 200);
            g.drawString("Last Name : "+Lname, 30, 220);
            g.drawString("Email ID  : "+Email, 30, 240);
            g.drawString("Gender : "+Gender, 30, 260);
            g.drawString("Age : "+Age, 30, 280);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Fname = fnameT.getText();
        Lname = lnameT.getText();
        Email = emailT.getText();
        Gender = gender.getSelectedCheckbox().getLabel();
        Age = Integer.parseInt(age.getSelectedItem());
        repaint();
    }
}