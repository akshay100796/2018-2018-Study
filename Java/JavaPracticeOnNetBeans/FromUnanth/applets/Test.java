
package Applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Test extends Applet
{
    Color c;
    Font f;
    @Override
    public void init()
    {
        setSize(800, 500);          //it is window size  setSixe(x , y);
        c = new Color(0,0,0,200);    // Color (r , g , b , Visibility<0 to 255>) 0 = Appx. Invisible & 255 = Clearly visible
        f = new Font("Times New Roman", Font.LAYOUT_NO_START_CONTEXT, 50); //Font("Any Name of Font" , (int)Style , FontSize);
    }
    
    @Override
    public void paint(Graphics g)
    { 
        g.setColor(c);     //set font Color
        g.setFont(f);      // set font
        g.drawString("Programmer Dr. Akshay Pawar" , 100, 250); //drawString("String to be Display" , x , y);   Note : x & y is the location, where string to be appear in Applet window
    }
}
