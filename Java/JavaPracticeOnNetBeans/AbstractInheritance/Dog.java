
package AbstractInheritance;

public class Dog extends Animal
{
    String food;
    String name;

    public Dog(String food, String name, int noOfLegs, String color)
    {
        super(noOfLegs, color);
        this.food = food;
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }
    
    @Override
    boolean isVeg()
    {
        return true;
    }
    
    
}
