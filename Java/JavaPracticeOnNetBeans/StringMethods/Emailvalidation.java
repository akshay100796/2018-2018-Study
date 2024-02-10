
package StringMethods;

import java.util.Scanner;

public class Emailvalidation
{
    public static void main(String[] args) 
    {
        String email;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcomw to Email Validator");
        System.out.print("Enter Email ID  :  ");
        email = s.nextLine();
        if(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com") || email.endsWith("@yahoo.com"))
        {
            System.out.println("\n\nEmail ID : \""+email+"\" is VALID");
        }
        else
        {
            System.out.println("Invalid Email ID");
        }
        
                
    }
}
