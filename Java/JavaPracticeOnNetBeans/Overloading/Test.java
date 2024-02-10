package Overloading;
public class Test 
{
    public static void main(String[] args) 
    {
        Circle c1 =new Circle();
        Circle c2 = new Circle(10,"Black");
        c2.setArea(10);
        System.out.println("______Circle_____");        
        System.out.println("______By get Method ______");
        System.out.println("Radias of Circle  :  "+c2.getRadias());
        System.out.println("Color of Circle : "+c2.getColor());
        System.out.println("Area of Circle  : "+c2.getArea());
   
        Cylinder cy=new Cylinder();
        Cylinder cy1 = new Cylinder(25,10,"Black");
        cy1.setArea(25);
        System.out.println("______Cylinder________");        
        System.out.println("______By get Method ______");  
        System.out.println("Radias of Cylinder  :  "+cy1.getRadias());
        System.out.println("Color of Cylinder   :  "+cy1.getColor());
        System.out.println("Area of Cylinder    :  "+cy1.getArea());
    }
    
}
