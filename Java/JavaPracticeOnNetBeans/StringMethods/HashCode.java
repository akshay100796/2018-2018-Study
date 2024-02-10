
package StringMethods;

public class HashCode 
{
    public static void main(String[] args) 
    {
        String n1 = "Akshay";
        String n2 = "akshay";
        String s = new String("Engineer");
        
        System.out.println("hashCode of n1  : "+n1.hashCode());
        System.out.println("hashCode of n2  : "+n2.hashCode());
        System.out.println("hashCode of s   : "+s.hashCode());
        System.out.println(n1);
        System.out.println(n2);
        n2 = n1;
        System.out.println("hashCode of n1  : "+n1.hashCode());
        System.out.println("hashCode of n2  : "+n2.hashCode());
        System.out.println(n1);
        System.out.println(n2);
    }
}
