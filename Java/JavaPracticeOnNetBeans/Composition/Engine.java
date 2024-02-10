
package Composition;

public class Engine 
{
    private String Type;
    private int Power;
    private int speed;

    public String getType() {
        return Type;
    }

    public int getPower() {
        return Power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}


/*
car Engine   :   v6 engine  || honda indy V8
truck Engine :  Titan
train Engine : locomotive
bus Engine   : L9N


car power   : 	560 W / 0.75 bhp --
truck power : 150 hp or 112 kW
train power :  6,000-horsepower (4,500 kW)
bus power   : 202 HP (151 kW)

*/