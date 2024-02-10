package UnanthExeption;

import java.util.Scanner;


class AgeNotSupportedException extends RuntimeException
{

    public AgeNotSupportedException(String s)
    {

    }
    
}
public class OwnThrow 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int age;
        System.out.println("Enter Age : ");
        age = s.nextInt();
        try
        {
            if(age < 18)
            {
                throw new AgeNotSupportedException("");
            }
            System.out.println("You Can Happyly vote");
        }
        catch(AgeNotSupportedException e)
        {
            System.out.println("You are under 18");
        }
    }
}
