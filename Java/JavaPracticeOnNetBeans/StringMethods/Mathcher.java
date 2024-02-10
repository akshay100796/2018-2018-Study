/**
 *  String line = " Strings ";
 *  Pattern p = Pattern.compile("Target String");
 *  Matcher m = p.matcher(line);                    
 * _____________________________________________________________________________
 *  I think Matcher is Nested Class  OR  
 * 
 *  Class Pattern
 *  {
 *      Class Matcher
 *      {
 *         
 *      }
 * 
 *     public static Pattern compile(String regex)
 *     {
 *          
 *     }
 * 
 *  }
 * 
 *  Pattern p = new Pattern("String");
 * 
 *  Pattern.Matcher matcher = p.new Matcher();  
 * _____________________________________________________________________________
 */

package StringMethods;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Mathcher 
{
    public static void main(String[] args) 
    {
        String line = "I am a programmer working as a software engineer ,I will be a enginneer as a programmer";
        Pattern p = Pattern.compile("programmer");        
        Matcher m = p.matcher(line);
        
        
        System.out.println(" p = "+p);              //  p = programmer
        System.out.println("\n m = "+m);            //  m = java.util.regex.Matcher[pattern=programmer region=0,87 lastmatch=]
    }
}



/*
 
 
package StringMethods;

public class All_String_Methods 
{
    public static void main(String[] args)
    {
        String line = "Akshay is Best";
        String name = "Akshay is good , Akshay is Best, Akshay is Awesome,Akshay is 2 good";
        System.out.println("line.matches(name)  :  "+line.matches(name));                       //false
        System.out.println("name.matches(line)  :  "+name.matches(line));                       //false
        System.out.println("");
        System.out.println("line.matches(line)  :  "+line.matches(line));                       //true
        System.out.println("name.matches(name)  :  "+name.matches(name));                       //true
    }
}

*/