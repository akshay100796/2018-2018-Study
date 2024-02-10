/*
package File_ByDurgaSir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class UserInfo 
{
    
    public static void main(String[] args) throws IOException
    {
        int rn,pin,age;
        String fname,lname,city,town;
        double mrks;  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Roll No : ");
        rn = Integer.parseInt(br.readLine());
        System.out.print("Enter First Name : ");
        fname = br.readLine();
        System.out.print("Enter Last Name : ");
        lname = br.readLine();
        System.out.print("Enter Marks : ");
        mrks = Double.parseDouble(br.readLine());
        System.out.print("Enter City  : ");
        city = br.readLine();
        System.out.print("Enter Town  : ");
        town = br.readLine();
        System.out.print("Enter Pin   : ");
        pin = Integer.parseInt(br.readLine());
        File f = new File("StudentDetail.txt");
        f.createNewFile();
        PrintWriter pw = new PrintWriter(f);
        pw.print("Roll No : ");pw.print(rn);
        pw.print("\nName : "); pw.print(fname+" ");pw.print(lname);
        pw.print("\nMarks : ");pw.print(mrks);
        pw.print("\nAddress : ");pw.print(city+" ");pw.print(town+", ");pw.print(pin);
        System.out.println("Detail Entered Successfully");
        pw.flush();
        pw.close();
        br.close();      
        FileReader fr = new FileReader("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\StudentDetail.txt");
        BufferedReader b = new BufferedReader(fr);
        int i = b.read();
        while (i != -1) 
        {            
            System.out.print(b.read());
            i = b.read();
        }
        b.close();
    }
}
*/
package File_ByDurgaSir;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserInfo 
{
    
    public static void main(String[] args) throws IOException
    {
        int rn,pin,age;
        String fname,lname,city,town;
        double mrks;  
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        rn = s.nextInt();
        System.out.print("Enter First Name : ");
        fname = s.next();
        System.out.print("Enter Last Name : ");
        lname = s.next();
        System.out.print("Enter Marks : ");
        mrks = s.nextDouble();
        System.out.print("Enter City  : ");
        city = s.next();
        System.out.print("Enter Town  : ");
        town = s.next();
        System.out.print("Enter Pin   : ");
        pin = s.nextInt();
        
        try (PrintWriter pw = new PrintWriter("StudentDetail.txt")) 
        {
            pw.print("Roll No : ");pw.print(rn);
            pw.print("\nName : "); pw.print(fname+" ");pw.print(lname);
            pw.print("\nMarks : ");pw.print(mrks);
            pw.print("\nAddress : ");pw.print(city+" ");pw.print(town+", ");pw.print(pin);
            System.out.println("Detail Entered Successfully");
            pw.flush();
            pw.close();
        }
        FileReader f = new FileReader("StudentDetail.txt");
        BufferedReader br = new BufferedReader(f);
        int i = br.read();
        while (i != -1) 
        {            
            System.out.print((char)i);
            i = br.read();
        }
        br.close();
        
    }
}









































