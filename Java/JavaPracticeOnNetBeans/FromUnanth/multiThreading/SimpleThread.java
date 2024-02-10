
package MultiThreadingByUNANTH;

public class SimpleThread 
{
    public static void main(String[] args) 
    {
        Thread t = Thread.currentThread();
        System.out.println(t.currentThread().getName());
        System.out.println(t);
        t.setName("Akshay");
        System.out.println(t);
        System.out.println(t.currentThread().getName());
        try 
        {
            Thread.sleep(5000); 
        }
        catch (InterruptedException e)
        {
            
        }
    }
}
