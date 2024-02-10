package MultiThreadingByUNANTH;
class Check implements Runnable
{
    Thread t;
    public Check() 
    {
        t = new Thread(this);
        t.start();
        System.out.println("is Alive in Constructer ?  "+t.isAlive());
    }
    @Override
    public void run()
    {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("is Alive in run - "+i+" ==> "+t.isAlive());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){}
        
        System.out.println("Is thread Alive in Outside TRY - "+t.isAlive());
    }
}
public class IsAliveThread {
    public static void main(String[] args) throws InterruptedException
    {
        Check c = new Check();
        c.t.join(10000);
        System.out.println("is Alive in before try in Main - "+c.t.isAlive());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("is Alive in MAIN - "+i+" ==> "+c.t.isAlive());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
        
        System.out.println("Outside main try is Alive - "+c.t.isAlive());
    }
}
