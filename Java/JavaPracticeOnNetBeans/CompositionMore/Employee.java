
package CompositionMore;

public class Employee 
{
    Person p;
    int id;
    String Dept;
    int Salary;

    public Employee( int id, String Dept, int Salary,int age, double height, double weight, String email, char sex,String name) 
    {
        this.p = new Person();
        this.id = id;
        this.Dept = Dept;
        this.Salary = Salary;
        p.setAge(age);
        p.setHeight(height);
        p.setWeight(weight);
        p.setEmail(email);
        p.setSex(sex);
        p.setName(name);
    }

    public Person getP() {
        return p;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return Dept;
    }

    public int getSalary() {
        return Salary;
    }
    
    
    public int getAge()
    {
        return p.age;
    }
    public double getHeight()
    {
        return p.height;
    }
    public double getWeight()
    {
        return p.weight;
    }
    public String getEmail()
    {
        return p.email;
    }
    public char getSex()
    {
        return p.sex;
    }
    
    public String getName()
    {
        return p.getName();
    }
    
}
