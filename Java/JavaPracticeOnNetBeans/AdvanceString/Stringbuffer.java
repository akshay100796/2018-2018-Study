
package AdvanceString;
public class Stringbuffer 
{
    public static void main(String[] args) 
    {
        System.out.println("\nDefault Parameter");
        StringBuffer sb1 = new StringBuffer();     
        System.out.println("length  =  "+sb1.length());
        System.out.println("capacity = "+sb1.capacity());
        
        System.out.println("\nPassing String as \"Akshay\"");
        StringBuffer sb2 = new StringBuffer("Akshay");
        System.out.println("length  =  "+sb2.length());
        System.out.println("capacity = "+sb2.capacity());
        
        System.out.println("\nPassing Capacity as 25");
        StringBuffer sb3 = new StringBuffer(25);
        System.out.println("length  =  "+sb3.length());
        System.out.println("capacity = "+sb3.capacity());
        
    }
}
