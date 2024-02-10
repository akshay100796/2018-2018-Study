#include<stdio.h>
#include<stdlib.h>
int input();
int add();
int sub();
int mult();
int A[3][3],B[3][3],C[3][3];
int main()
{
	int n;
	input();
	do
	{
		printf("\n\t\t*********Matrix Menu*******");
		printf("\n\t\t1. Addition");
		printf("\n\t\t2. Substraction");
		printf("\n\t\t3. Multiplication");
		printf("\n\t\t4. Exit");
		printf("\n\t\t*  Enter your choice  :  ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				mult();
			break;
			case 4:
				exit(0);
				break;
			default:
				printf("Choice not match found...Please try again");
				break;		
		}
	}while(n!=5);
}
int input()
{
	
	int i,j;
	printf("\n Values for matrix A ");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\n Enter value at [%d][%d] Location  : ",i,j);
			scanf("%d",&A[i][j]);
		}
	}
	printf("\n ________________________________________________________");
	printf("\n values for matrix B ");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\n Enter value at [%d][%d] Location for B  : ",i,j);
			scanf("%d",&B[i][j]);
		}
	}
}
int add()
{
	int i, j ;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			C[i][j]=A[i][j]+B[i][j];
		}
	}
	printf("\n Addition of  matrix A & B is :\n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t%d ",C[i][j]);
		}
		printf("\n\n");
	}
}

int sub()
{
	int i, j ;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			C[i][j]=A[i][j]-B[i][j];
		}
	}
	printf("\n Substraction of  matrix A & B is :\n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t%d ",C[i][j]);
		}
		printf("\n\n");
	}
}

int mult()
{
	int i,j;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			int sum=0;
			for(int k=0;k<=2;k++)
			{
				sum=sum+A[i][k]*B[k][j];
				C[i][j]=sum;
			}
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t%d ",C[i][j]);
		}
		printf("\n\n");
	}
}

































