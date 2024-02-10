
package Unanth_File;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayRdr 
{
    public static void main(String[] args) throws IOException
    {
        char[] ch = {'A','k','s','h','a','y',' ','P','a','w','a','r'};
        CharArrayReader c = new CharArrayReader(ch);
        
        int i=0;
        while ((i = c.read()) != -1)
        {            
            System.out.print((char)i);
        }
    }
}
