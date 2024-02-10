/*
package Unanth_File;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\File.txt");
        RandomAccessFile r = new RandomAccessFile(f, "rw");
        r.write(65);
        r.writeChar('A');
        r.writeChars("Akshay");
        r.writeBoolean(true);
        r.seek(0);
        r.write(68);
        System.out.println(r.read());
    }
 
}
*/
package Unanth_File;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\File.txt");
        f.createNewFile();
        String str = "NULL POINTER STRING";
        RandomAccessFile r = new RandomAccessFile(f, "rw");
        r.write(65);
        r.write('P');
        r.writeBoolean(true);
        r.writeByte(97);
        r.writeChar(32);
        r.writeChars("Akshay Pawar");
        r.writeDouble(123.456);
        r.writeFloat(125.985f);
        r.writeUTF(str);
        
        RandomAccessFile fr = new RandomAccessFile(f, "r");
        System.out.println(fr.readBoolean());
        System.out.println(fr.readChar());
        System.out.println(fr.readInt());
        
    }
}





























