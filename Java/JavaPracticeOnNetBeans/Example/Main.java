package Example;

public class Main 
{
    public static void main(String[] args) 
    {
        Player p = new Player(21, "Akshay", 65.5, 168.5);
        System.out.println("_______Player's Information______");
        System.out.println("Name    : "+p.getName()) ;
        System.out.println("Age     : "+p.getAge());
        System.out.println("Weight  : "+p.getWt());
        System.out.println("Height  : "+p.getHt());
        System.out.println("__________________________________");
        Cricket c = new Cricket(12, 8, 512, "Dhaka", 21, "Alex", 65.5, 170);
        System.out.println("_______Cricket Player_________");
        System.out.println("Total Matches  : "+c.getMatch());
        System.out.println("Total wicket   : "+c.getWicket());
        System.out.println("Total Score    : "+c.getScore());
        System.out.println("Stediam Place  : "+c.getStediam());
        System.out.println("Player Age     : "+c.getAge());
        System.out.println("Player Name    : "+c.getName());
        System.out.println("Player Weight  : "+c.getWt());
        System.out.println("Player Height  : "+c.getHt());
        System.out.println("__________________________________");
        Football f = new Football(30, 90, 21, "Akshay", 65.5, 168);
        System.out.println("_________Football Player________");
        System.out.println("Goals Make  : "+f.getGoal());
        System.out.println("Time taken  : "+f.getTime()+"min");
        System.out.println("Age         : "+f.getAge());
        System.out.println("Name        : "+f.getName());
        System.out.println("Weight      : "+f.getAge());
        System.out.println("Height      : "+f.getHt());
    }
}
