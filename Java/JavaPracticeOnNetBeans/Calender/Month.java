 /**
  * 
  * MONTH Declaration : 
         * if month goes out of December then it create new Month from January with new year
         * Current month is June (value of JUNE is  5) 
         * we add 10 month more in Current Month then Resultant Month is 6+10 = 16 
         * i.e. JUNE = 5 , JULY = 6 , AUGUST = 7 SEPT  = 8 OCT = 9 NOV = 10 DEC = 11 JAN = 12 FEB = 13 MARCH = 14 APRIL=15
         * Calendar.JANUARY = 0;
         * Calendar.DECEMBER = 11;
         * 
         * According to real life calendar June appear at 6 No Hence Adding 10 more gives April 
         * 
         */



package Calender;

import java.util.Calendar;
/*
public class Month 
{
    public static void main(String[] args) 
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime()+"\n\n");
        
            int a = Calendar.JUNE;
             System.out.println(a+10);   
            c.add(Calendar.MONTH, 10);     
            //refer MONTH Declaration
        System.out.println(c.getTime());
    }
}
__________________________________________________________
public class Month 
{
    public static void main(String[] args) 
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("\n");
        c.add(Calendar.JANUARY, 5);
        System.out.println(c.getTime());
    }
}
*/
public class Month {
public static void main(String[] args) 
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime()+"\n\n");
        
        //c.add(Calendar.JANUARY, 10);        //No Effect
        //c.add(Calendar.FEBRUARY, 10);           //2028
        //c.add(Calendar.MARCH, 10);              //13 April 2029
        c.add(Calendar.APRIL, 5);
        System.out.println(c.getTime());            
    }    

}
