/*
package MultiThreadingByDurgaSir;

class Mythread extends Thread
{
    @Override
    public void run() 
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Akshay - "+i);
            Thread.yield();
        }
    }
    
}
public class Yield 
{
    public static void main(String[] args)
    {
        Mythread t = new Mythread();
        t.start();
        t.setPriority(8);
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Pawar ---- "+i);
            //Thread.yield();
        }
    }
}
______________________________________________________________________*/


package MultiThreadingByDurgaSir;

class Mythread extends Thread
{
    @Override
    public void run() 
    {
        for(int i=0;i<100;i++)
        {
            Thread.yield();
            System.out.println("Hi Akshay - "+i);
            
        }
    }
}
public class Yield 
{
    public static void main(String[] args)
    {
        Mythread t = new Mythread();
        t.start();
        
        for(int i=0;i<100;i++)
        {
            t.setPriority(9);
            System.out.println("Hi Pawar ---- "+i);
        }
    }
}






























