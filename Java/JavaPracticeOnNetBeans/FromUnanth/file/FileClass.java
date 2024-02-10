
package Unanth_File;

import java.io.File;
import java.io.IOException;

public class FileClass 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("File.txt");
        f.createNewFile();
        System.out.println("Absolute path   : "+f.getAbsolutePath());
        System.out.println("Canonical Path  : "+f.getCanonicalPath());
        System.out.println("Class           : "+f.getClass());
        System.out.println("Free Space      : "+f.getFreeSpace());
        System.out.println("Name            : "+f.getName());
        System.out.println("parent          : "+f.getParent());
        System.out.println("Parent File     : "+f.getParentFile());
        System.out.println("Path            : "+f.getPath());
        System.out.println("Total Space     : "+f.getTotalSpace());
        System.out.println("Usable Space    : "+f.getUsableSpace());
        System.out.println("Hash Code       : "+f.hashCode());
        System.out.println("Path Separator  : "+f.pathSeparator);
        System.out.println("Path Separator Character : "+f.pathSeparatorChar);
        System.out.println("Separator       : "+f.separator);
        System.out.println("Separator Char  : "+f.separatorChar);
        System.out.println("Is Absolute     : "+f.isAbsolute());
        System.out.println("Is Directory    : "+f.isDirectory());
        System.out.println("Is File         : "+f.isFile());
        System.out.println("Is Hidden       : "+f.isHidden());
        System.out.println("Last Modified   : "+f.lastModified());
        System.out.println("Length          : "+f.length());
        System.out.println("Set readable    : "+f.setReadable(true));
        System.out.println("To Path         : "+f.toPath());
        System.out.println("To String       : "+f.toString());
        System.out.println("To URI          : "+f.toURI());
    }
}




















