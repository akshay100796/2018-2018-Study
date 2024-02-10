
package File_ByDurgaSir;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
    public static void main(String[] args) throws IOException
    {
        FileWriter w = new FileWriter("Sample.txt");
        System.out.println();
        w.write("Akshay");
        w.append('A');
    }
}
