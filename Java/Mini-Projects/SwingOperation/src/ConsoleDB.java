package SwingOperation.src;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleDB 
{
    public static void main(String[] args) throws SQLException
    {
        int pincode,id;
        String fname,lname,dept;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Employee ID : ");
        id = s.nextInt();
        System.out.print("Enter First Name : ");
        fname = s.next();
        System.out.print("Enter Last Name : ");
        lname = s.next();
        System.out.print("Enter Department : ");
        dept = s.next();
        System.out.print("Enter Pincode : ");
        pincode = s.nextInt();
        
        String url = "jdbc:mysql://localhost/javadb";
        String user = "root";
        String pass = "XXXXXX";
        String insrt = "insert into student value("+id+",\""+fname+"\",\""+lname+"\",\""+dept+"\","+pincode+");";
        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement st = conn.createStatement();
        int r = st.executeUpdate(insrt);
        
        
    }
}























