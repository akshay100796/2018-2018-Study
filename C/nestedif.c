#include<stdio.h>
int main()
{
	char key;
	printf("Enter Your Sex : ");
	scanf("%c",&key);
	if(key=='M' || key=='m')
	{
		printf("\n I am Male");
	}
	else
	{
		printf("I am Female");
	}
	return 0;
}
