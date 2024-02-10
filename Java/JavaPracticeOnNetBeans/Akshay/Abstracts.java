
package Akshay;
import javax.swing.JOptionPane;
import java.util.Scanner;

public abstract class Abstracts 
{
    abstract int read();
    abstract int write();
}
abstract class move
{
    int x;
    int y;
    int c;
    
    int read()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First No : ");
        x = s.nextByte();
        System.out.println("Enter Second No : ");
        y = s.nextByte();
        return 0;
    }
    int write()
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        c =x+y;
        System.out.println("Addition is  : "+c);        
        return 0;
    }
    public static void main(String[] args) 
    {
        move m = new move() {};
        m.read();
        m.write();
        System.out.println("______END_______");
    }
}
interface Error
{
    boolean msg_err();
    boolean sys_err();
    boolean server_err();
}

interface WebPage
{
    int page_fault();
    int page_address();
    int server_fault();
}
abstract class Remove_Error implements Error
{
    static boolean err_msg;
    @Override
    public boolean msg_err()
    {
        err_msg = false;
        return err_msg; 
    }
    @Override
    public boolean sys_err()
    {
        err_msg = false;
        return err_msg; 
    }
    @Override
    public boolean server_err()
    {
        err_msg = false;
        return err_msg; 
    }
    public static void main(String[] args) throws IndexOutOfBoundsException
    {
        
        Scanner s = new Scanner(System.in);
        String msg;
        Remove_Error re = new Remove_Error(){};
        System.out.println("Enter your Massage : ");
        msg = s.nextLine();
        re.msg_err();
        if(err_msg==false)
        {
            System.err.println("Could not send massage");
        }
        re.sys_err();
        if(err_msg==false)
        {
            System.err.println("System Error Occure");
        }
        re.server_err();
        if(err_msg==false)
        {
            System.err.println("Server 404 Not Found");
        }
        JOptionPane.showMessageDialog(null,"You got too much Error please press Ok to Fix Massage Error");
        err_msg = true;
        System.out.println("Massage has been Send");
        JOptionPane.showMessageDialog(null,"Very good ,Now Fix Server Error");
        err_msg = true;
        System.out.println("Server Found at 0Xf55Aec43Fa  Location");
        JOptionPane.showMessageDialog(null,"Now Fix System Error");
        err_msg = true;
        System.out.println("Your Antiovirus out of Date , Please Renew and enjoy ");
        String newMsg = JOptionPane.showInputDialog(null,"Enter New Massage ");
        System.out.println("Your massage has been send");   
    }    
}


















































