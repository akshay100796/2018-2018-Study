#include<stdio.h>
#include<stdlib.h>
int user_valu();
int system_value();
int systemS();
int system2();
int system3();
int i,j,mtx[3][3],n;
int main()
{
	do
	{
		printf("\n 1: Take Your values for matrix...");
		printf("\n 2: System Values...");
		printf("\n 3. Exit");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1 :
				user_valu();
				break;
			case 2 :
				system_value();
				break;	
			case 3:
				exit(0);
				break;
		}
	}while(n!=2);
}
int user_valu()
{
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nEnter No at mtx[%d][%d] th Location : ",i,j);
			scanf("%d",&mtx[i][j]);
		}
	}
	for(i=0;i<=2;i++)
	{
		printf("\n\n");
		for(j=0;j<=2;j++)
		{
			printf("\t %d",mtx[i][j]);
		}
		printf("\n\n");
	}
}
int system_value()
{
	do
	{
		int n,i,j;
		printf("\n 1 : Systems Sequence Value...");
		printf("\n 2 : System  2 X 2 matrix...");
		printf("\n 3 : System  3 X 3 matrix...");
		printf("\n 4. Exit");
		printf("\nEnter Your choice  : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
					systemS();
					break;
			case 2:
					system2();
					break;
			case 3:
					system3();
					break;
			case 4:
					exit(1);
					break;
		}
	}while(n!=4);
}
int systemS()
{
	int i,j;
	int m[3][3]={1,2,3,4,5,6,7,8,9};
	printf("\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)	
		{
			printf("\t\t %d",m[i][j]);
		}	
	printf("\n\n\n");
	}
}
int system2()
{
	int i,j;
	int mtx[2][2]={1,0,0,1};
	for(i=0;i<=1;i++)
	{
		printf("\n");
		for(j=0;j<=1;j++)
		{
			printf("\t\t %d ",mtx[i][j]);
		}
		printf("\n\n");
	}
}
int system3()
{
	int i,j;
	int matx[3][3]={1,0,0,0,1,0,0,0,1};
	for(i=0;i<=2;i++)
	{
		printf("\n");
		for(j=0;j<=2;j++)
		{
			printf("\t\t %d ",matx[i][j]);
		}
		printf("\n\n");
	}
}

