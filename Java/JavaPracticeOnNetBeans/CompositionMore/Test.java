package CompositionMore;

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("M = Male  ,  F = Female\n");
        Student s = new Student(5, "SVIT Chincholi", 98.56, 21, 158, 65.2, "pawarakshay13@gmail.com", 'M', "Akshay");
        System.out.println("Name       :  "+s.getName());
        System.out.println("Roll No    :  "+s.getRn());
        System.out.println("Collage    :  "+s.getCollage());
        System.out.println("Marks      :  "+s.getMarks()+" %");
        System.out.println("Age        :  "+s.getAge()+" year");
        System.out.println("Height     :  "+s.getHeight()+" CM");
        System.out.println("Weight     :  "+s.getWeight()+" Kg");
        System.out.println("Email      :  "+s.getEmail());
        System.out.println("Sex        :  "+s.getSex());
        System.out.println("\n____________________________________________________");
        
        Employee e = new Employee(1001, "Computer", 45000, 35, 170, 75.6, "pawarakshay1857@gmail.com", 'M',"AxePwr");
        System.out.println("Name       :  "+e.getName());
        System.out.println("Emp ID     :  "+e.getId());
        System.out.println("Department :  "+e.getDept());
        System.out.println("Salary     :  "+e.getSalary()+" INR");
        System.out.println("Age        :  "+e.getAge()+" year");
        System.out.println("Height     :  "+e.getHeight()+" CM");
        System.out.println("Weight     :  "+e.getWeight()+" Kg");
        System.out.println("Email      :  "+e.getEmail());
        System.out.println("Sex        :  "+e.getSex());
        System.out.println("\n____________________________________________________");
    
        Actress a = new Actress("Bahubali 2:The Conclusion", 70, 450, 10, 35, 160, 65.8, "tammannabhatiya@gmail.com", 'F',"Tamanna Bhatiya");
        System.out.println("Name       :  "+a.getName());
        System.out.println("Best Movie :  "+a.getBestMovie());
        System.out.println("Total Movie:  "+a.getTotalMovie());
        System.out.println("Collection :  "+a.getCollection()+" Cr");
        System.out.println("World Rank :  "+a.getRank());
        System.out.println("Age        :  "+a.getAge()+" year");
        System.out.println("Height     :  "+a.getHeight()+" CM");
        System.out.println("Weight     :  "+a.getWeight()+" Kg");
        System.out.println("Email      :  "+a.getEmail());
        System.out.println("Sex        :  "+a.getSex());
        System.out.println("\n____________________________________________________");
    
    }
}
