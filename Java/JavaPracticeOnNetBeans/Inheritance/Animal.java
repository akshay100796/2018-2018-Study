
package Inheritance;
public abstract class Animal
{
    void legNo()
    {
        System.out.println("All Animal have 4 legs");
    }
    abstract void color();
    abstract void eats();
}
class Dog extends Animal
{
    @Override
    void color()
    {
        System.out.println("Dogs are white");
    }
    @Override
    void eats()
    {
        System.out.println("Dogs eat Vegs");
    }
}
class execute
{
    public static void main(String[] args)
    {
       Dog d = new Dog();
       d.legNo();
       d.color();
       d.eats();
    }
}