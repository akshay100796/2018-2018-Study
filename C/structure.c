/*

PROG	: This is program of Structure

*/

#include<stdio.h>
struct stud
{
	int rn;
	char name[20];	
};
int main()
{
	struct stud s;
	printf("\nEnter Student Roll No. : ");
	scanf("%d",&s.rn);
	printf("\nEnter Student Name : ");
	scanf("%s",&s.name);
	printf("\n\t\tStudent %s has Roll No %d",s.name,s.rn);
}
