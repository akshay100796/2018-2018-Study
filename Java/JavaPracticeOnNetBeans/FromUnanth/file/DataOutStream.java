
package Unanth_File;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutStream 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\Primary.txt");
        DataOutputStream din = new DataOutputStream(new FileOutputStream(f));
        byte[] ch = {'S','V','I','T'}; 
        din.write('X');
        din.write(10);
        din.write(ch);
        din.writeBoolean(true);
        din.writeByte(128);
        din.writeBytes("\nIndian Institude of Technology\n");
        din.writeChar('R');
        din.write(10);
        din.writeDouble(1.745);
        din.writeFloat(3.7f);
        din.writeUTF("SYSTEM");
        System.out.println(din.getClass());
        System.out.println(din.size());
        
        
        din.flush();
        din.close();
        
    }
}
