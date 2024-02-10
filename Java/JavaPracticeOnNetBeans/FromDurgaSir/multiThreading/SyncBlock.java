/*
package MultiThreadingByDurgaSir;

class Student extends Thread
{
    int rn;
    String fname;
    double mrks;

    public Student(int rn, String fname, double mrks) {
        this.rn = rn;
        this.fname = fname;
        this.mrks = mrks;
    }

    public int getRn() {
        return rn;
    }
    
    public String getFname() {
        return fname;
    }

    public double getMrks() {
        return mrks;
    }
    
    public void run()
    {
        try{
            System.out.println("ROll NO : "+rn);
            Thread.sleep(1000);
            System.out.println("Name    : "+fname);
            Thread.sleep(1000);
            System.out.println("Percentage : "+(mrks/5));
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }   
}
public class SyncBlock 
{
    public static void main(String[] args)
    {
       Student s = new Student(5, "Akshay Pawar", 416);
       s.start();
    }
}
___________________________________________________________________________

package MultiThreadingByDurgaSir;

class Wishes
{
    public synchronized void Message(String name)
    {
        try 
        {
            for (int i = 10; i > 0; i--) 
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){}
        synchronized(this)
        {
            try 
            {
                for (int i = 0; i < 3; i++) 
                {
                    System.out.println("Happy Birth Day : "+name);
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e){}
        }
    }
}
        
class mythread extends Thread
{
    Wishes w;
    String name;

    public mythread(Wishes w, String name) 
    {
        this.w = w;
        this.name = name;
    }

    @Override
    public void run() 
    {
        w.Message(name);
    }
}

public class SyncBlock
{
    public static void main(String[] args)
    {
        Wishes w = new Wishes();
        mythread t1 = new mythread(w, "Akshay");
        mythread t2 = new mythread(w, "Axe");
        mythread t3 = new mythread(w, "Myself");
        mythread t4 = new mythread(w, "ASP");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
___________________________________________________________________________*/

package MultiThreadingByDurgaSir;

class Wishes
{
    public void Message(Wishes w, String name)
    {
        try 
        {
            for (int i = 10; i > 0; i--) 
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){}
        synchronized(w)
        {
            try 
            {
                for (int i = 0; i < 3; i++) 
                {
                    System.out.println("Happy Birth Day : "+name);
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e){}
        }
    }
}
       
class mythread extends Thread
{
    Wishes w;
    String name;

    public mythread(Wishes w, String name) 
    {
        this.w = w;
        this.name = name;
    }

    @Override
    public void run() 
    {
        w.Message(w,name);
    }
}

public class SyncBlock
{
    public static void main(String[] args)
    {
        Wishes w = new Wishes();
        mythread t1 = new mythread(w, "Akshay");
        mythread t4 = new mythread(w, "ASP");
        t1.start();

        t4.start();
        
    }
}





































































