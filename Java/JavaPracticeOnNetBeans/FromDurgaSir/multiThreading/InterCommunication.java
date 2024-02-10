/*
package MultiThreadingByDurgaSir;

class Communicate extends Thread
{

    @Override
    public void run() 
    {
        synchronized(this)
        {
            try{
                for (int i = 0; i < 10; i++) 
                {
                    System.out.println("Child Thread - "+i);
                    Thread.sleep(1000);
                }
                this.notify();
            } catch (InterruptedException e) {}
        }
    }
    
}
public class InterCommunication 
{
    public static void main(String[] args) throws InterruptedException
    {
        Communicate c = new Communicate();
        c.start();
        
        synchronized(c)
        {
            c.wait();
            try 
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println("Main Method - "+i);
                    Thread.sleep(1000);
                    
                }
            } catch (InterruptedException e) {}   
        }      
    }
}
_______________________________________________________________________

package MultiThreadingByDurgaSir;

class Communicate extends Thread
{
    int total=0;
    public void run()
    {
        synchronized(this)
        {
            
            try {
                for(int i=0;i<100;i++)
                {
                    total += i;
                }
                this.notify();
            } catch (Exception e) {}
        }
    }
}

public class InterCommunication 
{
    public static void main(String[] args) throws InterruptedException
    {
        Communicate c = new Communicate();
        c.start();
        synchronized(c)
        {
            try {
                System.out.println("Waiting...");
                c.wait();
                System.out.println("Addition of First 100 No : "+c.total);
            } catch (InterruptedException e) {}
        }
    }
}
_______________________________________________________________________

package MultiThreadingByDurgaSir;

class Student extends Thread
{
    public void run()
    {
        synchronized(this)
        {
        try{
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Student No - "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){}
        this.notify();
        }
    }
}
public class InterCommunication 
{
    public static void main(String[] args) throws InterruptedException
    {
        Student s = new Student();
        s.start();
        synchronized(s)
        {
            s.wait();
            try {
                for (int i = 0; i < 10; i++) 
                {
                    System.out.println("SVIT - "+i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
        }
        
    }
}
_______________________________________________________________________
package MultiThreadingByDurgaSir;

class Student extends Thread
{
    int age;
    String fname,clg,city,state,dept;
    double percentage;
    String job,promo;
    
    
    public Student(int age, String fname, String clg, String city, String state, String dept) 
    {
        this.age = age;
        this.fname = fname;
        this.clg = clg;
        this.city = city;
        this.state = state;
        this.dept = dept;
    }
    @Override
    public void run() 
    {
        System.out.println("Name      : "+fname);
        System.out.println("Age       : "+age);
        System.out.println("Collage   : "+clg);
        System.out.println("Deparment : "+dept);
        System.out.println("Address   : "+city+", "+state);
        synchronized(this)
        {
            try 
            {
               this.percentage = 78.55; 
               Thread.sleep(1000);
               this.notify();
               this.job = "Senior Manager";
               Thread.sleep(1000);
               this.notify();
               this.promo = "New York";
               Thread.sleep(1000);
               this.notify();
            } catch (InterruptedException e) {}
            this.notify();
        }
    }
}

public class InterCommunication
{
    public static void main(String[] args) throws InterruptedException
    {
        Student s = new Student(21, "Akshay Pawar", "SVIT", "Nashik", "maharashtra", "Information Technology");
        s.start();
        synchronized(s)
        {
            try {
                System.out.println("Waiting for Percentage....");
                s.wait();
                System.out.println("Percentage  : "+s.percentage);
                System.out.println("Waiting for Job .....");
                s.wait();
                System.out.println("Job Title   : "+s.job);
                System.out.println("Waiting for Promotion .....");
                s.wait();
                System.out.println("Promotion Country  : "+s.promo);
                
            } catch (InterruptedException e) { }
        }
    }
}

_______________________________________________________________________*/   

package MultiThreadingByDurgaSir;

class MyThred extends Thread
{

    @Override
    public void run() 
    {
        try 
        {
            for (int i = 0; i < 20; i++) 
            {
                System.out.println("Akshay  - "+i);
                Thread.sleep(500);
            }
            synchronized(this){this.notify();}
        } catch (InterruptedException e) 
        {
            System.out.println("Akshay Exception");
        }
        
    }
}
public class InterCommunication
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThred t = new MyThred();
        t.start();
        synchronized(t){t.wait(5000);}
        try 
        {
            for (int i = 0; i < 20; i++) 
            {
                System.out.println("Programmer - "+i);
                Thread.sleep(500);
            }    
        } catch (InterruptedException e) 
        {
            System.out.println("Programmer Exception");
        }
        
    }
}
















































