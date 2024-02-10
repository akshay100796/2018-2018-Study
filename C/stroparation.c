#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<stdlib.h>
char news();
char reverce();
char copy();
char comp();
char lwr();
char upper();
char lenth();
int next();
char ch[30];
char x[30];
int main()
{
	int n;
	do
	{
		printf("\n\n***-----MAIN MENU-----***");
		printf("\n 1. Take New String");
		printf("\n 2. Exit");
		printf("\n Enter Your Choice  : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				news();
				break;
			case 2:
				exit(0);
				break;
			default :
				printf("\n Please Enter Correct choice...");	
				break;
		}
	}while(n!=2);
	return 0;
}
char news()
{
 	printf("\nEntre New String(Only a Word) : ");
	scanf("%s",&ch);
	printf("\n Following Operation will Done on \"%s\" String");
	next();
}
int next()
{
	int n;
	do
	{
		printf("\n\n 1. Reverce");
		printf("\n 2. Copy");
		printf("\n 3. Compare");
		printf("\n 4. Get Lower Case");
		printf("\n 5. Get Upper Case");
		printf("\n 6. Find Lenth");
		printf("\n 7. Exit");	
		printf("\n\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				reverce();
				break;
			case 2:
				copy();
				break;
			case 3:
				comp();
				break;
			case 4:
				lwr();
				break;
			case 5:
				upper();
				break;
			case 6:
				lenth();
				break;
			case 7 :
				exit(0);
				break;			
			default :
				printf("\n Please Enter Correct choice...");	
				break;
		}
	}while(n!=7);
	return 0;
}

char reverce()
{
	strcpy(x,ch);
	strrev(x);
	printf("\n Reverce String is : %s",x);
}
char copy()
{
	char c[15];
	strcpy(c,ch);
	printf("\n Entered Copied String is : %s",c);
}
char comp()
{
	char s1[20];
	char s2[20];
	int c;
	printf("\nEnter First String : ");
	scanf("%s",&s1);
	printf("\nEnter Second String : ");
	scanf("%s",&s2);
	c=strcmp(s1,s2);
	if(c==0)
		printf("\n Both String is Matched or Equal");
	else
		printf("\n Both String is Diffrent ");
}
char lwr()
{
	char *p;
	p=strlwr(ch);
	printf("\n Lower Case String Is : %s",p);
}

char upper()
{ 
	char *p;
	p=strupr(ch);
	printf("\n Upper Case String Is : %s",p);
}
char lenth()
{ 
	int l;
	l=strlen(ch);
	printf("\n Entered String is %d Character Long",l);
}
