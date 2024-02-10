
package CoVariantReturnType;

public class Parent 
{
    Parent show()
    {
        return new Child();
    }
}

class Child extends Parent
{
    @Override
    Parent show()
    {
        return new Parent();
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Valid Programm");
    }
}




/**
 * Parent p = new Parent();         valid
 * Parent p = new Child();          valid
 * Child c = new Child();           valid
 * 
 * Child c = new Parent();        Invalid
 * 
 */