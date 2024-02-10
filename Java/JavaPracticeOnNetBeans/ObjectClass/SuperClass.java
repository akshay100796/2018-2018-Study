package ObjectClass;

import java.util.Arrays;


/*
public class SuperClass extends Object
{
    public static void main(String[] args)
    {
        SuperClass s = new SuperClass();
        Class c = s.getClass();
        System.out.println("getClass()  : "+s.getClass());
        System.out.println("getSuperclass : "+c.getSuperclass());        
    }
}
*/

class Parent
{
    String show()
    {   
        return "parent class Show method";
    }
}
public class SuperClass extends Parent
{
    public static void main(String[] args)
    {
        SuperClass s = new SuperClass();
        System.out.println("getClass()  :  "+s.getClass());
        System.out.println("hashCode()  :  "+s.hashCode());
        System.out.println("toString()  :  "+s.toString());
        System.out.println("\n______________________________\n");
        Parent p = new Parent();
        System.out.println("getClass()  :  "+p.getClass());
        System.out.println("hashCode()  :  "+p.hashCode());
        System.out.println("toString()  :  "+p.toString());
        System.out.println("show()      : "+p.show());
        System.out.println("\n______________________________\n");
        Parent b = new SuperClass();
        System.out.println("getClass()  :  "+b.getClass());
        System.out.println("hashCode()  :  "+b.hashCode());
        System.out.println("toString()  :  "+b.toString());
        System.out.println("\n______________________________\n");
        Class c = s.getClass();
        System.out.println("getClass()      :  "+c.getClass());
        System.out.println("hashCode()      :  "+c.hashCode());
        System.out.println("toString()      :  "+c.toString());
        System.out.println("getSimpleName() :  "+c.getSimpleName());
        System.out.println("getSigners()    :  "+Arrays.toString(c.getSigners()));
        System.out.println("getSuperclass() :  "+c.getSuperclass());
        
    }
}








