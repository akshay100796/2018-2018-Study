
package Array;

import java.util.Scanner;

public class Matrix 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int i,j,row,col;
        System.out.println("Enter Size of Rows   :  ");
        row = s.nextInt();
        System.out.println("Enter Size of Column :  ");
        col = s.nextInt();
        int[][] mtx  = new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("Enter Elemrnt at ["+i+"]["+j+"] Location : ");
                mtx[i][j] = s.nextInt();
            }
        }
        int sum =0;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                
                System.out.print("\t"+mtx[i][j]);
                if(i==j)
                    sum = sum+mtx[i][j]; 
            }
            System.out.println("\n");
        }
        System.out.println("Sum is  : "+sum);
        
        
    }
}
