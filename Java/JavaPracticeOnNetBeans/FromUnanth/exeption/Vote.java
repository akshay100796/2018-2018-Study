
package VoteException;

import java.util.Scanner;

public class Vote 
{
    public static void main(String[] args) 
    {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Age : ");
        age = s.nextInt();
        
        try
        {
            if(age < 0 )
            {
                throw new NegativeAgeException("Negative Age");
            }
            if(age > 18 )
            {
                System.out.println("Perfect Age For Voting");
            }
            if(age < 18)
            {
                throw new AgeNotSupportedException("Age is under 18");
            }
        }
        catch(NegativeAgeException n)
        {
            System.out.println(n.getMessage());
        }
        catch(AgeNotSupportedException a)
        {
            System.out.println(a.getMessage());
        }
    }
}
