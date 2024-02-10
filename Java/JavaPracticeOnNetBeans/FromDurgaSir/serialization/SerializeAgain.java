
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ObjState implements Serializable
{
    String name = "Akshay";
    int age = 22;
    String Collage = "SVIT Chincholi Nashik";
    String Occupation = "Student";
}

public class SerializeAgain 
{
    public static void main(String[] args) throws Exception
    {
        ObjState obj = new ObjState();
        FileOutputStream fout = new FileOutputStream("Serial.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(obj);
        System.out.println("After Deserialized");
        
        FileInputStream fin = new FileInputStream("Serial.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        //ObjState os = (ObjState)oin.readObject();
        
        
        ObjState os = new ObjState();
        os = (ObjState)oin.readObject();
        
        
        System.out.println("Name       : "+os.name);
        System.out.println("Age        : "+os.age);
        System.out.println("Collage    : "+os.Collage);
        System.out.println("Occupation : "+os.Occupation);
    }
}
