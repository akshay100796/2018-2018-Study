/*
package File_ByDurgaSir;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedR
{
    public static void main(String[] args) throws IOException
    {
        FileReader f = new FileReader("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\Array.java");
        BufferedReader br = new BufferedReader(f);
        int i = br.read();
        while (i != -1)
        {            
            System.out.print((char)i);
            i = br.read();
        }
    }
}
__________________________________________________________________
*/

package File_ByDurgaSir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedR
{
    public static void main(String[] args) throws IOException
    {
        FileReader r = new FileReader("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\Array.java");
        BufferedReader br = new BufferedReader(r);
        String line = br.readLine();
        while (line != null) 
        {            
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
















