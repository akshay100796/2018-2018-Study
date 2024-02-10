/**
 * List All File and Folder
 * 
 * List of Files
 * 
 * List of Folders 
 * 
 */

/*
__________________________________________________________________________

package File_ByDurgaSir;

import java.io.File;

public class FileFolderChecking 
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        System.out.println(f.exists());
        String[] list = f.list();
        for(String s : list)
        {
            System.out.println(s);
        }
        
    }
}
_________________________________________________________________________

package File_ByDurgaSir;

import java.io.File;

public class FileFolderChecking
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        String[] list = f.list();
        for (String s : list)
        {
            File f1 = new File(f,s);
            if(f1.isFile())
            {
                System.out.println(s);
            }
        }
    }
}
______________________________________________________________________

package File_ByDurgaSir;

import java.io.File;

public class FileFolderChecking
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        String[] list = f.list();
        for (String s : list) 
        {
            File f1 = new File(f,s);
            if(f1.isDirectory())
            {
                System.out.println(s);
            }
        }   
    }
}
_________________________________________________________________________
package File_ByDurgaSir;

import java.io.File;

public class FileFolderChecking
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        String[] list = f.list();
        System.out.println("\nShowing Files Only...\n");
        for (String s : list) 
        {
            File f1 = new File(f,s);
            
            if(f1.isFile())
            {
                System.out.println(s);
            }
        }
        System.out.println("\nShowing Directory Only...\n");
        for (String s : list) 
        {
            File f1 = new File(f,s);
            if(f1.isDirectory())
            {
                System.out.println(s);
            }
        }
    }
}
____________________________________________________________________*/

package File_ByDurgaSir;

import java.io.File;

public class FileFolderChecking
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        String[] list = f.list();
        System.out.println("\nShowing Files Only...\n");
        for (String s : list) 
        {
            File f1 = new File(f,s);
            
            if(f1.isFile())
            {
                System.out.println(s);
            }
            if(f1.isDirectory())
            {
                System.out.println(s);
            }
        }
    }
}
















