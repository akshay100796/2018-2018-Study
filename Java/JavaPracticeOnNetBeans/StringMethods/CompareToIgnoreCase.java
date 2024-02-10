/**
 *  ------------->  compareToIgnoreCase()
 * 
 */

package StringMethods;

import java.util.Scanner;

public class CompareToIgnoreCase 
{
    public static void main(String[] args)
    {
        String fname,sname;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Name  :  ");
        fname = s.nextLine();
        System.out.print("Enter Second Name :  ");
        sname = s.next();
        if(fname.compareToIgnoreCase(sname)==0)
        {
            System.out.println("Match Found by Ignoring Case");
        }
        else
        {
            System.out.println("Diffrent Strings");
        }
        
        
        
    }
}
