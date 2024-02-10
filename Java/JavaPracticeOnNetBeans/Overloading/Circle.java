package Overloading;
public class Circle 
{
    int radias;
    String color;
    double area;
    
    Circle(){}
    public Circle(int radias, String color) 
    {
        this.radias = radias;
        this.color = color;
    }
    
    public void setArea(int r)
    {
        double pi = 3.14;
        area = pi*r*r;
    }
    public double getArea()
    {
        return area;
    }
    public int getRadias()
    {
        return radias;
    }
    public String getColor()
    {
        return color;
    }
}
