
package Singleton;

public class Singleton 
{
    public static void main(String[] args) 
    {
        CreateAccount ca = CreateAccount.getInstance();     //  CreateAccount ca = ca;
        CreateAccount ca1 = CreateAccount.getInstance();
        System.out.println("ca Input");
        ca.intput();
        System.out.println("ca output");
        ca.output();
        System.out.println("\n_____________________________");
        System.out.println("ca1 Input");
        ca1.intput();
        System.out.println("ca1 Output");
        ca1.output();
        System.out.println("\n_____________________________");
        System.out.println("ca output");
        ca.output(); 
    }
}
