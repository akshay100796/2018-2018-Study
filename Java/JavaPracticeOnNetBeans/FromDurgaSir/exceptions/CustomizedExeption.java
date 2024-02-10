
package generalOld.src.ExeptionByDurgaSir;

public class CustomizedExeption 
{
    public static void main(String[] args) 
    {
        try 
        {
            System.out.println(10/0);
            //Riskey Code
        }
        catch (ArithmeticException e) 
        {
            System.out.println(10/2);
            //handling Code
        }
    }
}
