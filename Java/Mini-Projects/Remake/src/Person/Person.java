
package Remake.src.Person;

public class Person 
{
    private String name,email,dept;
    private int age;

    public Person(String name, String email, String dept, int age) {
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDept() {
        return dept;
    }

    public int getAge() {
        return age;
    }

    
    
}
