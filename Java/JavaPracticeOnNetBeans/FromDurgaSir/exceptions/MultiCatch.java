
package generalOld.src.ExeptionByDurgaSir;

public class MultiCatch 
{
    public static void main(String[] args)
    {
        String name=null ;
        try
        {
            System.out.println(5/2);
            System.out.println(name.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("/ by zero");
        }
        catch(NullPointerException n)
        {
            System.out.println("Define Object");
        }
        
        finally{
            System.out.println("finally block invoke");
        }
        
    }
    
}
