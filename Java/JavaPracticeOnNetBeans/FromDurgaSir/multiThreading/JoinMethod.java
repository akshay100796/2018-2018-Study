/*
package MultiThreadingByDurgaSir;

class myThread extends Thread
{
    @Override
    public void run()
    {
        for(int j=1;j<4;j++)
        {
            System.out.println("-----------------------------t"+j+"----------");
            for(int i=0;i<100;i++)
            {
                System.out.println("Hi Akshay ---- "+j+"----"+i);
            }
        }
    }
}

public class JoinMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        myThread t3 = new myThread();
        
        t1.start();
        t1.join();
        t2.start();
        t3.start();
        
    }
}
___________________________________________________________________________

package MultiThreadingByDurgaSir;

class myThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Akshay --- "+i);
        }
    }
}
public class JoinMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t = new myThread();
        t.start();
        t.join();
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Pawar - "+i);
        }
    }
}

___________________________________________________________________________


package MultiThreadingByDurgaSir;

class myThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("Hi Akshay --- "+i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
            
        }
    }
}
public class JoinMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t = new myThread();
        t.start();
        t.join(5500,500);           // OR  t.sleep(5000,100);
        for(int i=0;i<20;i++)
        {
            System.out.println("Hi Pawar - "+i);
        }
    }
}

___________________________________________________________________________


package MultiThreadingByDurgaSir;

class NewThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++) 
        {
            System.out.println("New Thread - "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}
class myThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Akshay --- "+i);
             try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}
public class JoinMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t = new myThread();
        NewThread t1 = new NewThread();
        t1.start();
        t1.join(5000);
        t.start();
        t.join(5000);
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Pawar - "+i);
             try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}

___________________________________________________________________________

package MultiThreadingByDurgaSir;

class myThread extends Thread
{
    static Thread mt;
    
    @Override
    public void run()
    {
        try{
            mt.join();
        }catch(InterruptedException e){}
        for(int i=0;i<10;i++)
        {
            System.out.println("Hi Akshay --- "+i);
        }
    }
}
public class JoinMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread.mt = Thread.currentThread();
        myThread t = new myThread();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Hi Pawar - "+i);
            Thread.sleep(100);
        }
    }
}

___________________________________________________________________________

-----------------------------------DeadLock-------------------------------
package MultiThreadingByDurgaSir;

class myThread extends Thread
{
    static Thread mt;
    
    @Override
    public void run()
    {
        try{
            mt.join();
        }catch(InterruptedException e){}
        for(int i=0;i<10;i++)
        {
            System.out.println("Hi Akshay --- "+i);
        }
    }
}
public class JoinMethod 
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread.mt = Thread.currentThread();
        myThread t = new myThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("Hi Pawar - "+i);
            Thread.sleep(100);
        }
    }
}

___________________________________________________________________________*/













