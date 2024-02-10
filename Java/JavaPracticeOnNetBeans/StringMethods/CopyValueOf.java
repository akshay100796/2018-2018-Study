/**
 * 
 * -----> copyValueOf(arrName)
 * 
 * -----> copyvalueOf(arrName , copyFrom (Ex -> 0) , copyTo+1 (Ex -> 5+1))
 * 
 */

package StringMethods;

public class CopyValueOf 
{
    public static void main(String[] args) 
    {
        char ch[] = {'A','k','s','h','a','y',' ','P','a','w','a','r'};
        String cpy = "";
        cpy = cpy.copyValueOf(ch);
        System.out.println(cpy);
        
        
        String copy = "";
        copy = copy.copyValueOf(ch, 0, 6);
        System.out.println(copy);
    }
}
