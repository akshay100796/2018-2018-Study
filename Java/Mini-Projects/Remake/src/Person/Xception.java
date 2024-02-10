
package Remake.src.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){System.err.println("/ by 0");}
    }
}
________________________________________________________________________________
public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            int[] a = new int[10];
            int b = a[20];
        }catch(ArrayIndexOutOfBoundsException e){System.err.println("Invalid accesing");}
    }
}
________________________________________________________________________________

public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            String s = null;
            int l = s.length();
        }catch(NullPointerException e){System.err.println("Null String Detected");}
    }
}
________________________________________________________________________________
public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            String s = "Akshay";
            char c = s.charAt(10);
        }catch(StringIndexOutOfBoundsException e){System.err.println("Insufficiant string");}
    }
}
________________________________________________________________________________

public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            File f = new File("Axe");
            FileReader r = new FileReader(f);
        }catch(FileNotFoundException e){System.err.println("File Not Found");}
    }
}
________________________________________________________________________________

public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            String s = "axe";
            int i = Integer.parseInt(s);
        }catch(NumberFormatException e){System.err.println("it is String ");}
    }
}
________________________________________________________________________________*/

public class Xception 
{
    public static void main(String[] args) 
    {
        try{
            int[] a = new int[10];
            int b = a[20];
        }catch(ArrayIndexOutOfBoundsException e){System.err.println("Invalid accesing");}
    }
}