
package Basic_File_Operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInput 
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileInputStream f1 = new FileInputStream("File1.txt");
        FileInputStream f2 = new FileInputStream("File2.txt"); 
        SequenceInputStream s = new SequenceInputStream(f2,f1);
        
        int i;
        while((i = s.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
}















