#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[])
{
	FILE *f1,*f2;
	char ch;
	if(argc!=3)
	{
		puts("Argument is not Passed Successfully...");
		exit(0);
	}
	f1=fopen(argv[1],"r");
	if(f1==NULL)
	{
		puts("Can't Open Source File...");
		exit(1);
	}
	f1=fopen(argv[2],"w");
	if(f2==NULL)
	{
		puts("Can't Open Target File...");
		exit(2);
	}
	while(!feof(f1))
	{
		ch=fgetc(f1);
		fputc(ch,f2);
	}
	fclose(f1);
	fclose(f2);
	return 0;
	
	
}
