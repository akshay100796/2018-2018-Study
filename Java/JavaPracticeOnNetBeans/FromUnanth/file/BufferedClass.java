
package Unanth_File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedClass 
{
    public static void main(String[] args) throws IOException
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ESDS.txt"))) {
            System.out.println("Enter Text : ");
            int c;
            while ((c = System.in.read()) != -1)
            {
                bw.write(c);
            }
            bw.flush();
        }
    }
}
