
package generalOld.src.ExeptionByDurgaSir;

class AgeNotSupportedExeption extends RuntimeException
{

    public AgeNotSupportedExeption(String s)
    {
        super(s);
    }
    
}
public class ThrowKeyword 
{
        public static void main(String[] args) 
        {
            int age = 15;
            if(age < 18)
            {
                throw new AgeNotSupportedExeption("Illegal Age Encountered");
            }
        }    
}
