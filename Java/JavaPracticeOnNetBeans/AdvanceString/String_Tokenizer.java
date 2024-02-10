
/*
  ------------> StringTokenizer
  
  With one Parameter --->  StringTokenizer st = new StringTokenizer(s);
  
  With Two Parameter --->  StringTokenizer st = new StringTokenizer(s , " ");
  
  With Three Parameter---> StringTokenizer st = new StringTokenizer(s , " " , false);
 
 */


/*
With One Parameter --- > StringTokenizer st = new StringTokenizer(s);
-------------------------------------------------------------------
    package AdvanceString;
    import java.util.StringTokenizer;

    public class String_Tokenizer 
    {
        public static void main(String[] args)
        {
           String s = "Hi I am Akshay Pawar Student of SVIT Chincholi Nashik";

           StringTokenizer st = new StringTokenizer(s, "-");
         
           while(st.hasMoreTokens())
           {
               String t = st.nextToken();
               System.out.println(t);
           }
        }
    }
    
________________________________________________________________________________*/

/*
    With two Parameter --------> StringTokenizer st = new StringTokenizer(s, " ");
    ------------------------------------------------------------------------------


package AdvanceString;

import java.util.StringTokenizer;

public class String_Tokenizer
{
    public static void main(String[] args)
    {
        String s = "I-am-Akshays-Pawars-Students-of-SVIT-Chincholi-Nashiks";
        StringTokenizer st = new StringTokenizer(s,"-");
        while(st.hasMoreTokens())
        {
            String str = st.nextToken();
            System.out.println(str.endsWith("s"));
        }
    }
}
________________________________________________________________________________*/
/*
    With two Parameter --------> StringTokenizer st = new StringTokenizer(s, " " , false);
    -------------------------------------------------------------------------------------

package AdvanceString;

import java.util.StringTokenizer;

public class String_Tokenizer
{
    public static void main(String[] args) 
    {
        String s = "I-am-Akshays-Pawars-Students-of-SVIT-Chincholi-Nashiks"; 
        StringTokenizer st = new StringTokenizer(s, "-", true);
        while(st.hasMoreTokens())
        {
            String str = st.nextToken();
            System.out.print(str+"  ");
        }
    }
}
________________________________________________________________________________
    
        nextToken();
        nextToken(delimeter);
---------------------------------------------->

package AdvanceString;

import java.util.StringTokenizer;

public class String_Tokenizer
{
    public static void main(String[] args) 
    {
        String s = "S s";
        String str =  "Hi-I-am-Akshay Pawar-Student-of-SVIT Chincholi-Nashik";
        StringTokenizer st = new StringTokenizer(str);
        
        while (st.hasMoreElements()) 
        {
            String x = st.nextToken("-");
            System.out.println(x);
            
        }
        
    }
} 
*/

