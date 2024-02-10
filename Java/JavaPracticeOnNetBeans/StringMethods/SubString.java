
/***
 * 
 *  substring(FromIndex);
 *  substring(FromIndex , ToIndex);
 * 
 */

package StringMethods;

public class SubString 
{
    public static void main(String[] args) 
    {
        String name = "AkshayPawar";
        
        String sub = name.substring(3);         //hayPawar
        System.out.println(sub);
        
        String S = name.substring(3, 9);
        System.out.println(S);
    }
}
