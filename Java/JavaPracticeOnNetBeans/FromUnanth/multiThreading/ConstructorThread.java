/*
package MultiThreadingByUNANTH;

class More extends Thread
{
    public More() 
    {
        System.out.println(this+"\n In Default Constructor");
        start();
    }
    public void run()
    {
        try 
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Hi SVIT");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
        
    }
}
public class ConstructorThread extends Thread
{
    public static void main(String[] args)
    {
        new More();
        try
        {
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Hi Akshay");
                Thread.sleep(1000);
            }
 
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }  
}
*/

package MultiThreadingByUNANTH;
class Threading implements Runnable
{
    String name;

    public Threading(String name) {
        this.name = name;
        Thread t= new Thread(this,name);
        t.start();
    }
    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name+" - "+i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
        }
    }
}
public class ConstructorThread
{
    public static void main(String[] args) 
    {
        Threading d1 = new Threading("First");
        Threading d2 = new Threading("Second");
        
        try {
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("main Thread - "+i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
        }
    }
}



























