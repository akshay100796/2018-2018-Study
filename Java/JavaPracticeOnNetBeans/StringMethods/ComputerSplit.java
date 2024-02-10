
package StringMethods;

public class ComputerSplit 
{   
    public static void main(String[] args) 
    {
        String parts = "Mouce=Keyboard=Monitor=CPU=Wifi=Router=Memory=Hardisk";
        String Computer[];
        Computer = parts.split("=");
//______________________________________________________________________________

        System.out.println(Computer[0]);
        System.out.println(Computer[1]);
        System.out.println(Computer[2]);
        System.out.println(Computer[3]);
        System.out.println(Computer[4]);
        System.out.println(Computer[5]);
        System.out.println(Computer[6]);
        System.out.println(Computer[7]);
        
//______________________________________________________________________________

        System.out.println("\n\n\n");
        for(String com : Computer)
            System.out.println(com);

//______________________________________________________________________________

        Computer = parts.split("=", 4);
        System.out.println("\n\n\n__________________________________");
        for(String com : Computer)
            System.out.println(com);
    }
}
