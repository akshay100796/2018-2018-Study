// Source Code		:  Operation of Matrix  -->  Addition ,  Substraction  ,  Multiplication


#include<stdio.h>
#include<stdlib.h>
int uservalu();
int display();
int addm();
int subm();
int multm();
int next();
int i,j,A[3][3],B[3][3],C[3][3];
int main()
{
	int n;
	do
	{
		printf("\n***-----MENU 4 MATRIX-----***");
		printf("\n 1. Enter No.'s For Matrix");
		printf("\n 2. Exit");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				uservalu();
				printf("\nCongrats...Valu Successfully Entered\n");
				break;
			case 2:
				exit(0);
				break;
			default : 
				printf("\nPlease Enter Correct Choice...");
				break;
		}
	}while(n!=2);
}

int uservalu()
{
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nNo's for First Matrix at [%d][%d] Location : ",i,j);
			scanf("%d",&A[i][j]);		
		}
	}
	printf("\n----------------------------------------------------------------\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nNo's for Second Matrix at [%d][%d] Location : ",i,j);
			scanf("%d",&B[i][j]);	
		}	
	}
	printf("\n");
	next();
}
int next()
{
	int n;
	do
	{
		printf("\n 1. Display Matrix");
		printf("\n 2. Addition of Matrix");
		printf("\n 3. Substraction of Matrix");
		printf("\n 4. Multiplication of Matrix");
		printf("\n 5. I Want to take new values for Matrix");
		printf("\n 6. Exit");
		printf("\n Enter Your choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				display();
				break;
			case 2:
				addm();
				break;
			case 3:
				subm();
				break;
			case 4:
				multm();
				break;
			case 5:
				uservalu();
				break;	
			case 6:
				exit(1);
				break;
			default:
				printf("\n Please...Enter Correct Choice");
				break;
		}
	}while(n!=6);
}

int display()
{
	printf("\nValues For Matrix A : \n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t\t%d",A[i][j]);
		}
		printf("\n\n\n");
	}
	printf("\n\n Values For Matrix B : \n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t\t%d",B[i][j]);
		}
		printf("\n\n\n");
	}
	return 0;
}


int addm()
{
	printf("\n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			C[i][j]=A[i][j]+B[i][j];		//Adding Matrix A & B
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t\t %d",C[i][j]);
		}
		printf("\n\n\n");
	}
	return 0;
}

int subm()
{
	printf("\n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			C[i][j]=A[i][j]-B[i][j];		//Substracting Matrix A & B
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\t\t %d",C[i][j]);
		}
		printf("\n\n\n");
	}
	return 0;
}
int multm()
{
	int k,sum;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			sum=0;
			for(k=0;k<=2;k++)
				sum=sum+A[i][k] * B[k][j];
			C[i][j]=sum;		
		}
	}
	for(i=0;i<=2;i++)
	{
		printf("\n");
		for(j=0;j<=2;j++)
		{
			printf("\t\t %d",C[i][j]);
		}
		printf("\n");
	}
	return 0;
}	
