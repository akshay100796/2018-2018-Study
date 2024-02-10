#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
struct stud
{
	char name[30];
	int rn;
	float mrk;
};
char add();
char dlt();
char search();
char display();
char modify();
int main()
{
	char ch;
	int i,n;
	char username[30];
	struct stud s[50];
	do
	{
		printf("\n 1. Enter Your New Data ");
		printf("\n 2. Delete Your Data ");
		printf("\n 3. Modify Your Data ");
		printf("\n 4. See Your Data ");
		printf("\n 5. Search Your Data... ");
		printf("\n \n Entre Your Choice  :  ");
		scanf("%d",&n);
		switch(n)
		{
			case 1 :
				add();
				printf("\nCongratulation...Your Data Successfully Added");
				break;
			case 2 : 
				dlt();
				printf("\nCongratulation...Your Data Successfully Deleted");
				break;
			case 3 :
				modify();
				printf("\nCongratulation...Your Data Successfully Modified");
				break;
			case 4 :
				display();
				printf("\nThis is Your Require Data");
				break;
			case 5 :
				search();
				printf("\nCongratulation...Your Search has been Found");
				break;
			case 6: 
				exit(0);
				break; 
		}
	}while(n!=6);
	return 0;
}
char add()
{
	FILE *df;
	struct stud s;
	char ans='y';
	while(ans=='y')
	{
		df=fopen("UserData.DAT","a");
		if(df==NULL)
		{
			printf("\n Oops...! File Can not Open ");
			exit(1);	
		}
		printf("\n\n Enter Student Full Name :  ");
		scanf("%s",&s.name);
		printf("\n Enter Student Roll No.  :  ");
		scanf("%d",&s.rn);
		printf("\n Enter Student Marks  :  ");
		scanf("%f",&s.mrk);
		fprintf(df,"\n Name : %s \n Roll No : %d \n Marks : %f",s.name, s.rn,s.mrk);
		fprintf(df,"\n----------------------------------------------------------------------------");
		fclose(df);
		printf("\nDo You Want Add Anather Name :  ");
		fflush(stdin);
		ans=getche();
	}
}

char dlt()
{
	struct stud s;
	char ans='y';
	char username[30];
	FILE *df,*tf;
	df=fopen("UserData.DAT","rb");
	if(df==NULL)
	{
		printf("\n Oops...! File Can not Open ");
		exit(2);	
	}
	tf=fopen("temp.DAT","wb");
	if(tf==NULL)
	{
		printf("\n Oops...! File Can not Open ");
		exit(3);	
	}
	if(ans=='y')
	{
		printf("\nEnter Name to be Delete  :  ");
		scanf("%s",&username);
		rewind(df);
		while(fread(&s,sizeof(s),1,df)==1)
		{
			if(strcmp(username,s.name)!=0);
				fwrite(&s,sizeof(s),1,tf);
		}
		fclose(df);
		fclose(tf);
		remove("UserData.DAT");	
		rename("temp.DAT","UserData.DAT");
		df=fopen("UserData.DAT","rb+");
		printf("\n Delete Anather Choice : ");
		ans==getche();
		fflush(stdin);
	}
}
char modify()
{
	FILE *df;
	struct stud s;
	char ans='y';
	char rname[30];
	df=fopen("UserData.DAT","r");
	if(df==NULL)
	{
		printf("\n Oops...! File Can not Open ");
		exit(3);	
	}
	while(ans=='y')
	{
		printf("\n Enter Name To be modify : ");
		scanf("%s",&rename);
		rewind(df);
		while(fread(&s,sizeof(s),1,df)==1)
		{
			if(strcmp(rname,s.name)==0)
			{
				printf("\n Enter Student Full Name :  ");
				scanf("%s",&s.name);
				printf("\n Enter Student Roll No.  :  ");
				scanf("%d",&s.rn);
				printf("\n Enter Student Marks  :  ");
				scanf("%f",&s.mrk);
				fseek(df,-sizeof(s),SEEK_CUR);
				fwrite(&s,sizeof(s),1,df);
			}
			else
				printf("\n Error  : Sorry... Name Cannot Replace ");
			fclose(df);
			printf("\n Do You Modify Anather Record : ");
			fflush(stdin);
			ans=getche();
		}
	}
}
char display()
{
	FILE *df;
	struct stud s;
	df=fopen("UserData.DAT","r");
	if(df==NULL)
	{
		printf("\n Oops...! File Can not Open ");
		exit(4);	
	}
	while(fscanf(df,"%s %d %f",&s.name,&s.rn, &s.mrk)!=EOF)
		printf("\n Name : %s \n Roll no : %d \n Marks  : %f ",s.name,s.rn,s.mrk);
	fclose(df);
}
char search()
{
	FILE *df;
	struct stud s;
	char rename[30];
	int c;
	df=fopen("UserData.DAT","r");
	if(df==NULL)
	{
		printf("\n Oops...! File Can not Open ");
		exit(5);	
	}
	printf("Enter Name To be  Search : ");
	scanf("%s",&rename);
	c=strcmp(rename,s.name);
	if(c==0)
		printf("\nCongratulation...! Your Name is Available");
	else
		printf("Sorry... Your Name not Found ");
	fclose(df);
}


