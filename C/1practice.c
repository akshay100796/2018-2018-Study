
#include <stdio.h>
#include<conio.h>

void main()
{
    printf("\r Axe");
	printf("\r Pwr");
    getch();
}
/*  

Check Once Again...........................!

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
	FILE *a1,*a2,*a3,*p1,*p2,*p3;
	a1=fopen("enum.c","r");
	if(a1==NULL)
	{
		puts("\n\tCan't open File....");
		exit(1);
	}
	a2=fopen("fun2fun.c","r");
	if(a2==NULL)
	{
		puts("\n\tCan't open File....");
		exit(2);
	}
	a3=fopen("fun4.c","r");
	if(a3==NULL)
	{
		puts("\n\tCan't open File....");
		exit(3);
	}
	
	p1=fopen("1_p1.txt","w");
	if(a1==NULL)
	{
		puts("\n\tCan't open File....");
		exit(4);
	}
	p2=fopen("1_p2.txt","w");
	if(a1==NULL)
	{
		puts("\n\tCan't open File....");
		exit(5);
	}
	p3=fopen("1_p3.txt","w");
	if(p3==NULL)
	{
		puts("\n\tCan't open File....");
		exit(6);
	}
	while(1)
	{
		strcpy(a1,p1);
		strcpy(a2,p2);
		strcpy(a3,p3);	
	}
	fclose(a1);
	fclose(a2);
	fclose(a3);
	fclose(p1);
	fclose(p2);
	fclose(p3);
	return(0);
}

*/
