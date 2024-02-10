
package Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VovelChecks extends Applet implements ActionListener
{
    Label vovelCheck;
    TextField vovelInput;
    char vovel;
    Button button;
    @Override
    public void init() 
    {
        vovelCheck = new Label("Check Character is Vovels or Consonent");
        add(vovelCheck);
        
        vovelInput = new TextField(5);
        add(vovelInput);
        
        button = new Button("Check for Vovels");
        add(button);
        
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        vovel = vovelInput.getText().charAt(0);
        repaint();
    }
    public void paint(Graphics g)
    {
        switch(vovel)
        {
            case 'a':
            case 'A':
                g.drawString(vovel+" is Vovel", 50, 150);
                break;
            case 'e':
            case 'E':
                g.drawString(vovel+" is Vovel", 50, 150);
                break;
            case 'i':
            case 'I':
                g.drawString(vovel+" is Vovel", 50, 150);
                break;
            case 'o':
            case 'O':
                g.drawString(vovel+" is Vovel", 50, 150);
                break;
            case 'u':
            case 'U':
                g.drawString(vovel+" is Vovel", 50, 150);
                break;
            default:
                g.drawString(vovel+" is Consonent", 50, 150);
                break;
        }
    }
    

}
