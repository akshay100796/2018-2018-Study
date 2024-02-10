
package Composition;

public class Car 
{
    Engine e;

    public Car() 
    {
        this.e = new Engine();
        e.setType("Honda Indy V8");
        e.setPower(560);    //Watt
        e.setSpeed(350);    //KMPH
    }
    
    public String getType()
    {
        return e.getType();
    }
    
    public int getSpeed()
    {
        return e.getSpeed();
    }
    
    public int getPower()
    {
        return e.getPower();
    }
    
}
