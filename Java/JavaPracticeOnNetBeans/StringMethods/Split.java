
package StringMethods;

public class Split 
{
    public static void main(String[] args)
    {
        String line = "Akshay@Pawar@9657513437@Sinnar";
        String temp[];
        temp = line.split("\\@");
        System.out.println("First Name : "+temp[0]);
        System.out.println("Last  Name : "+temp[1]);
        System.out.println("Mobile No  : "+temp[2]);
        System.out.println("Address    : "+temp[3]);
    }
}
/**
 *  Extras : split(regEx)
 *  
 *      String line = "Akshay+Pawar+9657513437+Sinnar";
 *      String temp[] = line.split("\\+");                 Split by plus(+)
 *          
 *      String line = "Akshay-Pawar-9657513437-Sinnar";
 *      String temp[] = line.split("\\-");                 Split by hypen(-)
 * 
 *      String line = "Akshay*Pawar*9657513437*Sinnar";
 *      String temp[] = line.split("\\*");                 Split by astetik(*)
 * 
 *      String line = "Akshay/Pawar/9657513437/Sinnar";    Split by forwordSlash(/)
 *      String temp[] = line.split("\\/"); 
 * 
 *      String line = "Akshay=Pawar=9657513437=Sinnar";     Split by Equal(=)
 *      String temp[] = line.split(\\=);
 * 
 *      String line = "Akshay.Pawar.9657513437.Sinnar";     Split by Dot(.)
 *      String temp[] = line.split(\\.);                    
 *      .
 *      .
 *      .
 *      .
 *      .
 *      .  Similarly  Split by (! @ # $ % ^ & * ( )_ - + = { } [ ] : ;" ' | \ < , >. ? / 0-9)
 * 
 * 
 */
//______________________________________________________________________________

/**
* 
* public class All_String_Methods
    {
        public static void main(String[] args)
        {
            String line = "Akshay-Pawar-9657513437-Sinnar";
          // Limits    =  " 1    -  2  -   3      -  4   ";
            String temp[];
            temp = line.split("-",2);
            System.out.println("First Name : "+temp[0]); // limit 1
            System.out.println("Last  Name : "+temp[1]); // limit 2
        }
    }


    /**
     * 
     *  System.out.println("Mobile No  : "+temp[2]); // limit 3 , 
     *  System.out.println("Address    : "+temp[3]); // limit 4
     *                 
     *  if you uncomment it then ArrayIndexOutOfBoundExeption will Occur
     * 
     * 
     * line.split("-" , 2)  
     * 
     *      Here 2 is the Limit i.e.  you can split line String up to 2 times
     * 
     *  o/p  -->  Akshay
     *            Pawar-9657513437-Sinnar
     * 
     */




