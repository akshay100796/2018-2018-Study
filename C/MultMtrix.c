#include<stdio.h>
int main()
{
	int i,j,k,A[3][3],B[3][3],C[3][3],sum;
	printf("Enter valu for matrix A\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nValues at [%d][%d] Location  : ",i,j);
			scanf("%d",&A[i][j]);	
		}
	}
	printf("\n--------------------------------------------------------------------\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nValues at [%d][%d] Location for Matrix B : ",i,j);
			scanf("%d",&B[i][j]);	
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			sum=0;
			for(k=0;k<=2;k++)
				sum=sum+A[i][k]*B[k][j];						//IMP Code...........
			C[i][j]=sum;										// IMP Code........
		}
	}
	printf("\nMultiplication of Matrix is : ");
	printf("\n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t\t %d",C[i][j]);
		}
		printf("\n\n");
	}
	
}
