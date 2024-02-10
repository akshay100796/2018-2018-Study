
package MultiThreadingByDurgaSir;

class MyThread extends Thread
{
    @Override
    public void run()                       //running
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hi Akshay - "+i);
        }
    }                                       //dead state
}
public class Practice 
{
    public static void main(String[] args) 
    {
        MyThread t = new MyThread();
        t.start();
        System.out.println("Max   - "+Thread.currentThread().MAX_PRIORITY);
        System.out.println("Norm  - "+Thread.NORM_PRIORITY);
        System.out.println("Min   - "+Thread.MIN_PRIORITY);
    }
}
