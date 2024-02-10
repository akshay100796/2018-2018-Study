
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialDemo implements Serializable
{
    String name = "Akshay Pawar";
    int age = 22;
    String collage = "SVIT Chincholi Nashik";
}
public class Serialize 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fout = new FileOutputStream("Data.obj");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        SerialDemo s1 = new SerialDemo();
        out.writeObject(s1);
        
        try {Thread.sleep(2000);} catch (Exception e) {System.out.println(e);}
        FileInputStream fin = new FileInputStream("Data.obj");
        ObjectInputStream in = new ObjectInputStream(fin);
        SerialDemo s2 = (SerialDemo)in.readObject();
        
        System.out.println("Name    : "+s2.name);
        System.out.println("Age     : "+s2.age);
        System.out.println("Collage : "+s2.collage);      
    }
}
