
package Basic_File_Operation;

import java.io.File;
import java.io.IOException;

public class Permission 
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("ASP.txt");
        f.createNewFile();
        
        f.setExecutable(true);
        f.setReadable(false);
        f.setWritable(false);
        System.out.println("Readable  : "+f.canRead());
        System.out.println("Writable  : "+f.canWrite());
        System.out.println("Executable: "+f.canExecute());
        
    }
}
