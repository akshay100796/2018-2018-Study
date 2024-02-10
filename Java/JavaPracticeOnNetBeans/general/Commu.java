
package general;

import javax.swing.JOptionPane;

public class Commu 
{
    public void chatting(String guest)
    {
        String[] Ques = {"What is your name" , "What is your hobbies" }; 
        for(int i=0;i<=4;i++)
        {
            if(i%2==0)
            {
                JOptionPane.showInputDialog(guest+" : ");
            }
            else
            {
                JOptionPane.showInputDialog(Ques[i]+":");
            }
            
        }
        
    }
    public static void main(String[] args)
    {
        Commu c = new Commu(); 
        
        String user = JOptionPane.showInputDialog("Enter Username ");
        String passwd = JOptionPane.showInputDialog("Enter Password ");
        if(user.equals("Akshay123") && passwd.equals("Akshay"))
        {
            JOptionPane.showMessageDialog(null,"login successfull");
            String guest = JOptionPane.showInputDialog("Enter guest Name ");
            c.chatting(guest);
            System.out.println("Thanks for Chatting with me : \'"+guest+"\'");
        }
    }
}
