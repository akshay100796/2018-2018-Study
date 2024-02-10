/**
 * 
 * Programm to check Enter Character is Valid Character or Nor (a-z  ||  A-Z)  
 * 
 * Own mind Programme
 * 
 */
package ExtraProgramms;

import java.util.Scanner;

public class CheckChar 
{
    public static void main(String[] args) 
    {
        char c;
        int f =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Character : ");
        c = s.next().charAt(0);
        for(int i=65;i<=90;i++) 
        {
            if(c == i)
            {
                f = 1;
                System.out.println(c+" is Uppar Case Character");
                break;
            }
        }
        for(int i=97;i<=122;i++)
        {
            if(c == i)
            {   
                f = 1;
                System.out.println(c+" is Lower Case Character");
                break;
            }
        }
        if(f == 1)
        {
            System.out.println("you Found it");
        }
        else
        {
            System.out.println("Entered Character is Not Valid Character Between (a-z) OR (A-Z)");
        }
    }
}
