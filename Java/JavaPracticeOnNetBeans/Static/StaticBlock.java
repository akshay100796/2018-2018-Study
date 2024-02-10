
package Static;

public class StaticBlock 
{
    static int i;
    static 
    {
        i=10;
        System.out.println("Static block get called"); 
    }

    public StaticBlock() 
    {
        System.out.println("Constructer called");
    }
    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
    }
    
}
