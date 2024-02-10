package Singleton;

import java.util.Scanner;

public class CreateAccount
{
    static CreateAccount ca;
    String name;
    int age;
    
    void intput()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\tEnter Name : ");
        name = s.next();
        System.out.print("\tEnter Age  : ");
        age = s.nextInt();
    }
    
    void output()
    {
        System.out.println("\tName  : "+name);
        System.out.println("\tAge   : "+age);
    }
    private CreateAccount() {}
    
    public static CreateAccount getInstance()
    {
        if(ca == null)
        {
            ca = new CreateAccount();
        }
        return ca;
    }
    
}








/*
public class CreateAccount
{
    static CreateAccount ca;
    
    private CreateAccount() {}    
    
    public static CreateAccount getAccount()
    {
        return ca;
    }
}

*/