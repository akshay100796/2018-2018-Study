package InheritPoly;
import java.util.Scanner;

public class Student extends Person
{
    int rn;
    anyDate admission;
    Person p;
    String year,clg;
    public Student(int age, int height, int weight, String name, String Dept, long mob)
    {
        super(age, height, weight, name, Dept, mob);
        
    }
    Scanner S = new Scanner(System.in);
    void input()
    {
        System.out.print("Enter Roll No : ");
        rn = S.nextInt();
        System.out.print("Enter Current Year (FE,SE,TE,BE) : ");
        year = S.next();
        System.out.print("Enter College : ");
        clg = S.next();
        System.out.print("Admission Date : ");
    }
    void output()
    {
        System.out.println("Roll No : "+rn);
        System.out.println("Year    : "+year);
        System.out.println("Collage : "+clg);
    }
}