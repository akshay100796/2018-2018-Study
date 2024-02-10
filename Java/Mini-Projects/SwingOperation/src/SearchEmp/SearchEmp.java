
package SwingOperation.src.SearchEmp;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class SearchEmp extends RetriveData
{

    public SearchEmp() throws UnsupportedLookAndFeelException,SQLException
    {
        super();
        String url = "jdbc:mysql://localhost/javadb";
        String user = "root";
        String pass = "Akshay";
        JLabel strg;
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(0, 60, 500, 550);
        f.add(p);
        Connection c = DriverManager.getConnection(url,user,pass);
        Statement s = c.createStatement();
        search.addActionListener((ActionEvent e) -> 
        {
             p.repaint();
            String txt = searchFild.getText();
            String slct = "select * from student where id = "+txt;
            try{
                p.repaint();
                ResultSet set = s.executeQuery(slct);
                while(set.next())
                {
                    p.repaint();
                    String name = set.getString("id")+"     "+set.getString("fname")+"      "+set.getString("lname")+"      "+set.getString("dept")+"       "+set.getString("pincode");
                    JLabel str = new JLabel(name);
                    str.setBounds(30, 100, 300, 50);
                    p.add(str);
                }
            }catch(SQLException e1){e1.getMessage();}   
        });
    }
}
