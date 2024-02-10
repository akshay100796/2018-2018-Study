
package InstanceOf;

public class IsInstance 
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class c = Class.forName("InstanceOf.IsInstance");
        Student s = new Student();
        System.out.println(c.isInstance(s)); 
        
        Class c1 = Class.forName("InstanceOf.IsInstance");
        Emp a = new Emp();
        System.out.println(c.isInstance(a));  
        
    }
}
class Student{}
class Emp{}
/*Class c = Class.forName("java.util.Scanner");
        Scanner s = new Scanner(System.in);
        boolean b = c.isInstance(s);
        System.out.println(b);
        */
        