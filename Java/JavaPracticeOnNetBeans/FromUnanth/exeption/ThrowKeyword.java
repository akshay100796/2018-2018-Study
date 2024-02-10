/*
package UnanthExeption;

public class ThrowKeyword 
{
    static void Display()
    {
        try{
            throw new ArithmeticException("/ by hero");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Akshay : "+e);
        }
    }
    public static void main(String[] args) 
    {
        Display();
    }
}

________________________________________________________________________________
*/
package UnanthExeption;

public class ThrowKeyword 
{
    static void Display()
    {
        try{
            throw new NullPointerException("Null value assigning");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPtr : "+e);
        }
    }
    public static void main(String[] args) 
    {
        try {
            Display();
        } catch (Exception e) 
        {
            System.out.println("main() Exeption  : "+e);
        }
    }
}