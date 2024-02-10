
package JavaFrame.src.GETSET;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Show extends JFrame
{
    String Fname ,Lname,Mobile;
    JLabel fname,lname,mob,FT,LT,MT;
    public Show(String Fname, String Lname, String Mobile)
    {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Mobile = Mobile;
    }
    public void Display()
    {
        JFrame jf = new JFrame("Your Information");
        jf.setLayout(null);
        
        fname = new JLabel("First Name:");
        fname.setBounds(50, 50, 150, 30);
        jf.add(fname);
        FT = new JLabel(Fname);
        FT.setBounds(150, 50, 150, 30);
        jf.add(FT);
        
        lname = new JLabel("Last Name:");
        lname.setBounds(50, 100, 150, 30);
        jf.add(lname);
        LT = new JLabel(Lname);
        LT.setBounds(150, 100, 150, 30);
        jf.add(LT);
        
        mob = new JLabel("Mobile No");
        mob.setBounds(50, 150, 150, 30);
        jf.add(mob);
        
        MT = new JLabel(Mobile);
        MT.setBounds(150, 150, 150, 30);
        jf.add(MT);
        
        JButton bt = new JButton("OK");
        bt.setBounds(150, 230, 150, 30);
        jf.add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jf.dispose();
            }
        });
        jf.setBounds(300, 0, 500, 700);
        jf.setVisible(true);
        
        
    }
      public static void main(String[] args) 
    {
       new Show("A", "P", "96").Display();
    }
}
