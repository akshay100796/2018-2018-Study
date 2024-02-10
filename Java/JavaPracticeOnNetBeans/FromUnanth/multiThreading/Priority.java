/*
package MultiThreadingByUNANTH;

class PriorityThread extends Thread
{
    @Override
    public void run()
    {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Akshay Run - "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
        synchronized(this){this.notify();}
    }
}
public class Priority 
{
    
    public static void main(String[] args) throws InterruptedException
    {
        PriorityThread t = new PriorityThread();
        t.start();
        synchronized(t){t.wait();}
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
    
}
______________________________________________________________________


package MultiThreadingByUNANTH;

class Test extends Thread
{
    
    @Override
    public void run() 
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Test Run - "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}

class PriorityThread extends Thread
{
    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Akshay Run - "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}
public class Priority 
{
    
    public static void main(String[] args) throws InterruptedException
    {
        PriorityThread p = new PriorityThread();
        Test t = new Test();
        
        p.setPriority(3);
        t.setPriority(8);
        p.start();
        t.start();
        
    }
}
_______________________________________________________________________*/

package MultiThreadingByUNANTH;

class Test implements Runnable
{
    Thread t;
    public Test(int p) 
    {
        t = new Thread(this);
        t.setPriority(p);
        t.start();
    }
    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Test Thread - "+t+" ==> "+i);
                System.out.println("Thread Aliveless : "+t.isAlive());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
    
}
public class Priority 
{
    public static void main(String[] args) 
    {
        Test t1 = new Test(Thread.NORM_PRIORITY-2);      //3
        Test t2 = new Test(Thread.NORM_PRIORITY);       //5
        Test t3 = new Test(Thread.NORM_PRIORITY+3);    //8
        
        try {
            t1.t.join();
            t2.t.join();
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread");
                System.out.println("Thread Aliveless : "+t1.t.isAlive());
                Thread.sleep(1000);
            }
            t3.t.join();
        } catch (InterruptedException e) {}
        
        System.out.println("Thread Aliveless of t1 : "+t1.t.isAlive());
        System.out.println("Thread Aliveless of t2 : "+t2.t.isAlive());
        System.out.println("Thread Aliveless of t3 : "+t3.t.isAlive());
    }
}


