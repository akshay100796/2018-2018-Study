
package Applets;

import java.applet.Applet;
import java.awt.Graphics;

public class ForWhile extends Applet 
{
    int x = 20;
    int y = 20;
    
    @Override
    public void init() 
    {
        
    }
    @Override
    public void paint(Graphics g)
    {
        for(int i = 0 ; i< 30 ; i++)
        {
            g.drawString(""+i, 50+x*i, 50+y*i);
        }
        int i = 0;
        while (i < 50)
        {            
            g.drawString(""+i, 100+x*i, 50);
            i++;
        }
    }

}
