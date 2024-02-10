package CompositionMore;

public class Person 
{
    int age;
    double height,weight;
    String email;
    char sex;
    private String name;

    public Person() {
    }

    public Person(int age, double height, double weight, String email, char sex, String name) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.email = email;
        this.sex = sex;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    

    public int getAge()
    {
        return age;
    }

    public double getHeight() 
    {
        return height;
    }

    public double getWeight() 
    {
        return weight;
    }

    public String getEmail() 
    {
        return email;
    }

    public char getSex()
    {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
