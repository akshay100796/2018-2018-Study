
package NestedClass;

public class Outer 
{
    int a = 10;
    class Inner
    {
        int x = 10;
    }
    public static void main(String[] args) 
    {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        System.out.println("a = "+out.a);
        System.out.println("x = "+in.x);
    }
}
