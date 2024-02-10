
package AbstractMethod;

public class Student extends Person
{
    String Dept;
    int rn;

    public Student(String Dept, int rn, String name, String Gender, int age) 
    {
        super(name, Gender, age);
        this.Dept = Dept;
        this.rn = rn;
    }
    @Override
    void work()
    {
        System.out.println("Work as a Student");
    }

    public String getDept() {
        return Dept;
    }

    public int getRn() {
        return rn;
    }
}
