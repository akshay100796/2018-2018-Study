
package AbstractInheritance;

public class Lion extends Animal
{
    String family;      //Felidae
    String Location;

    public Lion(String family, String Location, int noOfLegs, String color) 
    {
        super(noOfLegs, color);
        this.family = family;
        this.Location = Location;
    }

    public String getFamily() {
        return family;
    }

    public String getLocation() {
        return Location;
    }
    
    @Override
    boolean isVeg()
    {
        return false;
    }
    
    
    
}
