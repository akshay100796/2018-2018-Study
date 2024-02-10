package MultiThreadingByDurgaSir;

public class Daemon extends Thread
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().isDaemon());          //false
        
        //Thread.currentThread().setDaemon(true);        IllegalThreadStateException
        
        Daemon d = new Daemon();
        System.out.println(Thread.currentThread().isDaemon());          //false
        d.setDaemon(true);
        System.out.println(d.isDaemon());                               //true
    }
}
