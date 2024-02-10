
package InstanceOf;
public class Parent {}

class Child extends Parent
{
    public static void main(String[] args) throws Exception
    {
        //Parent p = new Parent();  OK      Up-Casting
        //Parent p = new Child();   OK      Up-Casting
        //Child c = new Child();    OK      Up-Casting
        
        Child c = (Child)new Parent();      //Downcasting bur RunTime Error Occur
        if(c instanceof Parent)
        {
            System.out.println("c instanceof Child");
        }
        else
        {
            System.out.println("c ! instanceof Child");
        }
    }
}

