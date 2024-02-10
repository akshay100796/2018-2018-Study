/**
 * 
 * Pin = 0   because you wrote
 * " public void read/writeObject() " No    instead of writing 
 * " private void read/writeObject() " yes
 * 
 * and hence you got pin = 0 due to a transient
 * 
 */

/*
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialDemo1 implements Serializable
{
    long accNo = 109410038505L;
    transient int pin = 1782;
    String name = "Akshay Sunil Pawar";
    String bank = "Dena Bank";
    private void writeObject(ObjectOutputStream os) throws IOException
    {
        os.defaultWriteObject();
        int epin = 8217+pin;
        os.writeInt(epin); 
    }
    private void readObject(ObjectInputStream in) throws Exception
    {
        in.defaultReadObject();
        int epin = in.readInt();
        pin = epin-8217;
    }
}
public class SerialTransiant
{
    public static void main(String[] args) throws Exception
    {
        SerialDemo1 d1 = new SerialDemo1();
        FileOutputStream fout = new FileOutputStream("Bank.obj");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(d1);
        
        FileInputStream fin = new FileInputStream("Bank.obj");
        ObjectInputStream oin = new ObjectInputStream(fin);
        SerialDemo1 d2 = (SerialDemo1)oin.readObject();
        System.out.println("Account No : "+d2.accNo);
        System.out.println("PinCode No : "+d2.pin);
        System.out.println("Acc. Holder Name : "+d2.name);
        System.out.println("Branch Name : "+d2.bank);

    }
}
__________________________________________________________________________
*/
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable
{
    transient final String name = "Akshay";
    transient int pin = 1234;
    
    private void writeObject(ObjectOutputStream os) throws Exception
    {
        os.defaultWriteObject();
        int epin = pin;
        os.writeInt(epin);
    }
    
    private void readObject(ObjectInputStream oin) throws Exception
    {
        oin.defaultReadObject();
        int epin = oin.readInt();
        pin = epin;
    }
}
public class SerialTransiant
{
    public static void main(String[] args) throws Exception
    {
        Test t1 = new Test();
        FileOutputStream fout = new FileOutputStream("Bank.ser");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(t1);
        
        FileInputStream fin = new FileInputStream("Bank.ser");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Test t2 = (Test)oin.readObject();
        
        System.out.println("Name  : "+t2.name);
        System.out.println("Pin   : "+t2.pin);
    }
} 

//____________________________________________________________________________


//package Serialization_ByDurgaSir;



















