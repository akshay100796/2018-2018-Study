/*
package Unanth_File;

public class SystemIn 
{
    public static void main(String[] args)
    {
        byte buff[] = new byte[100];
        System.out.println("Enter Any Text  : ");
        try {
            System.in.read(buff);
        } catch (Exception e) {e.printStackTrace();}
        String s = new String(buff);
        System.out.println(s);
    }
}
_________________________________________________________________________
package Unanth_File;

public class SystemIn 
{
    public static void main(String[] args)
    {
        byte buf[] = new byte[100];
        try {
            System.in.read(buf);
        } catch (Exception e) { }
        String s = new String(buf);
        System.out.println(s);
    }
}
_________________________________________________________________________
*/
package Unanth_File;

import java.io.IOException;

public class SystemIn 
{
    public static void main(String[] args) throws IOException
    {
        char a;
        System.out.println("Enter Character : ");
        a = (char)System.in.read();
        System.out.println(a);
    }
}




















