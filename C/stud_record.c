



//   Some Error Detected..................





#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<conio.h>

int add();
int dlt();
int modify();
int srch();
int display();

struct stud
{
	char fname[20];
	char lname[20];
	float mrk;
	char Email[40];
	int mobile;
	char city[30];	
};

struct stud s[100];
int main()
{
	int n;
	do
	{
		printf("\n\n***-----STUDENT RECORD-----***");
		printf("\n 1. Add Data ");
		printf("\n 2. Delete Data");
		printf("\n 3. Modify Data");
		printf("\n 4. Search Data");
		printf("\n 5. Display all Data");
		printf("\n 6. Clear Backgroung");
		printf("\n 7. Exit");
		printf("\n\nEnter Your Choice  :   ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				add();
				break;
			case 2:
				dlt();
				break;
			case 3:
				modify();
				break;
			case 4:
				srch();
				break;
			case 5:
				display();
				break;
			case 6:
				system("cls");
				break;
			case 7:
				exit(0);
				break;  
		}		
	}while(n!=7);
}
int add()
{
	int i,j=0,n;
	struct stud *s[100][20];
	char ans='y';
	if(ans=='y')
	{
		printf("\n How many data You want to entered : ");
		scanf("%d",&n);
		for(i=0;i<=n-1;i++)
		{
			{
				printf("\n Enter First Name : ");
				scanf("%s",&s[i][0].fname);
				printf("\n Enter Last Name : ");
				scanf("%s",&s[i][0].lname);
				printf("\n Enter 12th (HSC) : ");
				scanf("%f",&s[i][0].mrk);
				printf("\n Give us Email  : ");
				scanf("%s",&s[i][0].Email);
				printf("\n Give us Mobile Number (+91) : ");
				scanf("%d",&s[i][0].mobile);
				printf("\n I am Live in : ");
				scanf("%s",&s[i][0].city);
			}
		}
	}
	else
		printf("\n Data Can't Entered....")
	printf("\n Do you want to Add one more Data :  ");
	ans=getche();
	display(&s[i]);
}

int dlt()
{
	
}
int modify()
{
	
}
int srch()
{
	
}
int display(int *x[])
{
	struct stud s[100];
	int i;
	char name[20];
	printf("\n Enter Name to be Display Data : ");
	scanf("%s",&name);
	strcmp(name,s[i].fname);
	printf("\n First Name : %s \n Last Name : %s \n HSC Marks : %f \n Email  : %s  \n Mobile : %d \n  City : %s",&s[i][0].fname,&s[i][0].lname,&s[i][0].mrk,&s[i][0].Email,&s[i][0].mobile,&s[i][0].city);	
}
