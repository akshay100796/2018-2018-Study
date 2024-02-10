
package Exeption;

public class ExeptionError 
{
    public static void main(String[] args) 
    {
        try
        {
            int a = 15;
            int b = 0;
            int d = a/b; 
            System.out.println("try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Reachable Block"); 
        }
        catch(Exception e)
        {
            System.err.println("Can't Devide by Zero ");
        }
    }
}
