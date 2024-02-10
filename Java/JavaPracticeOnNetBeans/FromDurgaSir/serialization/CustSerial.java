
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Custom implements Serializable
{
    String name = "Akshay Pawar";
    transient int pin = 1234;
    transient String passwd = "Akshay@123";
    
    private void writeObject(ObjectOutputStream os) throws IOException
    {
        os.defaultWriteObject();
        int epin = pin+4567;
        os.writeInt(epin);
        String epsswd = "123"+passwd;
        os.writeObject(epsswd);
    }
    
    private void readObject(ObjectInputStream oin) throws ClassNotFoundException,IOException
    {
        oin.defaultReadObject();
        int pinNo = oin.readInt();
        pin = pinNo-4567;
        String epswd = (String)oin.readObject();
        passwd = epswd.substring(3, epswd.length());
    } 
    
}
public class CustSerial 
{
    public static void main(String[] args) throws Exception
    {
        Custom c = new Custom();
        FileOutputStream fout = new FileOutputStream("Customized.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(c);

        FileInputStream fin = new FileInputStream("Customized.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Custom c1 = (Custom)oin.readObject();

        System.out.println("Name     : "+c1.name);
        System.out.println("Pin  No  : "+c1.pin);
        System.out.println("Password : "+c1.passwd);
    }
}
