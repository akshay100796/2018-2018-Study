
package InheritPoly;

public class Main 
{
   
    public static void main(String[] args) 
    {
       
        Person p = new Person(25, 158, 65, "Akshay Pawar", "IT", 9657513437L);
        System.out.println("Age    : "+p.getAge());
        System.out.println("Height : "+p.getHeight());
        System.out.println("Weight : "+p.getWeight());
        System.out.println("Name   : "+p.getName());
        System.out.println("Mobile No : "+p.getMob());
        System.out.println("Department : "+p.getDept());
        Student stud = new Student(21, 158, 65, "Akshay Pawar", "IT", 95657513437L);
        System.out.println("Age    : "+stud.getAge());
        System.out.println("height : "+stud.getHeight());
        System.out.println("Weight : "+stud.getWeight());
        System.out.println("Name   : "+stud.getName());
        System.out.println("Mobile Np  : "+stud.getMob());
        System.out.println("Department : "+stud.getDept());
        stud.input();
        
        anyDate dt = new anyDate();
        dt.input();
        
        System.out.println("Address :- \n");
        Address addr = new Address();
        addr.input();
        stud.output();
        dt.output();
        addr.output();
        
        Employee e = new Employee(30, 170, 70, "Akshay", "Engineering", 8421235546L);
        System.out.println("Age    : "+e.getAge());
        System.out.println("height : "+e.getHeight());
        System.out.println("Weight : "+e.getWeight());
        System.out.println("Name   : "+e.getName());
        System.out.println("Mobile Np  : "+e.getMob());
        System.out.println("Department : "+e.getDept());
        e.input();
        dt.input();
        System.out.println("Enter Address of Employee : ");
        addr.input();

        e.output();
        System.out.println("Joined Date     :  "+dt.output());
        System.out.println("Address         :  "+addr.output());
    }

}
