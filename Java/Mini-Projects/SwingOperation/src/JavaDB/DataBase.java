/*
package JavaDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase 
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost/javadb";
        String user = "root";
        String passwd = "Akshay";
      
        Connection conn = DriverManager.getConnection(dbUrl,user,passwd);
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("Select * from student where lname = \"Pawar\"; ");
        System.out.println("id\tfname\tlname\tdept");
        System.out.println("______________________________________");
        while (rs.next())
        {            
            
            System.out.println(rs.getString("id")+"\t"+rs.getString("fname")+"\t"+rs.getString("lname")+"\t"+rs.getString("dept"));
        }
    }
}
*/
package SwingOperation.src.JavaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase
{
    public static void main(String[] args) throws SQLException
    {
        String url = "jdbc:mysql://localhost/javadb";
        String user = "root";
        String pass = "Akshay";
        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement s = conn.createStatement();
        int r = s.executeUpdate("insert into student value(107,\"Akshay\", \"Pawar\",\"IT\" )");
        ResultSet rs = s.executeQuery("Select * from Student");
        while(rs.next())
        {
            System.out.println(rs.getString("id")+"\t"+rs.getString("fname")+"\t"+rs.getString("lname")+"\t"+rs.getString("dept"));
        }
    }
}










