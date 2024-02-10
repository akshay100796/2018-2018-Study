
#include<stdio.h>
int main()
{
	typedef struct stud
	{
		int rn;
		char name[10];
		float mrk;
	}AXE;
	AXE s;
	s.rn=5;
	strcpy(s.name,"Akshay");
	s.mrk=96.65;
	printf("I am %s having Roll No %d with %f marks",s.name,s.rn,s.mrk);
	return 0;
}

