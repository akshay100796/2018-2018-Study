
package MultiFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstFrame extends JFrame implements ActionListener
{
    JPanel p1,p2;
    JButton nxt;
    public FirstFrame() 
    {
        JFrame j = new JFrame("First Frame");
        j.setBounds(100, 100, 500, 500);
        
        p1 = new JPanel();
        p1.setBackground(Color.GRAY);
        p1.setBounds(50, 50, 400, 400);
        j.add(p1, BorderLayout.SOUTH);
        
        p2 = new JPanel();
        p2.setBackground(Color.RED);
        p2.setBounds(50, 50, 400, 400);
        j.add(p2);
        
        
        
        nxt = new JButton("Next");
        nxt.setBounds(50, 100, 100, 50);
        p1.add(nxt);
        nxt.addActionListener(this);
        
        
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.WHITE);
    }
    
    
    public static void main(String[] args) {
        FirstFrame f = new FirstFrame();
    }
}
















/*
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstFrame extends JFrame implements ActionListener
{
    
    JPanel p1 = new JPanel();
    JButton click = new JButton("Next");
    JLabel txt = new JLabel("Button get Clicked");
    public FirstFrame() 
    {
        JFrame j = new JFrame("First Window");
        
        p1.setBackground(Color.red);
      
        txt.setForeground(Color.BLACK);
        txt.setVisible(false);
        p1.add(txt);
        
        click.addActionListener(this);
        
        j.add(p1, BorderLayout.CENTER);
        j.setSize(400, 400);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        txt.setVisible(true);
        p1.setBackground(Color.red);
        p2.setBackground(Color.BLACK);
    }
    
    public static void main(String[] args) {
        FirstFrame f = new FirstFrame();
    }
}
*/