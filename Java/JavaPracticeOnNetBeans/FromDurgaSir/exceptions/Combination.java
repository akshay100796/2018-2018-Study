
package generalOld.src.ExeptionByDurgaSir;

public class Combination 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println(10/0);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        
        try
        {
            String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException n)
        {
            System.out.println("Unable to find Length");
        }
    }
}
