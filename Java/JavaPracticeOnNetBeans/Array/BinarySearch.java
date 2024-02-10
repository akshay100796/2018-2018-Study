
package Array;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[10];
        int key;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter array Element at ["+i+"] Location : ");
            arr[i] = s.nextInt();
        }
        System.out.println("Enter Element to Search  : ");
        key = s.nextInt();
        int pos = Arrays.binarySearch(arr, key);
        System.out.println(key+" Found at ["+pos+"] Position");
    }
}
