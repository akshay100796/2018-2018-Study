
package ObjectClass;

public class Finalize 
{
    public static void main(String[] args)  throws Exception,Throwable
    {
        Finalize f = new Finalize();
        System.out.println(f.hashCode());
        f.finalize();
        System.gc();
    }
}
