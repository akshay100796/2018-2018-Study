
package Interface;

public class Trangle implements Shape
{
    double height,width;

    public Trangle(double height, double width) 
    {
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea()
    {
        return height*width;
    }
    @Override
    public void draw()
    {
        System.out.println("Drawing a Trangle");
    }
    
    
}
