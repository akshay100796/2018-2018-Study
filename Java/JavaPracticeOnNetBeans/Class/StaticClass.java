package NestedClass;

public class StaticClass 
{
    int age;
    String name;

    public StaticClass(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
     public void Display()
     {
         System.out.println("Age   : "+age);
         System.out.println("Name  : "+name);
     }
    
     static class Address
     {
        String lane,town,city,state,country;
        int pincode;

        public Address(String lane, String town, String city, String state, String country, int pincode)
        {
            this.lane = lane;
            this.town = town;
            this.city = city;
            this.state = state;
            this.country = country;
            this.pincode = pincode;
        }
        public void Display()
        {
            System.out.println("Address  : "+lane+" "+town+" ,"+city+" ,"+state+" ,"+country+" ,"+pincode);
        }  
     }
    
    public static void main(String[] args) 
    {
        StaticClass sc = new StaticClass(22, "Akshay Pawar");
        sc.Display();
        Address addr = new Address("Varandal farm", "Sinnar", "Nashik", "Maharashtra", "India", 422103);
        addr.Display();
    }
    
}
