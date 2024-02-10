/*Print your name n no of time with while loop*/
/*
#include<stdio.h>
int main()
{
	int i=1;
	while(i<=10)
	{
		printf("\n \tAkshay\t Pawar %d",i);
		i++;
	}
	return 0;
}

*/

/*  this program print student name & number at 'n' number of time using while loop */
#include<stdio.h>
int main()
{
	int i=1,rn;
	char name[20];
	while(i<=10)
	{
		printf("\nEnter Roll No. : ");
		scanf("%d",&rn);
		printf("\nEnter Your name : ");
		scanf("%s",&name);
		printf("\n\n\t\t %s has Roll No %d\n",name,rn);
		i++;
	}
	return 0;
}
