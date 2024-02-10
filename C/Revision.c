/*
Source Code		: This code take Single character & Print it
#include<stdio.h>
#include<conio.h>
void main()
{
	char read;
	puts("Enter character :");
	read=getchar();
	putchar(read);
	getch(); 
}
------------------------------------------------------------------------------------------------------------------------
Source Code		: This Code Take String & print it

#include<stdio.h>
#include<conio.h>
int main()
{
	char line[50];
	gets(line);
	puts(line);
	//system("cls");		for clear screen...it works
}
--------------------------------------------------------------------------------------------------------------------------

Source Code	: Knowing Size of Data type using "sizeof()"

#include<stdio.h>
int main()
{
	int i;
	long int li;
	short int si;
	char c;
	float f;
	double df;
	
	printf("\n Sizeof int          : %d",sizeof (i));
	printf("\n Sizeof long int     : %d",sizeof(li));
	printf("\n Sizeof short int    : %d",sizeof(si));
	printf("\n Sizeof char	     : %d",sizeof(c));
	printf("\n Sizeof float        : %d",sizeof(f));
	printf("\n Sizeof Double float : %d",sizeof(df));
}
----------------------------------------------------------------------------------------------------------------------------
#include<stdio.h>
#include<stdlib.h>
void gotoxy(int row ,int col);
int main()
{
	gotoxy(20,30);
	printf("Akshay Pawar");
	return 0;
}
void gotoxy(int row ,int col)						//This Function work on TC++ 
{
	HANDLE hStdout=GetStdHandle(STD_OUTPUT_HANDLE);
	COORD position={row , col};
	SetConsoleCursorPosition(hStdout,position);	
}
----------------------------------------------------------------------------------------------------------------------------
Source Code 	: Enter String & store in an 2D Array

#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,n;
	char *fname[10][10];
	printf("\n How many name you want to enter :  ");
	scanf("%d",&n);
	for(i=0;i<=n-1;i++)
	{
		printf("\n Enter Name at [%d][0] Location : ",i);	
		scanf("%s",&fname[i][0]);			
	}
	printf("\n Entered Name are : ");
	for(i=0;i<=n-1;i++)
		printf("\n\t%s",&fname[i][0]);			
}
----------------------------------------------------------------------------------------------------------------------------

Source Code 	: Find Square & Cube

#include<stdio.h>
int square();
int cube();
int main()
{
	int i,n,s,q;
	printf("\n 1. Square table");
	printf("\n 2. Cube table");
	printf("\n Enter Choice : ");
	scanf("%d",&n);
	switch(n)
	{
		case 1:
			printf("\n 1. See Square uptu : ");
			scanf("%d",&s);
			square(s);
			break;
		case 2:
			printf("\n 2. See Cube Upto: ");
			scanf("%d",&q);
			cube(q);
			break;
		default :
			printf("\n Invalid Selection...");
			break;
	}
}
int square(int x)
{
	int i;
	printf("\n No\tSquare");
	for(i=1;i<=x;i++)
		printf("\n %d\t%d",i,i*i);
	return(x);
}
int cube(int y)
{
	int i;
	printf("\n No\tCube");
	for(i=1;i<=y;i++)
		printf("\n %d\t%d",i,i*i*i);
	return(y);
}
----------------------------------------------------------------------------------------------------------------------------
Source Code  : To Find Path where Revision.c File is Store

#include<stdio.h>
int main(int argc,char *argv[])
{
	int x;
	printf("%d \n",argc);
	for(x=0;x<argc;x++)
		printf("%s\n\n\n\n",argv[x]);
	return 0;
}
----------------------------------------------------------------------------------------------------------------------------
*/
