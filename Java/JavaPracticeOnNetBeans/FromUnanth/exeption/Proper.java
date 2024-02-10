
package UnanthExeption;

import java.util.Scanner;

public class Proper 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a,b,c=0;
        String name;
        System.out.print("Enter Name : ");
        name = s.next();
        System.out.print("Enter Divident : ");
        a = s.nextInt();
        System.out.print("Enter Deviser : ");
        b = s.nextInt();
        try{
            c = a/b;
            System.out.println("Division : "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.print("Please Enter Valid Divizer : ");
            b = s.nextInt();
            try{
                c = a/b;
            }
            catch(ArithmeticException ae){
                System.out.println(e.getMessage());
            }
            System.out.println("Division : "+c);
        }
        
        System.out.println("Name     : "+name);
        
     
       

    }
}
