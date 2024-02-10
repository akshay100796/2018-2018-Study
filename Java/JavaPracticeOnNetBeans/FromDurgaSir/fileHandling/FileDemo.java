/**
 * 
 * File
 * 
 * FileWriter
 * FileReader
 * 
 * BufferedWriter
 * BufferedReader ------> Best for Reading
 * 
 * PrintWriter  --------> Best for Writing
 * 
 * 
 */

/*
package File_ByDurgaSir;

import java.io.File;
import java.io.IOException;

public class FileDemo 
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        System.out.println("Is Directry Exists : "+f.exists());
        f.mkdir();
        System.out.println("Now : "+f.exists());
        File f1 = new File(f,"JavaProg.java");
        System.out.println("Is File Exists  : "+f1.exists());
        f1.createNewFile();
        System.out.println("Now : "+f1.exists());        
    }
}
__________________________________________________________________________
package File_ByDurgaSir;

import java.io.File;

public class FileDemo
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        for (int i = 1; i <= 1000; i++)
        {
            File f = new File(f1,"NewFolder"+i);
            f.mkdir();
        }
    }
}
________________________________________________________________________
package File_ByDurgaSir;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM\\Biodata.c");
        System.out.println(f.exists());
        FileReader r = new FileReader(f);
        int i = r.read();
        while (i != -1)
        {            
            System.out.print((char)i);
            i = r.read();
        }
    }    
}
________________________________________________________________________
package File_ByDurgaSir;

import java.io.File;

public class FileDemo
{
    public static void main(String[] args)
    {
        int n=0;
        File f = new File("C:\\Users\\Akshay\\Desktop\\ALL_JAVA_PROGRAMM");
        String[] s = f.list();
        for (String str : s) 
        {
            n++;
            File f1 = new File(f,str);
            System.out.println(str);
        }
        System.out.println("Total Containt = "+n);
    }
}
________________________________________________________________________*/































