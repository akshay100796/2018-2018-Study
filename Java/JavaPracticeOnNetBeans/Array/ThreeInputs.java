package root.src.Root;/*
import javax.swing.JOptionPane;
class pattern
{
    public static void main(String args[])
    {
        int i,j,k,sp=5;
        for(i=0;i<5;i++)
        {
            for(j=0;j<sp;j++)
                System.out.print("  ");
            for(k=0;k<=i;k++)
                System.out.print(" "+k+" ");
            System.out.println("\n");
            sp--;
        }
        int sp1=5;
        for(i=1;i<=5;i++)
        {
            for(j=0;j<i;j++)
                System.out.print(" ");
            for(k=0;k<sp1;k++)
                System.out.print(" "+k+" ");
            System.out.println("\n");
            sp1--;
        }
    }
}*/
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
class ThreeInputs 
{
	public static void main(String[] args) throws IOException
	{
		int a,b,c;
		int p,q,r;
		int x,y,z;
		System.out.println("\n_____________________________________________\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First No in a = ");
		a=s.nextInt();
		System.out.println("Enter First No in b = ");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addiotion in C = "+c);
		System.out.println("\n End of Scanner \n");
		System.out.println("\n_____________________________________________\n");
		p = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter First No in p :"));
		q=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Second No in q : "));
		r=p+q;
		JOptionPane.showMessageDialog(null,"Addition  of "+p+"+"+q+"="+r);
		System.out.println("\n End of JOptionPane \n");
		System.out.println("\n_____________________________________________\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter First No in x :\n");
		x = Integer.parseInt(br.readLine());
		System.out.println("\n Enter Second No in y :  \n");
		y= Integer.parseInt(br.readLine());
		z=x+y;
		System.out.println("\n Addition in Z = "+z);
		System.out.println("\n End of BufferedReader ");
		System.out.println("\n_____________________________________________\n");
	}
}






























/*
import javax.swing.JOptionPane;
class add
{
    public static void main(String[] args)
    {
        
        String username = JOptionPane.showInputDialog(null,"Enter Username : ");
        String passwd = JOptionPane.showInputDialog(null,"Enter Password : ");
        if("root".equals(username) && "Akshay".equals(passwd))
        {
            JOptionPane.showMessageDialog(null,"Welcome Mr. "+passwd+"\n Click OK to Continue...");
            String name = JOptionPane.showInputDialog(null,"Enter Student Full Name : ");
            int phy = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks in Physics : "));
            int chem = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks in Chemistry  : "));
            int math = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in Mathematics : "));
            int bio = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in Biology : "));
            int total = phy+chem+math+bio;
            double per = (float)(total/400) * 100 ;                   //this is not execute
            String s ;
            if(per>=80)
                s="Distinction Class";
            else if(per>60)
                s="First Class";
            else if(per>40)
                s="Second Class";
            else
                s="Fail Class";
            JOptionPane.showMessageDialog(null," "+name+"\n----------------------------------\n"+"Subjects  \t  Marks \nPhysics \t   :"+phy+"\nChemistry  \t : "+chem+"\n Math  \t    :"+math+"\n Biology  \t   :"+bio+"\n----------------------------------\n Percentage  : "+per+"\nClass : "+s); 
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Valid Username & Password");
    }
}
________________________________________________________________________________

import javax.swing.JOptionPane;
class home
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Integer No. "));
        float b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter float No. "));
        
        JOptionPane.showMessageDialog(null,""+a);
        JOptionPane.showMessageDialog(null,""+b);
    }
}

________________________________________________________________________________
import javax.swing.JOptionPane;
class code
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter any value"));
        if(a>0)
        {
           JOptionPane.showMessageDialog(null,"Value is Positive");
        }
        else if(a==0)
        {
            JOptionPane.showMessageDialog(null, "Value is Zero (0)");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Value is Negative");
        }
    }
}
________________________________________________________________________________
import javax.swing.JOptionPane;
class msg
{
    public static void main(String args[])
    {
        String name = JOptionPane.showInputDialog(null,"Enter Your Name  : ");
        System.out.println("Hi I am "+name);
        JOptionPane.showMessageDialog(null,"Awesome "+name);
    }
}
________________________________________________________________________________
import javax.swing.JOptionPane;
class msg
{
    public static void main(String args[])
    {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter First No : "));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Second No : "));
        double c =  a+b;
        System.out.println("Addition is : "+c);
        
    }
}
________________________________________________________________________________
LOGIN

package Root;

import javax.swing.JOptionPane;

class simple
{
    public static void main(String args[])
    {
        String user = JOptionPane.showInputDialog(null,"UserName : ");
        String passwd = JOptionPane.showInputDialog(null,"Password : ");
        if("root".equals(user) && "Akshay".equals(passwd))
        {
            JOptionPane.showMessageDialog(null,"You are Login Successfully ");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Sorry Please Login again...");
        }
    }
}
________________________________________________________________________________
Source Code : take Fname & LName & Display

package Root;
import javax.swing.JOptionPane;
class msg
{
    public static void main(String args[])
    {
        String fname = JOptionPane.showInputDialog(null,"Enter First Name : ");
        String lname = JOptionPane.showInputDialog(null,"Enter Last  Name : ");
        JOptionPane.showMessageDialog(null,"My Name is :  "+fname+" "+lname);
    }
}
*/
