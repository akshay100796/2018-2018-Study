/*
package Serialization_ByDurgaSir;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalDemo implements Externalizable
{
    String name;
    int rn,mrks;

    public ExternalDemo() {}

    
    public ExternalDemo(int rn, int mrks,String name)
    {
        this.rn = rn;
        this.mrks = mrks;
        this.name = name;
    }
    
    @Override
    public void writeExternal(ObjectOutput os) throws IOException
    {
        os.writeObject(name);
        os.writeInt(rn);
        os.writeInt(mrks);
    }
    
    @Override
    public void readExternal(ObjectInput oin) throws ClassNotFoundException,IOException
    {
        name = (String)oin.readObject();
        rn = oin.readInt();
        mrks = oin.readInt();
    }
}
public class Externalization 
{
    public static void main(String[] args) throws Exception
    {
        ExternalDemo e = new ExternalDemo(10,98,"Akshay Pawar");
        FileOutputStream fout = new FileOutputStream("Exter.txt");
        ObjectOutput out = new ObjectOutputStream(fout);
        out.writeObject(e);
        
        FileInputStream fin = new FileInputStream("Exter.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        ExternalDemo x = (ExternalDemo) oin.readObject();
        
        System.out.println("Roll No : "+x.rn);
        System.out.println("Marks   : "+x.mrks);
        System.out.println("Name    : "+x.name);
    }
}
_________________________________________________________________

Source Code  : Save all Objects/Data in File  and retrive Specific 


by Doing this , OptionalDataException Occure

to remove this We have to read All Object 

After reading all Object you can display Specific Data which you want 

------------------------------->


package Serialization_ByDurgaSir;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalDemo implements Externalizable
{
    String name = "Akshay Sunil Pawar";
    long AccNo = 109410038505L;
    int pin = 1782;
    String branch = "Dena Bank";
    String ifsc ="BKDN0521419";
    String city = "Nashik";
    String town = "Sinnar";
    int balence = 5_000_000;
    long ATMNo = 9400_7957_2982L;

    public ExternalDemo() {}
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(name);
        out.writeLong(AccNo);
        out.writeInt(pin);
        out.writeObject(branch);
        out.writeObject(ifsc);
        out.writeObject(city);
        out.writeObject(town);
        out.writeInt(balence);
        out.writeLong(ATMNo);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
    {
        name = (String) in.readObject();
        AccNo = in.readLong();
        pin = in.readInt();
        branch = (String)in.readObject();
        ifsc = (String)in.readObject();
        city = (String)in.readObject();
        town = (String)in.readObject();
        balence = in.readInt();
        ATMNo = in.readLong();
        
    }
    
}
public class Externalization 
{
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
    {
        ExternalDemo e = new ExternalDemo();
        
        FileOutputStream fout = new FileOutputStream("DenaBank.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(e);
        FileInputStream fin = new FileInputStream("DenaBank.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        ExternalDemo ed = (ExternalDemo) ois.readObject();
        
        System.out.println("Account Holder Name : "+ed.name);
        System.out.println("Account Number      : "+ed.AccNo);
        System.out.println("IFSC Code Number    : "+ed.ifsc);
    }
}
*/























