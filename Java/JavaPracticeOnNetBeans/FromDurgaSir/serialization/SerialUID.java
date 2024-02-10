
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Data implements Serializable
{
    private static final long serialVersionUID = 1526L;
    String passwd = "Akshay123@$P";
    int pin = 1782;
}
class Sender
{
    public static void main(String[] args) throws ClassNotFoundException,IOException
    {
        Data d = new Data();
        FileOutputStream fout = new FileOutputStream("UID.obj");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(d);
    }
}
class Reciver
{
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("UID.obj"));
        Data d1 = (Data) oin.readObject();
        System.out.println("Password : "+d1.passwd);
        System.out.println("Pin      : "+d1.pin);
    }
}
public class SerialUID 
{
    
}
