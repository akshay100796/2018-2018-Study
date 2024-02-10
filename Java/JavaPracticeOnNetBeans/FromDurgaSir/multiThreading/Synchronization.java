/*
package MultiThreadingByDurgaSir;

class Display
{
    public synchronized void wish(String name)
    {
        try 
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Happy Birth Day "+name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){}
    }
}

class OwnerThred extends Thread
{
    String name;
    Display d;
    public OwnerThred(Display d,String name) 
    {
        this.d = d;
        this.name = name;
    }
    public void run()
    {
        d.wish(name);
    }
    
}
public class Synchronization 
{
    public static void main(String[] args)
    {
        Display d = new Display();
        OwnerThred t1 = new OwnerThred(d, "Akshay");
        OwnerThred t2 = new OwnerThred(d, "Pallavi");
        t1.start();
        t2.start();
    }
}
_________________________________________________________________________

package MultiThreadingByDurgaSir;

class Owner extends Thread
{
    public synchronized void run()
    {
        try{
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Akshay - "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){}
    }
}
public class Synchronization 
{
    public static void main(String[] args)
    {
        Owner o1 = new Owner();
        Owner o2 = new Owner();
        o1.start();
        o2.start();
    }
}
_________________________________________________________________________

package MultiThreadingByDurgaSir;

class Greetings
{
    public synchronized void wish(String name)
    {
        try{
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Hellow - "+name);
                Thread.sleep(900);
            }
        }catch(InterruptedException e){}
    }
}

class Owner extends Thread
{
    Greetings g;
    String name;

    public Owner(Greetings g, String name) 
    {
        this.g = g;
        this.name = name;
    }     
    public void run()
    {
        g.wish(name);
    }
}
public class Synchronization 
{
    public static void main(String[] args)
    {
        Greetings g = new Greetings();
        Owner o1 = new Owner(g,"Akshay");
        Owner o2 = new Owner(g,"Pallavi");
        Owner o3 = new Owner(g, "Kohli");
        Owner o4 = new Owner(g, "Virat");
        o1.start();
        o2.start();
        o3.start();
        o4.start();
    }
}
_________________________________________________________________________


package MultiThreadingByDurgaSir;

class Display
{
    public synchronized void DisplayN()
    {
        try{
            for (int i = 0; i <= 10; i++) 
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){}
    }
    
    public synchronized void DisplayC()
    {
        try {
            for (int i = 2308; i < 2380; i++)
            {
                System.out.println(i+" -- "+(char)i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {}
    }
}


class MythreadN extends Thread
{
    Display d;

    public MythreadN(Display d) 
    {
        this.d = d;
    }
    
    @Override
    public void run() 
    {
        d.DisplayN();
    }
}
class MythreadC extends Thread
{
    Display d;

    public MythreadC(Display d) {
        this.d = d;
    }

    @Override
    public void run() 
    {
        d.DisplayC();
    }
}
public class Synchronization 
{
    public static void main(String[] args)
    {
        Display d = new Display();
        MythreadN n = new MythreadN(d);
        MythreadC c = new MythreadC(d);
        n.start();
        c.start();
    }
}
_________________________________________________________________________

package MultiThreadingByDurgaSir;

class Sync extends Thread
{

    @Override
    public void run() 
    {
        try{
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Sync Thread method");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){}
        synchronized(this)
        {
            try{
                for (int i = 0; i < 10; i++) 
                {
                    System.out.println("Sync Block");
                    Thread.sleep(1000);
                }
            }catch(InterruptedException eq){}
        }
    }
}
public class Synchronization 
{
    public static void main(String[] args)
    {
        Sync s = new Sync();
        s.start();
    }
}

_________________________________________________________________________*/

package MultiThreadingByDurgaSir;

class Sync extends Thread
{
    
}

public class Synchronization 
{
    public static void main(String[] args)
    {
        Sync s = new Sync();
        s.start();
    }
}








