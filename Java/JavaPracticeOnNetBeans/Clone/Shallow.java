
package Clone;

class Cat
{
    int i;
    public Cat(int i) 
    {
        this.i = i;
    }
}
class Dog implements Cloneable
{
    Cat c;
    int j;

    public Dog(Cat c, int j) 
    {
        this.c = c;
        this.j = j;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class Shallow
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cat c = new Cat(10);
        Dog d = new Dog(c, 20);
        System.out.println(d.j+"   "+d.c.i);
        Dog d1 = (Dog)d.clone();
        d1.j = 10000;
        d1.c.i = 5555555;
        System.out.println(d1.j+"   "+d1.c.i);   
    }
    
    
}









