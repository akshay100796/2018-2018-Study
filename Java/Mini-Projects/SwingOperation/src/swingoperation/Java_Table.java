
/*

table Heading does not display 

*/
package SwingOperation.src.swingoperation;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Java_Table extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Table");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 600);
        
        String[][] data = {
            {"1","C"},
            {"2","C++"},
            {"3","Java"},
            {"4","PHP"},
            {"5","MySQL"},
            {"6","JavaScript"}
        };
        
        String[] clm = {"SrNo","Language"};
        
        JTable t = new JTable(data,clm);
        t.setBounds(100, 100, 150, 100);
        j.add(t);
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
