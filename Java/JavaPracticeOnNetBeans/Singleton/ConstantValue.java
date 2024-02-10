
package Singleton;

public class ConstantValue 
{
    static ConstantValue cv;
    
    void ShowValues()
    {
        System.out.println("Name        :  Akshay");
        System.out.println("Age         :  22");
        System.out.println("Mobile No.  :  9657513437");
        System.out.println("Email ID    :  pawarakshay13@gmail.com");
        System.out.println("Height      :  158 CM");
        System.out.println("Weight      :  65.8 Kg");
        System.out.println("Occupation  :  Student");
        System.out.println("\nInternet Detail : \n");
        System.out.println("Facebook ID :  https://www.facebook.com/akshay.pawar.777701");
        System.out.println("Twitter  ID :  https://twitter.com/pawarakshay247");
    }
    private ConstantValue() {}
    
    public static ConstantValue getValues()
    {
        if(cv == null)
        {
            cv = new ConstantValue();
        }
        return cv;
    }
}
