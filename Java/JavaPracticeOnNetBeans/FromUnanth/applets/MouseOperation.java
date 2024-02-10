
package Applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseOperation extends Applet implements MouseListener,MouseMotionListener
{
    int x,y;
    String event ;
    @Override
    public void init() 
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Mouse "+event+" at ("+x+", "+y+")", x, y);
       // g.fillOval(x, y, 30, 10);
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e)
    {
        showStatus("Cursor Inside the Applet Area");
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        event = "Pressed";
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        event = "Released";
        repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        event = "Clicked";
        repaint();
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        showStatus("Cursor Outside the Applet Area");
    }
    @Override
    public void mouseMoved(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        event = "Moving";
        repaint();
    }
    @Override
    public void mouseDragged(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        event = "Dragging";
        repaint();
    }
    
    @Override
    public void update(Graphics g)
    {
        paint(g);   
    }
}
