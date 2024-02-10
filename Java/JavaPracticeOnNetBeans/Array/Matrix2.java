package root.src.Root;

import java.io.*;
import javax.swing.JOptionPane;

public class Matrix 
{
    public static void main(String[] args) throws IOException
    {
        int i,j,k,n,r,c;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n Enter Size of rows : ");
        r=Integer.parseInt(b.readLine());
        System.out.println("\n Enter Size of Columns : ");
        c = Integer.parseInt(b.readLine());
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];        
        System.out.println("Size of A["+r+"]["+c+"]");
        System.out.println("Size of B["+r+"]["+c+"]");
        System.out.println("Size of C["+r+"]["+c+"]");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Value at A["+i+"]["+j+"] "));
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                B[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Value at B["+i+"]["+j+"] "));
                System.out.print(B[i][j]+"\t");
            }
            System.out.print("\n");
        }     
        do
        {
            System.out.print("\n 1. Addition of Matrix ");
            System.out.print("\n 2. Substraction of Matrix ");
            System.out.print("\n 3. Multiplication of Matrix ");
            System.out.print("\n 4. Exit");
            System.out.print("\n    Enter your Choice : ");
            n = Integer.parseInt(b.readLine());
            switch(n)
            {
                case 1: 
                    System.out.println("\n");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            C[i][j]=A[i][j]+B[i][j];
                            System.out.print(C[i][j]+"\t");
                        }
                        System.out.println();
                    }
                break;
                case 2:
                    System.out.println("\n");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            C[i][j]=A[i][j]-B[i][j];
                            System.out.print(C[i][j]+"\t");
                        }
                        System.out.println();
                    }
                break;
                case 3:
                    System.out.println("\n");
                    if(r==c)
                    {
                        for(i=0;i<r;i++)
                        {
                            for(j=0;j<c;j++)
                            {
                                C[i][j]=0;
                                for(k=0;k<c;k++)
                                {
                                    C[i][j]+=A[i][k]*B[k][j];
                                }
                            }
                        }
                        for(i=0;i<r;i++)
                        {
                            for(j=0;j<c;j++)
                            {
                                System.out.print(C[i][j]+"\t");
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                    }
                    else
                        System.out.println("\n Multiplication Can't Perform Because "+r+"!="+c);
                break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again with Correct Choice..");
                    break;
            }
        }while(n!=4);
    }
}
