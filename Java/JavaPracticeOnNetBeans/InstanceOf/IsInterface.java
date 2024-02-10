
package InstanceOf;
interface Stud
{
    public void show(); 
}
public class IsInterface implements Stud
{
    @Override
    public void show()
    {
        System.out.println("Interface invoke");
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class c = Class.forName("InstanceOf.IsInterface");
        IsInterface i = new IsInterface();
        System.out.println(c.isInstance(i));
        
        Class c1 = Class.forName("java.lang.Runnable");
        boolean  b = c1.isInterface();
        System.out.println(b);
    }
}
