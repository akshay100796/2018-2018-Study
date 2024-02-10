
package InstanceOf;

public class IsPrimitive 
{
    public static void main(String[] args) 
    {
        // Class c = Class.forName("valid Class Path");     Refer for Class || non Primitive Data type
        Class c1 = byte.class;
        Class c2 = short.class;
        Class c3 = int.class;
        Class c4 = long.class;
        Class c5 = char.class;
        Class c6 = float.class;
        Class c7 = double.class;
        Class c8 = boolean.class;
        System.out.println(c1.isPrimitive());
        System.out.println(c2.isPrimitive());
        System.out.println(c3.isPrimitive());
        System.out.println(c4.isPrimitive());
        System.out.println(c5.isPrimitive());
        System.out.println(c6.isPrimitive());
        System.out.println(c7.isPrimitive());
        System.out.println(c8.isPrimitive());
    }
}
