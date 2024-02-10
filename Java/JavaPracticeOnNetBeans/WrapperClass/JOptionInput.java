package WrapperClass;

import javax.swing.JOptionPane;

public class JOptionInput 
{
    public static void main(String[] args) 
    {
        String name;
        int age;
        
        name = JOptionPane.showInputDialog("Enter Name : ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age : "));
        JOptionPane.showMessageDialog(null, "Name :"+name+"\n Age : "+age);
        
        
        
    }
}
