
package general;

import java.util.Scanner;

public class Lecture
{
    public static void main(String[] args) 
    {
        int i,n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.println("How Many Names Do you Have : ");
        n = s.nextInt();
        String[] name = new String[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Name : ");
            name[i] = s.nextLine();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(name[i]);
        }
    }
}
