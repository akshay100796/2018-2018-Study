
package JavaFrame.src.GETSET;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Take extends JFrame
{
    JLabel fname,lname,mob;
    JTextField fnameT,lnameT,mobT;
    Settle S;
    public Take() throws HeadlessException 
    {
        JFrame j= new JFrame("Sign Up");
        j.setLayout(null);
        
        fname = new JLabel("First Name:");
        fname.setBounds(50, 50, 150, 30);
        j.add(fname);
        fnameT = new JTextField();
        fnameT.setBounds(150, 50, 150, 30);
        j.add(fnameT);
        
        
        lname = new JLabel("Last Name:");
        lname.setBounds(50, 100, 150, 30);
        j.add(lname);
        lnameT = new JTextField();
        lnameT.setBounds(150, 100, 150, 30);
        j.add(lnameT);
        
        mob = new JLabel("Mobile No");
        mob.setBounds(50, 150, 150, 30);
        j.add(mob);
        mobT  = new JTextField();
        mobT.setBounds(150, 150, 150, 30);
        j.add(mobT);
        
        JButton b = new JButton("Submit");
        b.setBounds(150, 230, 100, 30);
        j.add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {                
                S.setFname(fnameT.getText());           
                S.setMob(lnameT.getText());
                S.setMob(mobT.getText());
                new Show(fnameT.getText(),lnameT.getText(),mobT.getText()).Display();
            }
        });
        
        j.setBounds(300, 0, 500, 700);
        j.setVisible(true);
    }
    
    
    
    public static void main(String[] args) 
    {
       Take t = new Take();
    }
}
