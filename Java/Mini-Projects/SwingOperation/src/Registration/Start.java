package SwingOperation.src.Registration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Start extends UserDetailsForm
{

    public Start() throws Exception 
    {
        String url = "jdbc:mysql://localhost/userdetail";
        String user = "root";
        String pass = "Akshay";
        Connection c = DriverManager.getConnection(url,user,pass);
        Statement s = c.createStatement();  
    }
    
}
