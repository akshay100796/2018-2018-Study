
package Calender;

import java.util.Calendar;

public class Clock 
{
    public static void main(String[] args) 
    {
        Calendar c = Calendar.getInstance();
        int hh = c.get(Calendar.HOUR_OF_DAY);
        
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND); 
        int day = c.get(Calendar.DATE);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
 
        if(hh>12)
            System.out.println("Good Afternoon Akshay");
        else if(hh<12)
            System.out.println("Good Morning Akshay");
        else
            System.out.println("Good Evening Akshay");
        System.out.println("It is ");
        System.out.print(hh+" O'Clock, "+mm+" Minute, "+ss+" Seconds, on ");
        switch(month+1)
        {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;    
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;    
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;    
            case 10:
                System.out.print("Octomber");
                break;
            case 11:
                System.out.print("November");
                break;    
            case 12:
                System.out.print("December");
                break;
        }
        System.out.print(" "+day+" "+year+"\n");
    }
}
