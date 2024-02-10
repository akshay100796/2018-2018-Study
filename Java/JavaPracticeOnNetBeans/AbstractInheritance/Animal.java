
package AbstractInheritance;

public abstract class Animal 
{
    private int noOfLegs;
    private String color;

    public Animal(int noOfLegs, String color)
    {
        this.noOfLegs = noOfLegs;
        this.color = color;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public String getColor() {
        return color;
    }
 
    
    abstract boolean isVeg();
            
    
}
