
package Interface;

public class Test 
{
    public static void main(String[] args) 
    {
        Shape s = new Circle(10.5);
        s.draw();
        System.out.println(s.getArea());
        Shape s1 = new Trangle(10, 7);
        s1.draw();
        System.out.println(s1.getArea());
    }
}
