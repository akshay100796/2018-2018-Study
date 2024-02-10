/*
package File_ByDurgaSir;

import java.io.File;
import java.io.IOException;
public class Basic 
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("Akshay");
        f1.mkdir();
        File f2 = new File(f1,"Folder-1");
        f2.mkdir();
        File f3 = new File(f2,"Folder-2");
        f3.mkdir();
        File f4 = new File(f3,"Folder-3");
        f4.mkdir();
        File f = new File(f4,"Sample.txt");
        f.createNewFile();
        
    }
}
_______________________________________________________________________

package File_ByDurgaSir;

import java.io.File;
import java.io.IOException;

public class Basic
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("Axe.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
       
    }
}
_______________________________________________________________________
package File_ByDurgaSir;

import java.io.File;

public class Basic
{
    public static void main(String[] args) 
    {
        File f = new File("Directories");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
_______________________________________________________________________*/
package File_ByDurgaSir;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Basic
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src", "string.java");
        FileReader r = new FileReader(f);
        int i = r.read();
        while (i != -1)
        {            
            System.out.print((char)i);
            i = r.read();
        }
    }
}



