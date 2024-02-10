
package AboutMouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class MousedDemo extends JFrame implements MouseListener
{
     int x,y;
    
    public MousedDemo()
    {
        JFrame f = new JFrame("Akshay");
        f.setLayout(null);
        f.setBounds(100, 100, 500, 500);
        f.addMouseListener(this);      
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse Clicked at : ("+e.getX()+", "+e.getY()+")");
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse Released at : ("+e.getX()+", "+e.getY()+")");
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse Entered at : ("+e.getX()+", "+e.getY()+")");
    }
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse Exited at : ("+e.getX()+", "+e.getY()+")");
    }
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed at : ("+e.getX()+", "+e.getY()+")");
    }
    
    
    public static void main(String[] args) {
        MousedDemo p = new MousedDemo();
    }
}
