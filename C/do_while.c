/*This Program Executes at only once time becoz it doesn't take user value 'y' */

#include<stdio.h>
int main()
{
	int rn;
	char name[10];
	char ans='y';
	do
	{
		printf("\n\tEnter Your Roll Number  : ");
		scanf("%d",&rn);
		printf("\n\tEnter your name :");
		scanf("%s",&name);
		printf("\n\t\tstudent %s has Roll Number %d",name,rn);
		printf("\n\t\n\tDo you want Continue.....");
		scanf("%c",&ans);	
	}while(ans=='y');
	return 0;
}
