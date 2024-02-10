
package File_ByDurgaSir;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo 
{
    public static void main(String[] args) throws IOException
    {
        FileReader r = new FileReader("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\File_ByDurgaSir\\Basic.java");
        
        int i = r.read();
        while (i != -1)
        {            
            System.out.print((char)i);
            i = r.read();
        }
    }
}
