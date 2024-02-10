
package Composition;

public class Check 
{
    public static void main(String[] args) 
    {
        //Engine e = null;
        Car c = new Car();
        System.out.println("Car Power  : "+c.getPower()+" KW");
        System.out.println("Car Engine : "+c.getType());
        System.out.println("Car Speed  : "+c.getSpeed()+" Km/hr");
        
        System.out.println("\n\n");
        Truck trk = new Truck();
        System.out.println("Truck Power  : "+trk.getPower()+" KW");
        System.out.println("Truck Engine : "+trk.getType());
        System.out.println("Truck Speed  : "+trk.getSpeed()+" Km/hr");
        
        System.out.println("\n\n");
        Train trn = new Train();
        System.out.println("Train Power  : "+trn.getPower()+" KW");
        System.out.println("Train Engine : "+trn.getType());
        System.out.println("Train Speed  : "+trn.getSpeed()+" Km/hr");
        
        System.out.println("\n\n");
        Bus b = new Bus();
        System.out.println("Bus Power  : "+b.getPower()+" KW");
        System.out.println("Bus Engine : "+b.getType());
        System.out.println("Bus Speed  : "+b.getSpeed()+" Km/hr");
    }
}
