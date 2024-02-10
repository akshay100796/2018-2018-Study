/**
 * 
 * -----------> compareTo()
 * 
 */
package StringMethods;

public class CompareTo 
{
    public static void main(String[] args) 
    {
        String name1 = "Akshay";
        String name2 = "AKSHAY";
        String name3 = "AKSHay";
        int n1,n2,n3;
        n1 = name1.compareTo(name2);
        n2 = name2.compareTo(name3);
        n3 = name1.compareTo(name3);
        
        System.out.println(name1+" == "+name2+"  : "+n1);
        System.out.println(name2+" == "+name3+"  : "+n2);
        System.out.println(name1+" == "+name3+"  : "+n3);
        
        String line1 = "    Akshay Pawar ";
        String line2 = "    Akshay Pawar ";
        System.out.println(line1.compareTo(line2));
    }
}
