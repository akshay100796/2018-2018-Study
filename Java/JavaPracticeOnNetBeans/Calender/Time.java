package Calender;

import java.util.Calendar;

public class Time 
{
    public static void main(String[] args) 
    {
        Calendar c = Calendar.getInstance();
        int hh = c.get(Calendar.HOUR);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int am = c.get(Calendar.PM);
        
        int day = c.get(Calendar.DATE);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        
        System.out.println("It is ");
        System.out.print(hh+" o'Clock, "+mm+" minute, "+ss+" Seconds on ,"+day+" "+Calendar.MONTH+" "+year);
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
        
        
        

        //System.out.println(hh+":"+mm+":"+ss);
        //System.out.println(day+"/"+(month+1)+"/"+year);
    }
}
