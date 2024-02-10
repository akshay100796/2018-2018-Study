package Inheritance;

public class Person 
{
    String name;
    int age;
    String color;
    long mob;
    boolean veg;

    public Person(String name, int age, String color, long mob, boolean veg) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.mob = mob;
        this.veg = veg;
    }
    
    
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public long getMob() {
        return mob;
    }

    public boolean isVeg() {
        return veg;
    }
    
    
    
}
