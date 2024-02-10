
package File_ByDurgaSir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile 
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\File_ByDurgaSir\\printW.java");
        BufferedReader r = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general\\src\\File.txt");
        String s = r.readLine();
        while (s != null)
        {            
            pw.println(s);
            s = r.readLine();
        }
        pw.flush();
        pw.close();
        r.close();
        
        
    }
}
