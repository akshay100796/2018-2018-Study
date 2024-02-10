package Composition;

public class Train 
{
    Engine train;

    public Train() 
    {
        this.train = new Engine();
        train.setType("Locomotive");
        train.setPower(4500);    //KW
        train.setSpeed(420);    //KMPH
    }
    
     public String getType()
    {
        return train.getType();
    }
    
    public int getSpeed()
    {
        return train.getSpeed();
    }
    
    public int getPower()
    {
        return train.getPower();
    }
    
    
    
}
