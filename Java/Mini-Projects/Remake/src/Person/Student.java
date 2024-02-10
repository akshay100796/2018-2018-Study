
package Remake.src.Person;

public class Student
{
    
    public static void main(String[] args)
    {
        Person s = new Person("Akshay Pawar","pawarakshay13@gmail.com","IT",21);
        System.out.println("Name : "+s.getName());
        System.out.println("Email ID : "+s.getEmail());
        System.out.println("Department : "+s.getDept());
        System.out.println("Age : "+s.getAge());
    }
    
    
}
