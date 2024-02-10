
package Interface;

public class Circle implements Shape
{
    double r;

    public Circle(double r) 
    {
        this.r = r;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI*r*r;
    }
    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}
