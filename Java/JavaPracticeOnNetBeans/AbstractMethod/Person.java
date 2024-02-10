
package AbstractMethod;

public abstract class Person 
{
    String name,Gender;
    int age;
    public Person(String name, String Gender,int age) 
    {
        this.name = name;
        this.Gender = Gender;
        this.age = age;
    }
    abstract void work();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }
    
    
}
