package Jframe.src.jframe;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

class SwingPractice extends JFrame
{

    public SwingPractice() throws HeadlessException 
    {
        JButton b = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("C:/user/Akshay/Desktop"));
        fc.setDialogTitle("D Home Directory");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.showOpenDialog(b);
    }
    
    
    
    public static void main(String[] args) 
    {
        SwingPractice sp = new SwingPractice();
    }
}















/*
 JFrame f = new JFrame();
        f.setLayout(null);       
        f.setBounds(300, 0, 700, 600);
        f.setVisible(true);

*/







/*

j.setLayout(null); 
        j.setBounds(300, 0,700,700);
        j.setVisible(true);
*/

















/*
JButton b = new JButton("Click");
        b.setBounds(100, 300, 100, 50);
        j.add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("Position  :"+s.getValue());
            }
        });
     
*/