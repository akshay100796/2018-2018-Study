/*
PROG	: Prog to get reverce given No.

#include<stdio.h>
int main()
{
	int a,n,r=0;
	printf("\n Enter any no to get it reverce :  ");
	scanf("%d",&n);
	while(n>=1)
	{
		a=n%10;
		r=r*10+a;
		n=n/10;
	}
	printf("\n Reverce no : %d",r);
	return 0;
}

PROG	: Table of any NO.

#include<stdio.h>
int main()
{
	int i,n,a;
	printf("Enter No for its table : ");
	scanf("%d",&n);
	for(i=1;i<=10;i++)
	{
		a=n*i;
		printf("\n %d * %d  = %d",n,i,a);
	}
	return 0;
}
*/
#include<stdio.h>
int main()
{
	int i,j;							+
	for(i=1;i<=7;i++)					++
	{									+++
		for(j=1;j<=i;j++)				++++
			printf("+");				+++++
		printf("\n");					++++++
	}
}

