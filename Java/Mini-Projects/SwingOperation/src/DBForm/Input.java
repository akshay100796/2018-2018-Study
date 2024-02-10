
package SwingOperation.src.DBForm;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Input extends JFrame
{

    JLabel firstLabel,LastLabel,ageLabel;
    public Input() throws Exception
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        JFrame j = new JFrame("Registration Form");
        j.setLayout(null);
        //j.setExtendedState(JFrame.MAXIMIZED_BOTH);
        j.setBounds(0, 0, 1360, 760);       
        JPanel p = new JPanel();
        p.setBounds(10, 50, 680, 760);
        
        
        
        
        
        
        
        //------------------------------------------------------------------------
        
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
        
    }
    
    
    public static void main(String[] args) throws Exception
    {
        Input i = new Input();
    }
}
