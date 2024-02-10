/**
 * 
 * --------> concat() 
 * 
 */

package StringMethods;

public class Concat 
{
    public static void main(String[] args) 
    {
        String fname = "Akshay";                        //String fname = Akshay
        String mname = " Sunil";                        //String mname = Sunil
        String concat = fname.concat(mname);            //String concat = Akshay Sunil
        String lname = concat.concat(" Pawar");         //String lname = Akshay Sunil Pawar
        System.out.println("Full Name is : "+lname);    //Full Name is : Akshay Sunil Pawar  --------> O/P
        
    }
}
