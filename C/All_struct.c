/*
PROG	: Details of student without using Structure

#include<stdio.h>
int main()
{
	int n,i,rn;
	float mrk;
	char name[15];
	char city[15];
	printf("Enter total Number of Student : ");
	scanf("%d",&n);
	for(i=0;i<=n-1;i++)
	{
		printf("\n Enter Full Name of Student  : ");
		scanf("%s",&name);
		printf("\n Enter Roll no of Student :  ");
		scanf("%d",&rn);
		printf("\n Enter Your City : ");
		scanf("%s",&city);
		printf("\n Enter Marks Obtain in SSC  :  ");
		scanf("%f",&mrk);
	}
	for(i=0;i<=n-1;i++)
	{
		printf("\n\n Hi I am %s having Roll No %d \n My city name is %s \n My SSC marks is %f ",name,rn,city,mrk);
	}
	return 0;
}

o/p : It take Data but it overwrite on same / previas data  : It display last Enter data at all
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

/*
	*******************************************PROG	: struct name at 4 places***************************************

#include<stdio.h>
int main()
{
	struct stud									//Declaration within main() Function
	{	
		int rn;
		char name[10];
	};
	struct stud s;								//Object name declare Sepratly
	printf("\n Enter Name of Student : ");
	scanf("%s",&s.name);
	printf("\n Enter Roll No : ");
	scanf("%d",&s.rn);
	printf("I am %s  \n  Roll No is  : %d",s.name,s.rn);
	return 0;
}

	*************************************************Object At End of struct*****************************************

#include<stdio.h>
int main()
{
	struct stud							//Declaration within main() Function
	{	
		int rn;
		char name[10];
	}s;											//Object name declare at End of Struct
	printf("\n Enter Name of Student : ");
	scanf("%s",&s.name);
	printf("\n Enter Roll No : ");
	scanf("%d",&s.rn);
	printf("I am %s  \n  Roll No is  : %d",s.name,s.rn);
	return 0;
}

	*************************************************Object At within main()*****************************************
#include<stdio.h>
struct stud							//Declaration outside the main() Function 
{	
	int rn;
	char name[10];
};
int main()
{
	
	struct stud s;									//Object 's' declare within main() Function to access struct block		
	printf("\n Enter Name of Student : ");
	scanf("%s",&s.name);
	printf("\n Enter Roll No : ");
	scanf("%d",&s.rn);
	printf("I am %s  \n  Roll No is  : %d",s.name,s.rn);
	return 0;
}

*/
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
PROG	: Details of student with Structure only one student data fetch at a time   <biggest side-effect>

#include<stdio.h>
int main()
{
	struct stud
	{
		int rn;
		float mrk;
		char name[15];
		char city[15];
	};
	struct stud s;
	printf("\n Enter Full Name of Student  : ");
	scanf("%s",&s.name);
	printf("\n Enter Roll no of Student :  ");
	scanf("%d",&s.rn);
	printf("\n Enter Your City : ");
	scanf("%s",&s.city);
	printf("\n Enter Marks Obtain in SSC  :  ");
	scanf("%f",&s.mrk);	
	printf("\n\n Hi I am %s having Roll No %d \n My city name is %s \n My SSC marks is %f ",s.name,s.rn,s.city,s.mrk);
	return 0;
 	
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

PROG	: detail of multiple Student with Structure at a time  <Also called Array of Structure >














































