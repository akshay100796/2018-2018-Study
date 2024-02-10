/**
 * File f = new File("FileName");
 * PrintWriter p = new PrintWriter(f);
 * _____________________________________________
 * 
 * PrintWriter p = new PrintWriter("FileName");
 * ____________________________________________
 * 
 * FileWriter w = new FileWriter("FileName");
 * PrintWriter p = new PrintWriter(w);
 * 
 * ____________________________________________
 * 
 * FileWriter w = new FileWriter("FileName");
 * PrintWriter p = new PrintWriter(w,boolean append);
 * 
 * ____________________________________________
 * 
 */

/*

package File_ByDurgaSir;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class PrintW 
{
    public static void main(String[] args) throws IOException
    {
        FileWriter w = new FileWriter("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\File.txt");
        PrintWriter p = new PrintWriter(w);
        
        char[] c = {'S','V','I','T'};
        p.print("Akshay pawar\n");
        p.write(c);
        p.write(97);
        p.write("\n-------------------\n");
        p.print("String Printed");
        p.print(true);
        p.print('X');
        p.print(12.5);
        p.print(100);
        p.println("Println ");
        p.println(false);
        p.println('O');
        p.println(55.55);
        p.println(5000);
        p.println("____________________________");
        p.append("AAAAAAAAAAAAAAAAaa");
        
        p.flush();
    }
}
_____________________________________________________________________________


package File_ByDurgaSir;

import java.io.PrintWriter;
import java.io.IOException;
public class PrintW
{
    public static void main(String[] args) throws IOException
    {
        char[] c = {'S','V','I','T'};
        PrintWriter w = new PrintWriter("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\File.txt");
        w.write("Akshay\n");
        w.write("Pawar\n");
        w.write(c);
        w.write('\n');
        w.write(65);
        w.flush();
    }
} 
____________________________________________________________________________
package File_ByDurgaSir;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintW
{
    public static void main(String[] args) throws IOException
    {
        String s = "Akshay Sunil Pawar";
        char[] c = {'A','x','e'};
        PrintWriter w = new PrintWriter("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\Print.txt");
        w.print("SVIT Collage of Engineering\n");
        w.print("String : "+s);
        w.println();
        w.print(true);
        w.println();
        w.print('A');
        w.println();
        w.print(c);
        w.println();
        w.print(150.88787);
        w.println();
        w.print(54.66f);
        w.println();
        w.print(214744);
        w.println();
        w.printf("My String is : "+s);
        w.flush();
    }
}
____________________________________________________________________________

package File_ByDurgaSir;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintW
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter p = new PrintWriter("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\Println.txt");
        String s = "Second Line";
        char[] c = {'T','h','i','r','d',' ','L','i','n','e'};
        boolean b = true;
        p.println("First Line");
        p.println(s);
        p.println(c);
        p.println(b);
        p.println('A');
        p.println(97);
        p.println(97.56f);
        p.println(1000);
        p.println(9999L);
        p.flush();
        p.close();
    }
}
_________________________________________________________________________*/



























