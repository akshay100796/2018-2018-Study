
package Unanth_File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutput 
{
    public static void main(String[] args) throws FileNotFoundException ,IOException
    {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("SystemFile.txt"));
        byte[] b = {'A','k','s','h','a','y'};
        out.write(b);
        
        out.writeInt(88);
        out.write(10);
        out.write(b, 0, 5);
        out.writeChars("\nSVIT Collage Sinnar\n");
        for (int i = 65; i < 90; i++) 
        {
            out.write(i);
        }
        out.writeUTF("\nAcadamic Student of Chincholi Collage\n");
        out.flush();
        out.close();
        
        DataInputStream in = new DataInputStream(new FileInputStream("SystemFile.txt"));
        int i=0;
        while((i=in.read()) != -1)
        {
            System.out.print((char)i);
        }
        
    }
}
