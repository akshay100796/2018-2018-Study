#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter any two No. : ");
	scanf("%d%d",&a,&b);
	c=a-b;
	printf("\n\tSubstraction is : %d",c);
	if(c>=0)
	{
		printf("\n\twhich is Positive Number..... \n\n");
	}
	else
	{
		printf("\n\twhich is Negative Number..... \n\n");
	}
	return(0);
}



