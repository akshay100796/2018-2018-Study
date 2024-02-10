
package MultiThreadingByDurgaSir;

class ThreadClass extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
            System.out.println("Run Method");
    }
}
public class SimpleThread 
{   
    
    public static void main(String[] args) 
    {
        ThreadClass t = new ThreadClass();
        t.start();
	t.interrupt();
        for(int i=0;i<10;i++)
            System.out.println("Main Method");
    }
    
}







/*_________________________________________________________________

class ThreadClass extends Thread
{
    
    public void run(int o)
    {
        System.out.println("Run Method");
    }
}
public class SimpleThread 
{   
    
    public static void main(String[] args) 
    {
        ThreadClass t = new ThreadClass();
        t.start();
        System.out.println("Main Method");
    }
}
_________________________________________________________________

public class SimpleThread 
{   
    public static void main(String[] args) 
    {
        SimpleThread t = new SimpleThread();
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
    }   
}
*/
