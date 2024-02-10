package Akshay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllMatrix 
{   
    public static void main(String[] args) throws IOException
    {
        int r,c,i,j,n;
        int sumA=0;
        int sumB=0;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of rows : ");
        r=Integer.parseInt(b.readLine()); 
        System.out.println("Enter Size of Columns : ");
        c= Integer.parseInt(b.readLine());
        int A[][] =new int[r][c];
        int B[][] =new int[r][c];
        int C[][] =new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter the Element at A["+i+"]["+j+"] Location : ");
                A[i][j]=Integer.parseInt(b.readLine());
            }
        }
        System.out.println("_______________________________________________________");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter the Element at B["+i+"]["+j+"] Location : ");
                B[i][j]=Integer.parseInt(b.readLine());
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("\t"+A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("\t"+B[i][j]);
            }
            System.out.println();
        }
        do
        {
            System.out.println("1. Addition of Matrix  ");
            System.out.println("2. Substraction of matreix ");
            System.out.println("3. Multiplication of Matrix ");
            System.out.println("4. Addition of Diagonal ");
            System.out.println("5. Transpose of Matrix ");
            System.out.println("6. Inverse of Matrix ");
            System.out.println("7. Identity of Matrix ");
            System.out.println("8. Quit");
            System.out.println("   Enter your Chioice : ");
            n=Integer.parseInt(b.readLine());
            switch(n)
            {
                case 1:
                {   
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            C[i][j]=A[i][j]+B[i][j];
                        }
                    }
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+C[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                }
                break;    
                case 2:
                {   
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            C[i][j]=A[i][j]-B[i][j];
                        }
                    }
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+C[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                }
                break; 
                case 3:
                {
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {   
                            C[i][j]=0;
                            for(int k=0;k<r;k++)
                                C[i][j]+=A[i][k]*B[k][j];
                        }
                    }
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+C[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                }
                break;
                case 4:
                {
                    System.out.println("Addition of Diagonal for matrix A");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+A[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            if(i==j)
                            {
                                sumA = sumA + A[i][j];
                            }
                        }
                    }
                    System.out.println("Addition of Diagonal of Matrix A : "+sumA);
                    System.out.println("_______________________________________");
                    System.out.println("Addition of Diagonal for matrix B");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+B[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            if(i==j)
                            {
                                sumB=sumB+B[i][j];
                            }
                        }
                    }
                    System.out.println("Addition of Diagonal of Matrix A : "+sumB);
                }
                break;
                case 5:
                {
//   Method  1  for Transporting Matrix
                    System.out.println("Transpose of matrix A");
                    for(j=0;j<c;++j)
                    {
                        for(i=0;i<r;i++)
                        {
                            System.out.print("\t"+A[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    System.out.println("_______________________________________");
//   Method  2  for Transporting Matrix
                    System.out.println("Transpose of matrix B");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+B[j][i]); 
                        }
                        System.out.println();
                    }
                }
                break;
                case 6:
                    System.out.println("Sorry...Can't Inverse Now");
                    break;
                case 7:
                {
                    System.out.println("Identity Matrix of A ");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            if(i==j)
                                A[i][j]=1;
                            else
                                A[i][j]=0;
                        }
                    }
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+A[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    System.out.println("_____________________________________");
                    System.out.println("Identity Matrix of B ");
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            if(i==j)
                                B[i][j]=1;
                            else
                                B[i][j]=0;
                        }
                    }
                    for(i=0;i<r;i++)
                    {
                        for(j=0;j<c;j++)
                        {
                            System.out.print("\t"+B[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                }
                break;
                case 8:
                    System.exit(0);
            }            
        }while(n!=8);
    }
}
