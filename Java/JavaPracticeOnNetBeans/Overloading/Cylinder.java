package Overloading;


public class Cylinder extends Circle
{
    int height;
    double vlm;
    
    public Cylinder(){}
    
    public Cylinder(int ht ,int r ,String clr)
    {
        super( r ,clr);
        this.height = ht;
    }
    @Override
    public int getRadias()
    {
        return this.radias;
    }
    @Override
    public String getColor()
    {
        return color;
    }
    @Override
    public void setArea(int ht)
    {
        vlm =area*height;
    }
    @Override
    public double getArea()
    {
        return vlm;
    }
}
