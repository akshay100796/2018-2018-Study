/**
 *  
 * --------> charAt()
 * 
 */

package StringMethods;

public class CharAt 
{
    public static void main(String[] args) 
    {
        String fname,mname,lname;
        fname = "Akshay";
        mname = " Sunil";
        lname = " Pawar";
        char fch,mch,lch;
        fch = fname.charAt(0);                          //fch = A
        mch = mname.charAt(1);                          //mch = S
        lch = lname.charAt(1);                          //lch = P
        System.out.println(fch+" "+mch+" "+lch);
        
        /**
         * Extra : 
         * 
         * fname = "Akshay";
         * 
         * fname.charAt(0); -----> A 
         * fname.charAt(1); -----> k
         * fname.charAt(2); -----> s   
         * fname.charAt(3); -----> h
         * fname.charAt(4); -----> a   
         * fname.charAt(5); -----> y
         * 
         * 
         */
    }
}
