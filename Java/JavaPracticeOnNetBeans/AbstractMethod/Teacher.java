
package AbstractMethod;

public class Teacher extends Person
{
    String Dept;
    int Sal;

    public Teacher(String Dept, int Sal, String name, String Gender, int age) 
    {
        super(name, Gender, age);
        this.Dept = Dept;
        this.Sal = Sal;
    }
    @Override
    void work()
    {
        System.out.println("Work as a Staff");
    }

    public String getDept() {
        return Dept;
    }

    public int getSal() {
        return Sal;
    }
    
    
    
}
