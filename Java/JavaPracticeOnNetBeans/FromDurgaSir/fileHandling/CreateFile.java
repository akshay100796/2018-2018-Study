/*
package Basic_File_Operation;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
public static void main(String[] args) throws IOException
{
File f = new File("./Creating.txt");
System.out.println("File Created : "+f.exists());
f.createNewFile();
System.out.println("After CreateNewFile() method : "+f.exists());


}
}*/


package Basic_File_Operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CreateFile 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("./Creating.txt");
        try {
            boolean b = f.createNewFile();
            System.out.println("File created : "+b);
            boolean d = f.delete();
            System.out.println("File deleted : "+d);
        } catch (FileNotFoundException e) {System.out.println("No File");        }
        
    }
}
