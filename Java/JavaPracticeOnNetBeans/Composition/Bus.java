package Composition;

public class Bus 
{
    Engine bus;

    public Bus() 
    {
        this.bus = new Engine();
        bus.setPower(151);  //KW
        bus.setSpeed(180);  //KMPH
        bus.setType("L9N");
    }
    
     public String getType()
    {
        return bus.getType();
    }
    
    public int getSpeed()
    {
        return bus.getSpeed();
    }
    
    public int getPower()
    {
        return bus.getPower();
    }
    
    
}
