package Composition;

public class Truck 
{
    Engine et;

    public Truck() 
    {
        this.et = new Engine();
        et.setPower(112);       //KW
        et.setSpeed(240);
        et.setType("Titan");
    }
    
    public String getType()
    {
        return et.getType();
    }
    
    public int getSpeed()
    {
        return et.getSpeed();
    }
    
    public int getPower()
    {
        return et.getPower();
    }
    
    
}
