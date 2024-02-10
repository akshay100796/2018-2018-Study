/**
 *  String to Character Array---------> Method (1)  by ------> " toCharArray() " Method
 *  
 *  String to Character Array---------> Method (2)  by ------> "charAt()" Method
 * 
*/

/*--------------------------------Method (1)-----------------------
        package ExtraProgramms;

        public class StringToChar 
        {
            public static void main(String[] args) 
            {
                String s = "Akshay@Pawar92792";
                char c[] = s.toCharArray();
                for(char ch : c)
                    System.out.println(ch);
            }
        }
*/
/*--------------------------------Method (1)-----------------------*/
package ExtraProgramms;

public class StringToChar
{
    public static void main(String[] args) 
    {
        String s = "Akshay@Pawar92792";
        for(int i=0;i<s.length();i++)
        { 
            char arr = s.charAt(i);
            System.out.println(arr);
        }
    }
}