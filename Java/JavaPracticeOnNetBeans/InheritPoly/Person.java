package InheritPoly;

public class Person 
{
      int age,height,weight;
      String name;
      String Dept;
      long mob;

    public Person(int age, int height, int weight, String name, String Dept, long mob) 
    {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.Dept = Dept;
        this.mob = mob;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return Dept;
    }

    public long getMob() {
        return mob;
    }

   
    
    

}
