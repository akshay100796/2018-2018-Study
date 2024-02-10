package InheritPoly;

import java.util.Scanner;

public class anyDate
    {           
        int dd,mm,yyyy;
        Scanner s = new Scanner(System.in);
        void input()
        {
            System.out.print("Enter Day (1-30/31) : ");
            dd = s.nextInt();
            System.out.print("Enter Month (1-12)  : ");
            mm = s.nextInt();
            System.out.print("Enter year (1980-2030) : ");
            yyyy = s.nextInt();        
        }
        String output()
        {
            return dd+"/"+mm+"/"+yyyy;
        }      
    }
