/*
package swingoperation;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Akshay Private Frame");
        f.setLayout(null);
        f.setBounds(400, 100, 600, 500);
        f.setBackground(Color.YELLOW);
        Font ft = new Font("Lobster", Font.BOLD, 30);
        JLabel name = new JLabel("Akshay");
        name.setBounds(250, 150, 150, 40);
        name.setForeground(Color.red);
        name.setFont(ft);
        f.add(name);
        //f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);        
    }
}
________________________________________________________________________________

package swingoperation;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class SwingOperation extends JFrame
{
    public SwingOperation()
    {
        JFrame j = new JFrame("My Frame");
        j.setLayout(null);
        j.setBounds(400, 100, 600, 500);
        ImageIcon i = new ImageIcon("C:\\Users\\Akshay\\Downloads\\LoginUser.png");
        JButton b = new JButton(i);
        b.setBounds(100, 100, 50, 50);
        j.add(b);
        JButton submit = new JButton("Submit");
        submit.setBounds(400, 100, 130, 60);
        submit.setMnemonic(66);
        //submit.setEnabled(false);
        Font ft = new Font("Lobster", Font.BOLD, 30);
        submit.setFont(ft);
        System.out.println(submit.getText()); //Submit
        j.add(submit);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);  
    }
    public static void main(String[] args) 
    {
        SwingOperation s = new SwingOperation();
    }
}
________________________________________________________________________________

package swingoperation;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("For Texting");
        j.setLayout(null);
        j.setBounds(400, 100, 600, 500);
        
        JTextField text = new JTextField();
        text.setBounds(300, 100, 150, 25);
        j.add(text);
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
Lable , TextField , Button

package swingoperation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SwingOperation extends JFrame
{
    static String value;
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("My Frame");
        j.setLayout(null);
        j.setBounds(400, 100, 600, 500);
        Font f = new Font("Times New Roman", Font.PLAIN, 20);
        JLabel name = new JLabel("Name : ");
        name.setFont(f);
        name.setBounds(100, 90, 100, 50);
        j.add(name);
        
        JTextField text = new JTextField();
        text.setBounds(200, 100, 100, 30);
        j.add(text);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(200 , 180, 100, 30);
        j.add(submit);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(320 , 180, 100, 30);
        j.add(cancel);
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
        
        submit.addActionListener((ActionEvent e) ->
        {
                value = text.getText();
                //JOptionPane.showMessageDialog(null, "You Entered "+value);
                submit.setEnabled(false);
                JLabel name1 = new JLabel();
                name1.setBounds(150, 300, 300, 50);
                name1.setText("You Entered : "+value);
                j.repaint();    
                j.add(name1);    
        });
        cancel.addActionListener((ActionEvent e) -> 
        {System.exit(0); });       
    }
}
________________________________________________________________________________

package swingoperation;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
public class SwingOperation extends JFrame
{
    public SwingOperation() throws BadLocationException 
    {
        JFrame j = new JFrame("Text Area");
        j.setLayout(null);
        j.setBounds(400, 100, 600, 600);
        JTextArea a = new JTextArea("Comment\nhere...",2,10);     
        a.setLineWrap(true);
        a.setBounds(50, 50, 200, 100);
        a.insert("Akshay", 15);
        a.append(" Pawar");
        a.setEditable(false);         //by default it is true
        //a.setEnabled(false);          //by default it is true
        //a.selectAll();
        a.select(0, 15);
        a.setTabSize(20);
        //System.out.println(a.getLineCount());
        System.out.println(a.getLineEndOffset(1));   //return ascii code of \ Escape character 27
        System.out.println(a.getLineStartOffset(1));
        j.add(a);        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);       
    }
    public static void main(String[] args) throws BadLocationException
    {
       SwingOperation s = new SwingOperation();
    }
}
________________________________________________________________________________

package swingoperation;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Password Field");
        j.getContentPane().setBackground(Color.GRAY);
        j.setLayout(null);
        j.setBounds(400, 100, 600, 600);
        j.setBackground(Color.RED);
        JLabel user = new JLabel("Password : ");
        user.setBounds(100, 100, 80, 30);
        j.add(user);
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(200, 100, 200, 30);
        j.add(pass);
        
        JButton b = new JButton("Submit");
        b.setBounds(200, 170, 100, 30);
        b.setBackground(Color.WHITE);
        j.add(b);
        
        b.addActionListener((ActionEvent e) -> 
        {
            String pswd = String.valueOf(pass.getText());
            //System.out.println(pswd);
            JLabel name = new JLabel(pswd);
            name.setBounds(200, 250, 500, 30);
            name.setText("Password is  : "+pswd);
            j.repaint();
            b.setEnabled(false);
            j.add(name);
        });
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }    
}
________________________________________________________________________________

package swingoperation;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingOperation extends JFrame
{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("Check Box");
        j.setLayout(null);
        j.setBounds(400, 100, 600, 600);
        
        JCheckBox c1 = new JCheckBox("Engineer");
        JCheckBox c2 = new JCheckBox("Doctor");
        JCheckBox c3 = new JCheckBox("Writer");
        c1.setBounds(100, 100,80,30);
        c2.setBounds(100, 130, 80, 30);
        c3.setBounds(100, 160, 80, 30);
        j.add(c1);
        j.add(c2);
        j.add(c3);
        
        JButton b = new JButton("Select");
        b.setBounds(100, 200, 80, 30);
        j.add(b);
        
        b.addActionListener((ActionEvent e) -> 
        {
            if(c1.isSelected())
            {
                String engg = c1.getText();
                JLabel Engg = new JLabel(engg);
                Engg.setBounds(100, 250, 100, 30);
                Engg.setText("You are "+engg);
                j.add(Engg);
                j.repaint();
            }
            if(c2.isSelected())
            {
                String dr = c2.getText();
                JLabel doct = new JLabel(dr);
                doct.setBounds(100, 280, 100, 30);
                doct.setText("You are "+dr);
                j.add(doct);
                j.repaint();
            }
            if(c3.isSelected())
            {
                String wri = c3.getText();
                JLabel Writer = new JLabel(wri);
                Writer.setBounds(100, 310, 100, 30);
                Writer.setText("You are "+wri);
                j.add(Writer);
                j.repaint();
            } 
        });    
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
package swingoperation;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Radio Button");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 600);
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(100, 100, 55, 30);
        r2.setBounds(160, 100, 70, 30);
        ButtonGroup g = new ButtonGroup();      
        g.add(r1);
        g.add(r2);
        j.add(r1);
        j.add(r2);
        JButton b = new JButton("getGender");
        b.setBounds(100, 150, 100, 30);
        j.add(b);
        b.addActionListener((ActionEvent e) ->{    
            if(r1.isSelected())
            {
                String s = r1.getText();
                JLabel gend = new JLabel();
                gend.setBounds(100, 300, 100, 30);
                gend.setText("Gender : "+s);
                j.add(gend);
                j.repaint();
            }
            else
            { 
                String s = r2.getText();
                JLabel gend = new JLabel();
                gend.setBounds(100, 300, 100, 30);
                gend.setText("Gender : "+s);
                j.add(gend);
                j.repaint();
            }       
        });
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________

package swingoperation;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Drop Down List");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 600);
        
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        JComboBox c = new JComboBox(days);
        c.setBounds(100, 100, 100, 30);
        j.add(c);
        
        c.addItem("Akshay");
        c.addItem("Jaguar");
        JButton b = new JButton("Submit");
        b.setBounds(100, 150, 80, 30);
        j.add(b);
        
        b.addActionListener((ActionEvent e) -> {
            String day = (String)c.getSelectedItem();
            //JOptionPane.showMessageDialog(j, ""+day);
            JLabel txt = new JLabel(day);
            txt.setBounds(100, 200, 150, 30);
            txt.setText("you Choose : "+day);
            j.add(txt);
            j.repaint();
            c.removeItem(day);
            
        });
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
  
package swingoperation;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class SwingOperation extends JFrame
{
    public SwingOperation()
    {
        JFrame j = new JFrame("Table in JAVA");
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
        t.setBounds(100, 100, 300, 100);
        JScrollPane sp = new JScrollPane(t);
        sp.add(t);
        j.add(t);     
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingOperation s = new SwingOperation();
    }
}
________________________________________________________________________________

package swingoperation;

import javax.swing.JFrame;
import javax.swing.JList;

public class SwingOperation extends JFrame
{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("List");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 600);
        String[] code = {"C","C++","JAVA","PHP","HTML","CSS","JavaScript","MySQL","NnSQL","MongoDB"};
        JList l = new JList(code);
        l.setBounds(100, 100, 100, 200);
        j.add(l);
        
       
--------> Applicable at Popup menu

DefaultListModel m = new DefaultListModel();
m.addElement("Akshay");
m.addElement("Sunil");
m.addElement("Pawar");
l.setModel(m);              for this you display only this element
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________

package swingoperation;

        * JOPtionPane Methods (All Method are Static)
            -showInputDialog
            -showConfirmDialog
            -showInternalConfirmDialog
            -showInternalInputDialog
            -showInternalMessageDialog
            -showInternalOptionDialog
            -showMessageDialog
         
        * JoptionMessageType (int)
            -ERROR_MESSAGE       (0)
            -INFORMATION_MESSAGE (1)
            -WARNING_MESSAGE     (2)
            -QUESTION_MESSAGE    (3)
            -PLAIN_MESSAGE       (-1)
        
        * OptionType (int)
            -DEFAULT_OPTION (-1)
            -CLOSE_OPTION   (-1)
            -YES_NO_OPTION  (0)
            -OK_OPTION      (0)
            -YES_OPTION     (0)
            -YES_NO_CANCEL_OPTION (1)
            -NO_OPTION      (1)
            -OK_CANCEL_OPTION (2)
            -CANCEL_OPTION  (2)

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingOperation extends JFrame
{
    public static void main(String[] args) throws HeadlessException
    {
        JFrame j = new JFrame("JOptionPane");
        j.setBounds(400, 100, 500, 600);
        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        ImageIcon icon = new ImageIcon("C:\\Users\\Akshay\\Desktop\\Android.png");
        //JOptionPane.showInputDialog("Enter Value");
        //JOptionPane.showInputDialog(j, "Akshay");
        //JOptionPane.showInputDialog("Enter Name","Akshay");   //(" Msg Type" , "Initial Value" || Initial No);
        //JOptionPane.showInputDialog(j, "Akshay", "Title", JOptionPane.INFORMATION_MESSAGE, icon, alpha, 10);
        
        //JOptionPane.showConfirmDialog(j,"Akshay");
        //JOptionPane.showConfirmDialog(j,"Akshay","Quit", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showConfirmDialog(j,"Akshay","Quit",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showConfirmDialog(j,"Akshay","Welcome", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icon);
        
        //JPanel p = new JPanel();
        //p.setLayout(null);
        //p.setBounds(100, 100, 100, 80);
        //j.add(p);
        //JOptionPane.showInternalConfirmDialog(p, "Internal");
        //JOptionPane.showInternalConfirmDialog(p, "Internal","Title", JOptionPane.OK_OPTION);
        //JOptionPane.showInternalConfirmDialog(p, "Internal","Title", JOptionPane.NO_OPTION, JOptionPane.WARNING_MESSAGE, icon);
        
        //JOptionPane.showInternalInputDialog(p, "Akshay");
        //JOptionPane.showInternalInputDialog(p, "Akshay","Quit", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showInternalInputDialog(p, "Akshay","Quit", JOptionPane.INFORMATION_MESSAGE, icon, alpha, DISPOSE_ON_CLOSE);
        
        //JOptionPane.showInternalMessageDialog(p, "Akshay");
        //JOptionPane.showInternalMessageDialog(p, "Akshay","Quit", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showInternalMessageDialog(p, "Akshay","Title", JOptionPane.ERROR_MESSAGE, icon);
        //JOptionPane.showInternalOptionDialog(p, "Akshay Pawar", "Title", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, alpha, NORMAL);
        
        //JOptionPane.showMessageDialog(j, "Akshay");  OR JOptionPane.showMessageDialog(j, alpha);
        //JOptionPane.showMessageDialog(j, "Akshay", "Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(j, "Akshay", "Title", JOptionPane.WARNING_MESSAGE,icon);
    }
}
________________________________________________________________________________

package swingoperation;
import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Scroll Bar");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 600);
        
        JScrollBar b = new JScrollBar(JScrollBar.VERTICAL,50, 25, 0, 100);
            //JScrollBar(Orientation , ScrollPosition , SizeOfScroll , min , max);
        b.setBounds(100, 100,15, 200);
        j.add(b);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
package swingoperation;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
public class SwingOperation extends JFrame
{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("File Menu");
        j.setLayout(null);
        j.setBounds(400, 100, 515, 570);
        ImageIcon icon = new ImageIcon("C:\\Users\\Akshay\\Desktop\\Android.png");
        
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 500, 30);
        
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu m4 = new JMenu("Setting");
        JMenu m5 = new JMenu("Help");
        m1.setMnemonic('F');
        m2.setMnemonic('E');
        m3.setMnemonic('V');
        m4.setMnemonic('S');
        m5.setMnemonic('H');
        mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
        j.add(mb);
        
        JMenuItem m11 = new JMenuItem("New");
        
        JMenuItem m12 = new JMenuItem("Open");
        JMenuItem m13 = new JMenuItem("Save");
        JMenuItem m14 = new JMenuItem("Save As");
        JMenuItem m15 = new JMenuItem("Print");
        JMenuItem m16 = new JMenuItem("Exit");
        m11.setMnemonic('N');
        m12.setMnemonic('O');
        m13.setMnemonic('S');
        m14.setMnemonic(65);
        m15.setMnemonic('P');
        m16.setMnemonic('E');
        m1.add(m11);m1.addSeparator();
        m1.add(m12);m1.addSeparator();
        m1.add(m13);m1.addSeparator();
        m1.add(m14);m1.addSeparator();
        m1.add(m15);m1.addSeparator();
        m1.add(m16);
        
        JMenuItem m21 = new JMenuItem("Undo");
        JMenuItem m22 = new JMenuItem("Redo");
        JMenuItem m23 = new JMenuItem("Cut");
        JMenuItem m24 = new JMenuItem("Copy");
        JMenuItem m25 = new JMenuItem("Paste");
        JMenuItem m26 = new JMenuItem("Delete");
        JMenuItem m27 = new JMenuItem("Find");
        JMenuItem m28 = new JMenuItem("Replace");
        JMenuItem m29 = new JMenuItem("SelectAll");
        m21.setMnemonic('U');m22.setMnemonic('R');m23.setMnemonic('C');m24.setMnemonic('C');m25.setMnemonic('P');
        m26.setMnemonic('D');m27.setMnemonic('F');m28.setMnemonic('l');m29.setMnemonic('S');
        m2.add(m21);m2.addSeparator();
        m2.add(m22);m2.addSeparator();
        m2.add(m23);m2.addSeparator();
        m2.add(m24);m2.addSeparator();
        m2.add(m25);m2.addSeparator();
        m2.add(m26);m2.addSeparator();
        m2.add(m27);m2.addSeparator();
        m2.add(m28);m2.addSeparator();
        m2.add(m29);
        
        JMenuItem m31 = new JMenuItem("Font...");
        JMenuItem m32 = new JMenuItem("Size");
        JMenuItem m33 = new JMenuItem("Word Wrap");
        JMenuItem m34 = new JMenuItem("Status Bar");
        JMenuItem m35 = new JMenuItem("Vertical");
        JMenuItem m36 = new JMenuItem("Horizontal");
        m31.setMnemonic('F');m32.setMnemonic('S');m33.setMnemonic('W');
        m34.setMnemonic('B');m35.setMnemonic('V');m36.setMnemonic('H');
        m3.add(m31);m3.addSeparator();
        m3.add(m32);m3.addSeparator();
        m3.add(m33);m3.addSeparator();
        m3.add(m34);m3.addSeparator();
        m3.add(m35);m3.addSeparator();
        m3.add(m36);
        
        JMenuItem m41 = new JMenuItem("Color");
        JMenuItem m42 = new JMenuItem("Font Style");
        JMenuItem m43 = new JMenuItem("Line No");
        JMenuItem m44 = new JMenuItem("Window");
        JMenuItem m45 = new JMenuItem("History");
        m41.setMnemonic('C');m42.setMnemonic('F');m43.setMnemonic('L');m44.setMnemonic('W');m45.setMnemonic('H');
        m4.add(m41);m4.addSeparator();
        m4.add(m42);m4.addSeparator();
        m4.add(m43);m4.addSeparator();
        m4.add(m44);m4.addSeparator();
        m4.add(m45);
        
        JMenuItem m51 = new JMenuItem("Dictionary");
        JMenuItem m52 = new JMenuItem("Refer PDF");
        JMenuItem m53 = new JMenuItem("About");
        JMenuItem m54 = new JMenuItem("Visit");
        m51.setMnemonic('D');m52.setMnemonic('R');m53.setMnemonic('A');m54.setMnemonic('V');
        m5.add(m51);m5.addSeparator();
        m5.add(m52);m5.addSeparator();
        m5.add(m53);m5.addSeparator();
        m5.add(m54);
        
        JTextArea area = new JTextArea();
        area.setBounds(0,28, 500, 500);
        area.setLineWrap(true);
        j.add(area);
       //j.setResizable(false);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}

________________________________________________________________________________

package swingoperation;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class SwingOperation extends JFrame
{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("File Menu");
        j.setLayout(null);
        j.setBounds(400, 100, 515, 570);
        ImageIcon icon = new ImageIcon("C:\\Users\\Akshay\\Desktop\\Android.png");
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 500, 30);
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu m4 = new JMenu("Setting");
        JMenu m5 = new JMenu("Help");
        m1.setMnemonic('F');
        m2.setMnemonic('E');
        m3.setMnemonic('V');
        m4.setMnemonic('S');
        m5.setMnemonic('H');
        mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
        j.add(mb);
        JCheckBoxMenuItem m11 = new JCheckBoxMenuItem("New      Ctrl+N");
        JCheckBoxMenuItem m12 = new JCheckBoxMenuItem("Open     Ctrl+O");
        JCheckBoxMenuItem m13 = new JCheckBoxMenuItem("Save     Ctrl+S");
        JCheckBoxMenuItem m14 = new JCheckBoxMenuItem("Save As  Ctrl+Shift+S");
        JCheckBoxMenuItem m15 = new JCheckBoxMenuItem("Print    Ctrl+P");
        JCheckBoxMenuItem m16 = new JCheckBoxMenuItem("Exit     Alt+X");
        m1.add(m11);m1.add(m12);m1.add(m13);m1.add(m14);m1.add(m15);m1.add(m16);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
package swingoperation;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;
public class SwingOperation extends JFrame 
{
    static int prgs = 0 ;
    public static void main(String[] args)
    {
        JFrame j = new JFrame("Progress Bar");
        j.setLayout(null);
        j.setBounds(400, 100, 600, 400);      
        JProgressBar pb = new JProgressBar(0, 100);
        pb.setStringPainted(true);
        pb.setBounds(100, 100, 400, 30);    
        Button b = new Button("Start");
        b.setBounds(250, 150, 80, 30);
        j.add(b);   
        b.addActionListener((e) -> 
        {
            b.setEnabled(false);
            Timer t = new Timer(50, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                prgs = prgs+1;
                if(prgs>100)
                {
                    ((Timer)e.getSource()).stop();
                }
                pb.setValue(prgs);
            }
        });t.start();
        });        
        j.add(pb);
        pb.setBorderPainted(true);
        pb.setIndeterminate(false);
        pb.setMaximum(100);
        pb.setMinimum(0);
        //pb.setString("Akshay");
        //pb.setStringPainted(false);
        //pb.setValue(prgs);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________

package swingoperation;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Tree");
        j.setLayout(new FlowLayout());
        j.setBounds(400, 100, 500, 500);
        
        DefaultMutableTreeNode tn = new DefaultMutableTreeNode("Education");
        JTree t = new JTree(tn);
        j.add(t);
        
        DefaultMutableTreeNode School = new DefaultMutableTreeNode("School");
        
        DefaultMutableTreeNode Engg = new DefaultMutableTreeNode("Engineering");
        DefaultMutableTreeNode five = new DefaultMutableTreeNode("5th");
        DefaultMutableTreeNode six = new DefaultMutableTreeNode("6th");
        DefaultMutableTreeNode seven = new DefaultMutableTreeNode("7th");
        DefaultMutableTreeNode eight = new DefaultMutableTreeNode("8th");
        DefaultMutableTreeNode nine = new DefaultMutableTreeNode("9th");
        DefaultMutableTreeNode ten = new DefaultMutableTreeNode("10th");
        tn.add(School);School.add(five);School.add(six);School.add(seven);School.add(eight);School.add(nine);School.add(ten);
        
        DefaultMutableTreeNode Collage1 = new DefaultMutableTreeNode("Collage");
        DefaultMutableTreeNode eleven = new DefaultMutableTreeNode("11th");
        DefaultMutableTreeNode twelve = new DefaultMutableTreeNode("12th");
        
        DefaultMutableTreeNode art = new DefaultMutableTreeNode("Arts");
        DefaultMutableTreeNode com = new DefaultMutableTreeNode("Commerce");
        DefaultMutableTreeNode sci = new DefaultMutableTreeNode("Science");
        eleven.add(art);eleven.add(com);eleven.add(sci);
        DefaultMutableTreeNode art12 = new DefaultMutableTreeNode("Arts");
        DefaultMutableTreeNode com12 = new DefaultMutableTreeNode("Commerce");
        DefaultMutableTreeNode sci12 = new DefaultMutableTreeNode("Science");
        twelve.add(art12);twelve.add(com12);twelve.add(sci12);
        tn.add(Collage1);Collage1.add(eleven);Collage1.add(twelve);
        
        DefaultMutableTreeNode fe = new DefaultMutableTreeNode("FE");
        DefaultMutableTreeNode se = new DefaultMutableTreeNode("SE");
        DefaultMutableTreeNode te = new DefaultMutableTreeNode("TE");
        DefaultMutableTreeNode be = new DefaultMutableTreeNode("BE");
        DefaultMutableTreeNode mba = new DefaultMutableTreeNode("MBA");
        tn.add(Engg);
        Engg.add(fe);Engg.add(se);Engg.add(te);Engg.add(be);Engg.add(mba);
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
package swingoperation;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Tree");
        j.setLayout(new FlowLayout());
        j.setBounds(400, 100, 500, 500);
        String[] edu ={"A","B","C","D","E","F","G","H"}; 
        JTree t = new JTree(edu);
        j.add(t);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
package swingoperation;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Color Chooser");
        j.setLayout(new FlowLayout());
        j.setBounds(400, 100, 500, 500);
        
        JColorChooser c = new JColorChooser(Color.yellow);
        j.add(c);
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________

package swingoperation;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Tabb Pane");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 500);
        JLabel name = new JLabel("Akshay Pawar");
        name.setBounds(50, 50, 100, 30);       
        JPanel p = new JPanel();
        JTabbedPane tb = new JTabbedPane(JTabbedPane.TOP);
        tb.setBounds(100, 100, 200, 200);
        tb.add(p,"Main");
        p.add(name);
        j.add(tb); 
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
package swingoperation;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class SwingOperation extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame("Tabb Pane");
        j.setLayout(null);
        j.setBounds(400, 100, 500, 500);
        JTabbedPane tb = new JTabbedPane(JTabbedPane.TOP);
        tb.setBounds(100, 100, 200, 200); 
        JPanel main = new JPanel();
        JPanel visit = new JPanel();
        JPanel help = new JPanel();
        tb.add("Main",main);
        tb.add("Visit",visit);
        tb.add("Help",help);
        j.add(tb);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
________________________________________________________________________________
*/
