package NestedClass;

import java.util.Scanner;

public class NestedClass 
{
     int rn;
    String name;
    double mrk;
    Scanner s = new Scanner(System.in);
    
 //-----------------------------------------------------------------------------   
    
    class Address
    {
        String state,city,town;
        int pin;
        
        void input()
        {
            System.out.print("Enter State   : ");
            state = s.next();
            System.out.print("Enter City    : ");
            city = s.next();
            System.out.print("Enter Town    : ");
            town = s.next();
            System.out.print("Enter Pincode : ");
            pin = s.nextInt();
        }
        void output()
        {
            System.out.println(state+", "+city+", "+town+", "+pin);
        }
        
    }
    
   //--------------------------------------------------------------------------- 
    
    
    void input()
    {
        System.out.print("Enter Roll No : ");
        rn = s.nextInt();
        System.out.print("Enter Name    : ");
        name = s.next();
        System.out.print("Enter mrks    : ");
        mrk = s.nextDouble();
        System.out.print("Enter Address : \n");
        //addr.input();
    }
    void output()
    {
        System.out.println("Roll No : "+rn);
        System.out.println("Name    : "+name);
        System.out.println("Marks   : "+mrk);
    }
    public static void main(String[] args) 
    {
        NestedClass r = new NestedClass();
        NestedClass.Address addr = r.new Address();
        r.input();
        addr.input();
        r.output();
        addr.output();
        
    }
    
    
    
}
