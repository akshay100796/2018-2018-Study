
package Exeption;

public class MultiCatch 
{
    public static void main(String[] args) 
    {
        int[] rn = new int[5];
        try
        {
            System.out.println(rn[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Limit your Cross \n Limit 5");
        }
    }
}
