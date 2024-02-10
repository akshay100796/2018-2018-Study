package InheritPoly;

import java.util.Scanner;

public class Address
    {
        String State,City,Town;
        int pin;
        Scanner s = new Scanner(System.in);
        void input()
        {
            System.out.print("Enter State : ");
            State = s.next();
            System.out.print("Enter City  : ");
            City = s.next();
            System.out.print("Enter Town  : ");
            Town = s.next();
            System.out.print("Enter Pincode : ");
            pin = s.nextInt();
        }
        String output()
        {
            return Town+", "+City+", "+State+", "+pin;
        }
    } 
