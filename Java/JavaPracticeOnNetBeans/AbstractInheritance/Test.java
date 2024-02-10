
package AbstractInheritance;

public class Test 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog("pedigree", "Tomy", 4, "White");
        Lion l = new Lion("Felidae" ,"Africa Jungle", 4,"Brown");
        System.out.println("Dog Information");
        System.out.println(d.getFood());
        System.out.println(d.getName());
        System.out.println(d.getNoOfLegs());
        System.out.println(d.getColor());
        System.out.println("\n\n");
        System.out.println("Lion Information");
        System.out.println(l.getFamily());
        System.out.println(l.getLocation());
        System.out.println(l.getNoOfLegs());
        System.out.println(l.getColor());      
    }
    
    
}
