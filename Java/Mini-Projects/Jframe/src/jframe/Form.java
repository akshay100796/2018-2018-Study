
package Jframe.src.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Form extends JFrame
{    
    public static void main(String[] args) 
    {
        
        JFrame jf = new JFrame("Akshay's Private layout");
        jf.setLayout(null);

        JLabel fn = new JLabel("First Name : ");
        fn.setBounds(50, 50, 100, 50);
        jf.add(fn);
        
        JLabel sn = new JLabel("Second Name : ");
        sn.setBounds(50,80,100,50);
        jf.add(sn);
        
        JLabel mail = new JLabel("Email : ");
        mail.setBounds(50, 110, 100, 50);
        jf.add(mail);

        
        
        JTextField tfn = new JTextField();
        tfn.setBounds(150, 65, 200, 20);
        jf.add(tfn);
        
        JTextField tsn = new JTextField();
        tsn.setBounds(150, 95, 200, 20);
        jf.add(tsn);
        
        JTextField ml= new JTextField();
        ml.setBounds(150, 130, 200, 20);
        jf.add(ml);
        
        ImageIcon i = new ImageIcon("C:\\Users\\Akshay\\Desktop\\Usr.gif");
        JButton sbmt = new JButton(i);
        sbmt.setBounds(150, 170, 100, 80);
        jf.add(sbmt);
        sbmt.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null,"First Name : "+tfn.getText()+"\n Second Name : "+tsn.getText()+"\n Email : "+ml.getText());
            }
        });
        
        jf.setBounds(341, 150, 682, 382);
        jf.setVisible(true);
    }
    
}
