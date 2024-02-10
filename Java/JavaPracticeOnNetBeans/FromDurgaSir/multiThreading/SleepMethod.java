/*
package MultiThreadingByDurgaSir;

class Loading extends Thread
{

    @Override
    public void run()
    {
        System.out.println("Loading, please Wait");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(". ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println("\nLoad Completed\n");
    }
    
}
public class SleepMethod 
{
    public static void main(String[] args)
    {
        Loading l = new Loading();
        l.start();
    }
}
_________________________________________________________________________

package MultiThreadingByDurgaSir;

class myThread extends Thread
{

    @Override
    public void run() 
    {
        try{
            for (int i = 0; i < 100; i++){
                System.out.println("Hi Akshay - "+i);
                Thread.sleep(3000); 
            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupted Exception GOTTED");
        }
    }
    
}
public class SleepMethod 
{
    public static void main(String[] args){
        myThread t = new myThread();
        t.start();
        t.interrupt();
        System.out.println("main Thread Stops");
    }
}
_________________________________________________________________________

package MultiThreadingByDurgaSir;

class myThread extends Thread
{

    @Override
    public void run() 
    {
        try{
            for (int i = 0; i < 20; i++)
            {
                System.out.println("Child Thread - "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e)
        {
            System.out.println("Can't Sleep Anymore, Becoz Interrupted");
        }
    }
}

public class SleepMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t = new myThread();
        t.start();
        for (int i = 0; i < 20; i++)
        {
            if(i==10)
                t.interrupt();
            System.out.println("Main thread - "+i);
            Thread.sleep(1000);
        }
    }
}
_________________________________________________________________________*/

package MultiThreadingByDurgaSir;

class myThread extends Thread
{

    @Override
    public void run() 
    {
        try
        {
            for (int i = 0; i < 50; i++) 
            {
                if(i%2 == 0)
                {
                    System.out.println("/");
                    Thread.sleep(1000);
                }
                else
                {
                    System.out.println("\\");
                    Thread.sleep(1000);
                }
            }
        }catch(InterruptedException e){}
    }
    
}
public class SleepMethod 
{
    public static void main(String[] args)
    {
        myThread t = new myThread();
        t.start();
    }
}








































































