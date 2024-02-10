package SwingOperation.src;


import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UserInput extends Thread
{
    Timer t;
    JLabel idL,fnameL,lnameL,deptL,pinL;
    TextField idT,fnameT,lnameT,deptT,pinT;
    JButton submit,cancel;
    static int ID,Pin;
    static String Fname,Lname,Dept;
    public static void store() throws SQLException
    {
        String url = "jdbc:mysql://localhost/javadb";
        String user = "root";
        String pass = "Akshay";
        String insrt = "insert into student value("+ID+",\""+Fname+"\",\""+Lname+"\",\""+Dept+"\","+Pin+");";
        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement st = conn.createStatement();
        int v = st.executeUpdate(insrt);
    } 
    public UserInput() throws HeadlessException,SQLException
    {
        JFrame j = new JFrame("Input Field");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 600);
        Font f = new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 40);
        JLabel wel = new JLabel("Welcome...!");
        wel.setFont(f);
        wel.setBounds(160, 30, 200, 30);
        j.add(wel);
        idL = new JLabel("Employee ID : ");
        idL.setBounds(100, 100, 100, 30);
        j.add(idL);
        idT = new TextField();
        idT.setBounds(200, 100, 70, 25);
        j.add(idT);
        
        fnameL = new JLabel("First Name : ");
        fnameL.setBounds(100,150,100,30);
        j.add(fnameL);
        fnameT = new TextField();
        fnameT.setBounds(200, 152, 100, 25);
        j.add(fnameT);
        
        lnameL = new JLabel("Last Name : ");
        lnameL.setBounds(100, 200, 100, 30);
        j.add(lnameL);
        lnameT = new TextField();
        lnameT.setBounds(200, 200, 100, 30);
        j.add(lnameT);
        
        deptL = new JLabel("Department : ");
        deptL.setBounds(100, 250, 100, 30);
        j.add(deptL);
        deptT = new TextField();
        deptT.setBounds(200, 250, 150, 30);
        j.add(deptT);
        
        pinL = new JLabel("Pincode : ");
        pinL.setBounds(100, 300, 100, 30);
        j.add(pinL);
        pinT = new TextField();
        pinT.setBounds(200, 300, 100, 30);
        j.add(pinT);
        
        submit = new JButton("Submit");
        submit.setBounds(200, 350, 100, 30);
        j.add(submit);
        
        submit.addActionListener((e) -> 
        {
            submit.setEnabled(false);

            ID  = Integer.parseInt(idT.getText());
            Fname = fnameT.getText();
            Lname = lnameT.getText();
            Dept = deptT.getText();
            Pin = Integer.parseInt(pinT.getText());
            try{store();}catch(SQLException sql){sql.printStackTrace();}
            JOptionPane.showMessageDialog(j, "Data Inserted Successfully");
            j.dispose();
        });     
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    public static void main(String[] args) throws SQLException
    {
        UserInput u = new UserInput();
    }
}
