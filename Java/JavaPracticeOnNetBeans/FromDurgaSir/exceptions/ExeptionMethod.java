package generalOld.src.ExeptionByDurgaSir;

public class ExeptionMethod
{    
    public static void main(String[] args) 
    {
        try 
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();       
                    //java.lang.ArithmeticException: / by zero 
                    //at ExeptionByDurgaSir.ExeptionMethod.main(ExeptionMethod.java:9) 
            
            System.out.println(e.toString());
                     //java.lang.ArithmeticException: / by zero
                     
            System.out.println(e.getMessage());  
                        /// by zero
        }
    }
}