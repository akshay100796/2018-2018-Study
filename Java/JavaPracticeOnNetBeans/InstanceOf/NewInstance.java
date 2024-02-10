
package InstanceOf;

public class NewInstance 
{
    public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException
    {
        Class c = Class.forName("Example.Main");
        Object obj = c.newInstance();
        System.out.println("Object for : "+obj.getClass().getName());
        
    }
}
