/**
 * Source Code     :  Program of Shallow Cloning
 */
package Clone;


class Person
{
    int age;
    String name;

    public Person(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }
}

class Student implements Cloneable
{
    Person p;
    int rn;
    String clgName;

    public Student(Person p, int rn, String clgName) 
    {
        this.p = p;
        this.rn = rn;
        this.clgName = clgName;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ShallowPersonStudent 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person p = new Person(21, "Akshay");
        Student s = new Student(p, 5, "SVIT");
        System.out.println("p.age       : "+p.age);
        System.out.println("p.name      : "+p.name);
        System.out.println("s.rn        : "+s.rn);
        System.out.println("s.clgName   : "+s.clgName);
        System.out.println("\n");
        Student s1 = (Student)s.clone();
        s1.p.age = 99;
        s1.p.name = "xxxxx";
        s1.rn = 69;
        s1.clgName = "Matoshri";
        
        System.out.println("s.p.age     : "+s.p.age);
        System.out.println("s1.p.age    : "+s1.p.age);
        System.out.println("s1.p.name   : "+s1.p.name);
        System.out.println("s1.rn       : "+s1.rn);
        System.out.println("s1.clgName  : "+s1.clgName);
        
   }
}


