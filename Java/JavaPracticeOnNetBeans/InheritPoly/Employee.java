
package InheritPoly;

import java.util.Scanner;

public class Employee extends Person
{
    int eid,sal;
    anyDate jDate;
    String post;
    Address EmpAddr;

    public Employee(int age, int height, int weight, String name, String Dept, long mob) 
    {
        super(age, height, weight, name, Dept, mob);
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID of  Emp : ");
        eid = sc.nextInt();
        System.out.println("Enter Sal of Emp : ");
        sal = sc.nextInt();
        System.out.println("Enter Joining Date : ");
        
        
     
    }
    void output()
    {
        System.out.println("Employee ID     :  "+eid);
        System.out.println("Employee Salary :  "+sal);
        
    }
    
    
}
