
package Inheritance;

public class PersonStudent 
{
    public static void main(String[] args) 
    {
        Student s = new Student(2, "SVIT", "IT", 54.55, "Akshay", 21, "White", 9657513437L, true);
        System.out.println("Roll No is   : "+s.getRn());
        System.out.println("Collage Name : "+s.getClg());
        System.out.println("Dept. Name   : "+s.getDept());
        System.out.println("Marks of HSC : "+s.getHsc());
        System.out.println("Name of Student : "+s.getName());
        System.out.println("Age of Student  : "+s.getAge());
        System.out.println("Skin Color   :  "+s.getColor());
        System.out.println("Mobile No    :  "+s.getMob());
        System.out.println("Vegeterian   : "+s.isVeg());
    }
    
}
