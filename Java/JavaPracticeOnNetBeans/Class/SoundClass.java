

/*
ERROR : Sound Doesnot Play

Default Path : C:\Users\Akshay\Documents\NetBeansProjects\general\build\classes\Applets\OldTele.mp3
*/

package Applets;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SoundClass extends Applet implements ActionListener
{
    AudioClip sound;
    Button p,l,s;
    

    @Override
    public void init()
    {
        sound = getAudioClip(getDocumentBase(),"OldTele.au");
        
        p = new Button("Play");
        l = new Button("Loop");
        s = new Button("Stop");
        
        p.addActionListener(SoundClass.this);
        l.addActionListener(SoundClass.this);
        s.addActionListener(SoundClass.this);
        
        
        add(p);
        add(l);
        add(s);
        
       
        
    }
    @Override
    public void paint(Graphics g){}
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == p)
        {
            sound.play();
        }
        if(e.getSource() == l)
        {
            sound.loop();
        }
        if(e.getSource() == s)
        {
            sound.stop();
        }
        
        repaint();
    }
}




























