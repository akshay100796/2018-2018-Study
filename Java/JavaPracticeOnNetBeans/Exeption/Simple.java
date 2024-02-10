
package Exeption;

public class Simple 
{
    public static void main(String[] args) 
    {
        int a = 12,b=0;
        double c = 0;
        try
        {
            c = a / b;
            System.out.println("Akshay");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't devide by Zero");
            System.out.println(e);
        }
        finally{
            System.out.println("c = "+c);
        }
    }
}
