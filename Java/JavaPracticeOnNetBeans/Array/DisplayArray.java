
package Array;

import java.util.Scanner;

public class DisplayArray 
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);
        int i,sum=0;
        for(i=0;i<arr.length;i++)
        {
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]= s.nextInt();
            sum = sum + arr[i]; //   || sum += arr[i];
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
        System.out.println("\nSum = "+sum+"\n");
    }
}
