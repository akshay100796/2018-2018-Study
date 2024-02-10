
import java.util.Stack;


public class StackProg 
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        System.out.println(s);
        for (int i = 0; i < 10; i++) {
            s.pop();
        }
        
        System.out.println(s);
    }
}
