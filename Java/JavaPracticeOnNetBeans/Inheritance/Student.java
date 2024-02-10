package Inheritance;

public class Student extends Person
{
    int rn;
    String clg,dept;
    double hsc;

    public Student(int rn, String clg, String dept, double hsc, String name, int age, String color, long mob, boolean veg) 
    {
        super(name, age, color, mob, veg);
        this.rn = rn;
        this.clg = clg;
        this.dept = dept;
        this.hsc = hsc;
    }

    public int getRn() {
        return rn;
    }

    public String getClg() {
        return clg;
    }

    public String getDept() {
        return dept;
    }

    public double getHsc() {
        return hsc;
    }
    
    
    
}
