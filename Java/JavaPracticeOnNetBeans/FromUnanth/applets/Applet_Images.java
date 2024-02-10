
package Applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Applet_Images extends Applet 
{
    Image Lockimg;
    Image Androidimg;
    @Override
    public void init() 
    {
        setSize(1300, 600);
        
        Lockimg = getImage(getDocumentBase(),"Lock.jpg");
        Androidimg = getImage(getDocumentBase(),"Android.jpg");
        
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(Lockimg, 50, 50,300,300,Color.LIGHT_GRAY, this);
        int w,h;
        w = getWidth();
        h = getHeight();
        g.drawString("W = "+w, 50, 500);
        g.drawString("H = "+h, 50, 520);
        g.drawImage(Androidimg, 400,50, 500 , 500, this);
        
        
    }

}
