/*
PROG	: to print all content of file of enum.c  || 
		   open file , read content , Display all Content to output 
		   
#include<stdio.h>
#include<conio.h>
int main()
{
	FILE *f;
	char ch;
	f=fopen("enum.c","r");
	while(1)
	{
	
		ch=fgetc(f);
		if(ch==EOF)
			break;
		printf("%c",ch);
	}
	printf("\n");
	fclose(f);
	return 0;
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
PROG	: open empty file show it is empty or not  take enum Example

#include<stdio.h>
#include<stdlib.h>
int main()
{
	FILE *f;
	char ch;
	f=fopen("enum.c","r");
	if(f==NULL)
	{
		puts("\n Sorry.... Can't open File");
		exit(1);
	}
	while(1)
	{
		ch=fgetc(f);
		if(ch==EOF)
			break;
		else
			printf("%c",ch);
	}
	printf("\n");
	fclose(f);
	return 0;
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

PROG	: Enter string at out_put & Display it in created file & write content from user


#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
	int i;
	FILE *f;
	char s[50];
	f=fopen("abc.txt","a");
	if(f==NULL)
	{
		puts("File Can't open ");
		exit(1);	
	}	
	printf("Enter Your Full Name : ");
	gets(s);
	for(i=0;i<=strlen(s);i++)
	{
		fputc(s[i],f);
	}
	fclose(f);
	return 0;
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PROG	: To count total char,space,line,tabs in prog

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
	FILE *fp;
	char ch;
	int c=0,s=0,l=0,t=0;
	fp=fopen("enum.c","r");
	if(fp==NULL)
	{
		printf("\n File Can't open");
		exit(1);
	}
	while(1)
	{
		ch=fgetc(fp);
		if(ch==EOF)
			break;
			c++;
		if(ch==' ')
			s++;
		if(ch=='\n')
			l++;
		if(ch=='\t')
			t++;
	}
	fclose(fp);
	printf("\nTotal Char  : %d",c);
	printf("\nTotal Space : %d",s);
	printf("\nTotal Lines : %d",l);
	printf("\nTotal Tabs  : %d",t);
	return 0;
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PROG	: Take String through getch()  function it take sting at end of char array until hitting enter key slowly

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
	FILE *f;
	char ch[50];
	f=fopen("123.txt","w");
	if(f==NULL)
	{
		puts("\n File Can't Open");
		exit(1);
	}
	puts("\n Enter Name : ");
	gets(ch);					//prog  terminate after hit enter  key immediatly   ( prog take string if hiting enter key after some time )
	while(strlen(gets(ch))>0)
	{
		fputs(ch,f);
		fputs("\n",f);
	}
	fclose(f);
	return 0;
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*

PROG	: write recond in file using fprintf() function

#include<stdio.h>
#include<stdlib.h>
int main()
{
	FILE *f;
	char ans='y';
	struct stud
	{
		int rn;
		char name[30];
		float mrk;
	}s;
	f=fopen("Stud_Data.txt","a");
	if(f==NULL)
	{
		printf("\n Can't open File...");
		exit(0);
	}
	while(ans=='y')
	{
		printf("\n\nEnter Roll No of Student : ");
		scanf("%d",&s.rn);
		printf("\nEnter Name of Student : ");
		scanf("%s",&s.name);
		printf("\nEnter Marks of Student : ");
		scanf("%f",&s.mrk);
		fprintf(f,"\nRoll No : %d\nName    : %s	\nMarks   : %0.2f\n",s.rn,s.name,s.mrk);
		fprintf(f,"\n-----------------------------------------------------------------------\n");
		printf("\nDo you want Continue...  :  ");
		ans=getche();
	}
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PROG	: write recond in file using fscanf() function

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main()
{
	FILE *f;
	struct stud
	{
		int rn;
		char name[30];
		float mrk;
	}s;
	f=fopen("Stud_Data.txt","w");
	if(f==NULL)
	{
		printf("\n Sorry...File Can't Open ");
		exit(0);
	}
	while(f!=EOF)					// At Infinitly loop  cant read
	{
		fscanf(f,"%d %s %f",&s.rn,&s.name,&s.mrk);
		if(f==EOF)
			break;
		printf("\n Roll No  : %d \n Name  : %s \n Marks  : %f",s.rn,s.name,s.mrk);
	}
	fclose(f);
	return 0;
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PROG	: write record in file using fwrite() function
*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
	FILE *f;
	char ans='y';
	struct stud
	{
		int rn;
		char name[30];
		float mrk;
	}s;
	f=fopen("fwrit.exe","wb");
	if(f==NULL)
	{
		printf("\n Can't Open File....");
		exit(0);
	}
	while(ans=='y')
	{	
		printf("\n\n Enter Roll No :  ");				//Print Garbage Char / valu
		scanf("%d",&s.rn);
		printf("\n Enter Name :  ");					//O.K.
		scanf("%s",&s.name);
		printf("\n Enter Marks  :  ");					//Print Garbage valu
		scanf("%f",&s.mrk);
		fwrite(&s,sizeof(s),1,f);
		printf("\n Roll No : %d \n Name : %s \n Marks : %f \n",s.rn,s.name,s.mrk);
		printf("\n\nDo You want Continue  :  ");
		fflush(stdin);
		ans=getche();
	}
	fclose(f);
	return 0;	
}
