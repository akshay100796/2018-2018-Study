package generalOld.src;

abstract class anonInner {
    public abstract void fun();
}
public class string
{
    public static void main(String argu[]) {
        anonInner in = new anonInner() {
            @Override
            public void fun() {
                System.out.println("Anonymous Inner class executed….");
            }
        }; 
        in.fun();
    }
}
