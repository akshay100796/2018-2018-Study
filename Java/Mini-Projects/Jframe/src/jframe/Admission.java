package Jframe.src.jframe;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Admission extends JFrame
{
    public static void main(String[] args)
    {
        int ch;
        Admission a = new Admission();
        Scanner s = new Scanner(System.in);
        System.out.println("1. Parent's Details");
        System.out.println("2. Student's Details");
        System.out.print("     Enter Choice : ");
        ch = s.nextInt();
        switch(ch)
        {
            case 1:
                a.parentsDetails();
                break;
            case 2:
                a.studentsDetails();
                break;
        }
    }
    public void parentsDetails()
    {
        JFrame j = new JFrame("Admission Form");
        j.setLayout(null);
        
        JLabel fname = new JLabel("First Name : ");
        fname.setBounds(30, 30,100, 25);
        j.add(fname);
        JTextField fnt = new JTextField();
        fnt.setBounds(200, 30, 200, 25);
        j.add(fnt);
        
        JLabel mname = new JLabel("Middle Name : ");
        mname.setBounds(30, 70, 100, 25);
        j.add(mname);
        JTextField mnt = new JTextField();
        mnt.setBounds(200, 70, 200, 25);
        j.add(mnt);
        
        JLabel lname = new JLabel("Last Name : ");
        lname.setBounds(30, 110, 100, 25);
        j.add(lname);
        JTextField lnt  = new JTextField();
        lnt.setBounds(200,110,200,25);
        j.add(lnt);
        
        JLabel mob = new JLabel("Mobile No : ");
        mob.setBounds(30,150, 100, 25);
        j.add(mob);
        JTextField mobt =new JTextField();
        mobt.setBounds(200, 150, 200, 25);
        j.add(mobt);
        
        JLabel email = new JLabel("Email ID ");
        email.setBounds(30, 190, 100, 25);
        j.add(mobt);
        JTextField mailt = new JTextField();
        mailt.setBounds(200, 190, 200, 25);
        j.add(mobt);
        
        j.setBounds(450, 0 , 550, 765);
        j.setVisible(true);
    }
    
    public void studentsDetails()
    {
        
    }
    
}








