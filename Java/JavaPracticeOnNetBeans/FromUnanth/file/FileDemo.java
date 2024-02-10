
package Unanth_File;

import java.io.File;

public class FileDemo 
{
    public static void main(String[] args) 
    {
        String path = "C:\\Users\\Akshay\\Documents\\NetBeansProjects\\general";
        File f1 = new File(path,"First.txt");
        File f2 = new File(path,"Second.txt");
        
        System.out.println("Class  of First File   : "+f1.getClass());
        System.out.println("Path   of first File   : "+f1.getPath());
        System.out.println("Parent of First File   : "+f1.getParent());
        System.out.println("Name   of First File   : "+f1.getName());
        System.out.println("\n\n");
        System.out.println("Class  of Second File   : "+f2.getClass());
        System.out.println("Path   of Second File   : "+f2.getPath());
        System.out.println("Parent of Second File   : "+f2.getParent());
        System.out.println("Name   of Second File   : "+f2.getName());
        System.out.println("__________________________________________");
        File f = new File(path);
        String[] all = f.list();
        for(int i = 0; i < all.length ; i++)
        {
            File f5 = new File(all[i]);
            if(f5.isDirectory())
            {
                System.out.println(all[i]+" is a Directory");
            }
            else
            {
                System.out.println(all[i]);
            }
        }
    }
}
