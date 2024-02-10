package AnnonymousClass;

import java.util.Scanner;

class Food
{
    public void Veg(int n)
    {
        System.out.println("Some person are also veg");
    }
    public void nonVeg(char c)
    {
        System.out.println("Some person are also Non-veg");
    }
}
public class Annonymous 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Annonymous a = new Annonymous()
        {
            public void Life()
            {
                System.out.println("We got only one life ,Eat whatever you want");
            }
        };
        Food f = new Food();
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        int x = s.nextInt();
        if(x == 1)
            f.nonVeg('A');
        else
            f.Veg(1);
        System.out.println("See you Again...!");
        
    }
}
