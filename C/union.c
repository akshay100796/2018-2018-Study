/*This is Programn of Union But which Give Problem Of Roll No
i.e  Roll gives Garbage Value  

#include<stdio.h>
union stud
{
	int rn;
	char name[20];	
};
int main()
{
	union stud s;
	printf("\nEnter Student Roll No. : ");
	scanf("%d",&s.rn);
	printf("\nEnter Student Name : ");
	scanf("%s",&s.name);
	printf("\n\t\tStudent %s has Roll No %d",s.name,s.rn);
}
*/
//PROG	: make pattern programm
 #include<stdio.h>
 int main()
 {
 	int i,j;
 	for(i=0;i<=5;i++)
 	{
 		for(j=0;j<=5;j++)
 		{
			if(j>=6-i)
				printf("+");
			else
				printf(" ");
		}
		printf("\n");
	}
	return 0;
 }
