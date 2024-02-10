/*
package MultiThreadingByUNANTH;

class Method implements Runnable
{

    public Method() 
    {
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run()
    {
        System.out.println("Akshay Pawar");
    }
}

public class RunnableT
{
    public static void main(String[] args) 
    {
        Method m = new Method();
        System.out.println("Pawar Akshay MAIN");
    }
}
________________________________________________________________________
package MultiThreadingByUNANTH;

abstract class RunnableT implements Runnable
{
    public static void main(String[] args)
    {
        Thread t = new Thread();
        t.start();
        
        Runnable r1 = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Akshay");
            }
        };
        
        Runnable r2 = new Runnable() {
            @Override
            public void run() 
            {
                System.out.println("Sunil");
            }
        };
        
        Runnable r3 = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Pawar");
            }
        };
    }
}
________________________________________________________________________*/
package MultiThreadingByUNANTH;

class Simple implements Runnable
{
    Thread t;
    Simple() 
    {
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
       
        System.out.println("Akshay Pawar");
        System.out.println("Back to RUN");
    }
    
}
public class RunnableT
{
    public static void main(String[] args)
    {
        new Simple();
        System.out.println("Main Method");
        System.out.println("Back to MAIN");
    }
}





























