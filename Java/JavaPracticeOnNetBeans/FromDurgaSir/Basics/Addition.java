
import java.io.IOException;


/*public class MyNAme
{
public static void main(String[] args)
{
char a = 2309;
char b = 2332;
char c = 2351;
System.out.print(a);
System.out.print(b);
System.out.print(c);
}
}*/

//Something goes wrong
public class Addition
{
    public static void main(String[] args) throws IOException
    {
        int a,b,c;
        System.out.print("Enter 1st No : ");
        a = System.in.read();
        System.out.print("Enter 2nd No : ");
        b = System.in.read();
        c = a+b;
        System.out.println("Addition is : "+c);
    }
}
