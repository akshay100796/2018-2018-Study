
package AboutMouse;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ToolTipDemo extends JFrame
{
    JButton b;
    public ToolTipDemo(){
        JFrame f = new JFrame();
        f.setBounds(100, 100, 500, 600);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        
        b = new JButton("Start");
        b.setToolTipText("Hello Akshay");
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button get Clicked");
                if(b.getText().equals("Start"))
                {
                    b.setText("Stop");
                }
                else
                {
                    b.setText("Start");
                }
                
            }
        });
        
    }
    public static void main(String[] args) {
        ToolTipDemo p = new ToolTipDemo();
    }
   
}
