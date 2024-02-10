/*
package Applets;

import java.applet.Applet;
import java.awt.Graphics;

public class ObjectClass extends Applet
    {
        String s = "Programmer Akshay Pawar";
        @Override
        public void paint(Graphics g)
        {
            for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            g.drawString("Name : "+c, 100, 100+10*i);
        }
    }
}
*/

/*
    input = "Programmer Akshay Pawar"
    
    output 1 = Programmer Akshay Pawar
    output 2 = Programmer Pawar Akshay
    output 3 = Akshay Programmer Pawar
    output 4 = Akshay Pawar Programmer
    output 5 = Pawar Akshay Programmer
    output 6 = Pawar Programmer Akshay
    
*/

package Applets;

import java.applet.Applet;
import java.awt.Graphics;

public class ObjectClass extends Applet 
{
    String s = "Programmer Akshay Pawar";
    String FirstName,SecondName,ThirdName;

    @Override
    public void init()
    {
        setSize(800,500);
    }
    @Override
    public void paint(Graphics g)
    {
        
        FirstName = s.substring(0, 10);
        SecondName = s.substring(11,18);
        ThirdName = s.substring(18);
        g.drawString("First  Name = "+FirstName, 50, 40);   //Programmer 
        g.drawString("Second Name = "+SecondName, 50, 60); // Akshay
        g.drawString("Third  Name = "+ThirdName, 50, 80);  // Pawar
        
        String output1 = s;
        //String output1 =  FirstName+" "+SecondName+" "+ThirdName;  
        String output2 = FirstName+" "+ThirdName+" "+SecondName;
        String output3 = SecondName+" "+FirstName+" "+ThirdName;
        String output4 = SecondName+" "+ThirdName+" "+FirstName;
        String output5 = ThirdName+" "+SecondName+" "+FirstName;
        String output6 = ThirdName+" "+FirstName+" "+SecondName;
 
        g.drawString("Output-1 : "+output1, 50 , 110);
        g.drawString("Output-2 : "+output2, 50 , 130);
        g.drawString("Output-3 : "+output3, 50 , 150);
        g.drawString("Output-4 : "+output4, 50 , 170);
        g.drawString("Output-5 : "+output5, 50 , 190);
        g.drawString("Output-6 : "+output6, 50 , 210);
        g.drawString("Output-1 uppar Case : "+output1.toUpperCase(), 50 , 250);
        g.drawString("Output-2 Lower Case : "+output2.toLowerCase(), 50 , 270);
        g.drawString("Output-3 concat : "+output3.concat(" XXXXXXXXXXX"), 50 , 290);
        g.drawString("Output-4 : "+output4.replace("Programmer", "Scientist"), 50 , 310);
        g.drawString("Output-5 : "+output5.substring(5), 50 , 330);
        g.drawString("Output-6 : "+output6.toString(), 50 , 350);
    }    
}
