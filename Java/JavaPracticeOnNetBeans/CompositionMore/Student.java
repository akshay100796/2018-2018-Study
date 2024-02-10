package CompositionMore;

public class Student 
{
    private Person p;
    private int rn;
    private String collage;
    private double marks;

    public Student( int rn, String collage, double marks,int age, double height, double weight, String email, char sex,String name) 
    {
        this.p = new Person();
        this.rn = rn;
        this.collage = collage;
        this.marks = marks;
        p.setAge(age);
        p.setHeight(height);
        p.setWeight(weight);
        p.setEmail(email);
        p.setSex(sex);
        p.setName(name);
    }
    public Person getP()
    {
        return p;
    }

    public int getRn()
    {
        return rn;
    }

    public String getCollage() 
    {
        return collage;
    }
    
    public double getMarks() 
    {
        return marks;
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
