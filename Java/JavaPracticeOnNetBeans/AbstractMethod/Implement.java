package AbstractMethod;

public class Implement
{
    //parent class hold child class obj
    //child clss   ------------||------
    public static void main(String[] args) 
    {
        Student s = new Student("IT", 2, "Akshay", "Male", 21);
        System.out.println("Department  : "+s.getDept());
        System.out.println("Roll No     : "+s.getRn());
        System.out.println("Name is     : "+s.getName());
        System.out.println("Gender      : "+s.getGender());
        System.out.println("Age         : "+s.getAge());
        s.work();
        System.out.println("\n_______________________________\n");
        Teacher t = new Teacher("IT", 45000, "S.R. kappor", "Male", 36);
        System.out.println("Department  : "+t.getDept());
        System.out.println("Salary      : "+t.getSal());
        System.out.println("Name        : "+t.getName());
        System.out.println("Gender      : "+t.getGender());
        System.out.println("Age         : "+t.getAge());
        t.work();
        System.out.println("\n_______________________________\n");
        Person p = new Student("IT", 2, "Axe", "Male", 21);
        p.work();
        p = new Teacher("Mech", 45000, "A.S. Pawar", "Male", 21);
        p.work();
        
        
    }
    
    
}
