
package AdvanceString;

public class Stringbuilder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Akshay   ");
        System.out.println("length B4 trim : "+sb.length());
        sb.trimToSize();
        System.out.println("length after trim  : "+sb.length());
        System.out.println(sb);
        
    }
}
