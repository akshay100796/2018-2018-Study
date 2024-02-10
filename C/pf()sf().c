
#include<stdio.h>
#include<string.h>
int main()
{
	int t;
	char axe[10];
	char sdk[10];
	printf("\nEnter Your First Name : ");
	scanf("%s",&axe);
	printf("\nEnter Your Last Name : ");
	scanf("%s",&sdk);
	t=strcmp(axe,sdk);
	printf("\nDiffrence is : %d\n",t);
	sprintf(axe,"\n Your First(axe) Name is :%s ",axe);
	sprintf(sdk,"\n Your Last(sdk) Name  is :%s ",sdk);	
	return 0;
}


	
	
	
