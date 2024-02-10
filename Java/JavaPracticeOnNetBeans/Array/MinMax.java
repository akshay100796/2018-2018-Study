
package Array;

import java.util.Scanner;

public class MinMax 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        int i,min,max;
        
        for(i=0;i<arr.length;i++)
        {
            System.out.println("Enter "+(i+1)+" Number");
            arr[i] = s.nextInt();
        }
        max = arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Max Value : "+max);
        min = arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Min Value : "+min);
    }
}
