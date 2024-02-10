package Jframe.src.jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame
{
    GUI()
    {
        JFrame jf = new JFrame("Register Here...");
        jf.setLayout(null);
        
        ImageIcon i = new ImageIcon("Usr.png");
        JLabel user = new JLabel(i);
        user.setBounds(100, 50, 50, 50);
        jf.add(user);
        
        jf.setBounds(250, 50, 750, 600);
        jf.setBackground(Color.gray);
        jf.setVisible(true);
    }
    public static void main(String[] args) 
    {
        GUI g = new GUI();
    }
}
