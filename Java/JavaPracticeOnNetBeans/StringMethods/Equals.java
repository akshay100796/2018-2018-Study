/**
 * Cover Following Mwthods
 * --------->  length()
 * --------->  equals()
 * --------->  equalsIgnoreCase()
 * 
 * 
 */


package StringMethods;

import java.util.Scanner;

public class Equals 
{
    public static void main(String[] args) 
    {
        String fname,sname;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name  :  ");
        fname = s.nextLine();
        System.out.println("Enter Second Name :  ");
        sname = s.nextLine();
    
        int fl = fname.length();
        int sl = sname.length();
        System.out.println("length of "+fname+" is : "+fl);
        System.out.println("length of "+sname+" is : "+sl);
        
        if(fname.equalsIgnoreCase(sname))
        {
            System.out.println("Same Name");
        }
        else
        {
            System.out.println("Diffrent Name");
        }
        
        System.out.println(fname+" & "+sname+" are Equal  : "+(fname.equals(sname)));
        System.out.println(fname+" & "+sname+" by (Ignoring Case) , are Equals  : "+(fname.equalsIgnoreCase(sname)));
    }
}
