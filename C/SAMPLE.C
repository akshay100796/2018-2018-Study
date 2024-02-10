#include<stdio.h>
#include<conio.h>
int add(int,int);
int sub(int,int);
int mult(int,int);
float div(int,int);
int mod(int,int);
int main()
{
	int a,b;
	printf("\n \t Enter any two No :  ");
	scanf("%d%d",&a,&b);
	add(a,b);
	sub(a,b);
	mult(a,b);
	div(a,b);
	mod(a,b);
	printf("\n\nWelcome Back to main() Function...");
	getch();
	return 0;

}
int add(int x,int y)
{
	int z;
	z=x+y;
	printf("\n\n Addition is  :  %d",z);
}
int sub(int x,int y)
{
	int z;
	z=x-y;
	printf("\n\n Substraction is  :  %d",z);
}
int mult(int x,int y)
{
	int z;
	z=x*y;
	printf("\n\n multiplication is  :  %d",z);
}
float div(int x,int y)
{
	float z;
	z=x/y;
	printf("\n\n Division is  :  %5.2f",z);
}
int mod(int x,int y)
{
	int z;
	z=x%y;
	printf("\n\n Remainder is  :  %d",z);
}
