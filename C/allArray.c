/* 

PROG  :  Finding the avrage of Student Marks with help of Array

#include<stdio.h>
int main()
{
	int marks[5],i,j,sum=0;
	float Avg;
	for(i=0;i<=4;i++)
	{
		printf("\n Enter Your Marks  :  ");
		scanf("%d",&marks[i]);
	}
	for(i=0;i<=4;i++)
	{
		sum=sum+marks[i];
	}
	Avg=sum/5;
	printf("\n Avrage of Student Marks is : %f ",Avg);
	return 0;
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
PROG  :  for loop max than declaring array

#include<stdio.h>
int main()
{
	int i,mtx[5];
	for(i=0;i<10;i++)
	{
		printf("\n %d",mtx[i]);
	}
}

o/p : This Program Gives(Print) Garbage Value up to for loop Condition (i<10)
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/


/*

PROG  :  Programm to Print Address & its Index No.
 
#include<stdio.h>
int main()
{
	int arr[10],i;
	for(i=0;i<10;i++)
	{
		printf("Enter No.  :  ");
		scanf("%d",&arr[i]);
	}
	for(i=0;i<10;i++)
	{
		printf("\n Index No arr[%d]=%d \t Address is : %u ",i,arr[i], &i);
		printf("Address is  :  %u",i);
	}
	return 0;
}

o/p  :  Address Does not Shown Properly  It Show Same adress to all
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

/*
PROG  :  Send Array element to Fun()  

#include<stdio.h>
int display(int);
int main()
{
	int i;
	int arr[]= {45,65,75,85,95,100};
	for(i=0;i<=5;i++)
	{
		display(arr[i]);
	}
	return 0;
}
int display(int m)
{
		printf("%d\t",m);
		return 0;
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
 PROG   :  Take one int one float & one char , print it , store it Address , 
 		   Display it Address , increment Address , show new Address .

#include<stdio.h>
int main()
{
	int a=3,*x;
	float b=3.14285714,*y;
	char c='A',*z;
	x=&a;
	y=&b;
	z=&c;
	printf("\n a = %d",a);
	printf("\n b = %f",b);
	printf("\n c = %c",c);
	printf("\n\n");
	printf("\n Address of a = %u",&a);
	printf("\n Address of b = %u",&b);
	printf("\n Address of c = %u",&c);
	printf("\n\n");
	printf("\n Address of x = %u",x);
	printf("\n Address of y = %u",y);
	printf("\n Address of z = %u",z);
	printf("\n\n");	
	x++;
	y++;
	z++;
	printf("\n New Address of x = %u",x);
	printf("\n New Address of y = %u",y);
	printf("\n New Address of z = %u",z);
	printf("\n\n");
	return 0;
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

/* PROG   :  Show the Entered Array Element & it's Address

#include<stdio.h>
int main()
{
	int i;
	int arr[] ={75,12,45,36,89,21};
	int *j;
	for(i=0;i<=5;i++)
	{
		j=&arr[i];
		printf("\n Address of Array : %d ",j);
		printf("\n Entered Array : %d ",*j);
		printf("\n\n");
	}

}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/


/*
PROG    :  Access Same element by Four way

#include<stdio.h>
int main()
{
	int i;
	int arr[]={12,45,78,98,65,32};
	for(i=0;i<=5;i++)
	{
	/*	printf("\n\n Element is : %d",arr[i]);
		printf("\n\n Element is : %d",i[arr]);
		printf("\n\n Element is : %d",*(arr+i));
		printf("\n\n Element is : %d",*(i+arr));
	OR------------------------------------------------------------------------------
		printf("\n\nElement is : \t%d\t%d\t%d\t%d",arr[i],i[arr],*(arr+i),*(i+arr));
	}
	return 0;
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

/*
 PROG   :  	Simple 3D Array  & Enter No To See that Element

#include<stdio.h>
int main()
{
	int i,j,k;
	int arr[3][2][2] =  {
					{
					
						{1,50},
						{2,45},
						{3,78},
						{4,55}
					},
					{
						{5,90},
						{6,75},
						{7,98},
						{8,35}
					},
					{
						{9,53},
						{10,46},
						{11,77},
						{12,51}
					}
				};
	printf("\n Enter an Element to See  : ");
	scanf("%d%d%d",&i,&j,&k);
	printf("\n\n Element = %d",arr[i][j][k]);
	return 0;
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

/*
PROG   :  Show Matrix From Given Number

#include<stdio.h>
int main()
{
	int i,j;
	int mtx[3][3] ={1,2,3,4,5,6,7,8,9};
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf(" \t\t %d ",mtx[i][j]);
		}
		printf("\n\n\n");
	}
	return 0;
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PROG    : Enter row & Column of Matrix take value from user    <It doesn't  executes , Hang>   

#include<stdio.h>
int main()
{
	int i,j,r,c;
	int mtx[r][c];
	printf("Enter Number Of Rows You want  :  ");
	scanf("%d",&r);
	printf("Enter Number Of Colm You want  :  ");
	scanf("%d",&c);
	printf("\n Enter No's : ");
	for(i=0;i<=(r-1);i++)
	{
		for(j=0;j<=(c-1);j++)
		{
			scanf("%d",&mtx[i][j]);
		}
	}
	printf("\n Your Matrix is : \n");
	for(i=0;i<=r-1;i++)
	{
		for(j=0;j<=c-1;j++)
		{
			printf("%d",mtx[i][j]);
		}
	}
	return 0;	
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PROG     :   Show 1-D & 2-D Array according to user choice

#include<stdio.h>
int main()
{
	int i,j,k,n;
	printf("\n\nPress 1 for 1 Dimentional (1D) Array");
	printf("\n\nPress 2 for 2 Dimentional (2D) Array");
	printf("\n\nEnter Your choice  :  ");
	scanf("%d",&n);
	if(n==1)
	{
		int i,j;
		int arr[]={1,2,3,4,5,6,7,8,9};
		printf("\n");
		for(i=0;i<=8;i++)
		{
			printf("\t%d",arr[i]);
		}
		printf("\n");
	}
	else if(n==2)
	{
		int i,j;
		int mtx[3][3]={1,2,3,4,5,6,7,8,9};
		printf("\n");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				printf("\t\t%d",mtx[i][j]);
			}
			printf("\n\n");
		}
	}
	else
	{
		printf("Sorry...Your choice Doesn't match \n We can't Display Array");
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
