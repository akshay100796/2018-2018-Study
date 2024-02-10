#include<stdio.h>
#include<stdlib.h>
int jr();
int sr();
int clg();
int bigclg();
int first();
int second();
int third();
int fourth();
int scholership();
int fifth();
int sixth();
int seven();
int eight();
int nine();
int ssc();
int eleven();
int hsc();
int fe();
int se();
int te();
int be();
int n;
int main()
{
	int n;
	do
	{
		printf("\n\n***-----GET PERSANTAGE-----***");
		printf("\n 1. 1st to 4th Std");
		printf("\n 2. 5th to SSC ");
		printf("\n 3. 11th & HSC ");
		printf("\n 4. Engineering");
		printf("\n 5. Exit");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				jr();
				break;
			case 2:
				sr();
				break;
			case 3:
				clg();
				break;
			case 4:
				bigclg();
				break;	
			case 5:
				exit(0);
				break;
			default :
				printf("\n Please Enter Correct Choice ");
				break;
		}
	}while(n!=5);
	return 0;
}

int jr()
{
	do
	{
		printf("\n 1. First  Standerd");
		printf("\n 2. Second Standerd");
		printf("\n 3. Third  Standerd");
		printf("\n 4. Fourth Standerd");
		printf("\n 5. Exit");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				first();
				break;
			case 2:
				second();
				break;
			case 3:
				third();
				break;
			case 4:
				fourth();
				break;
			case 5:
				exit(1);
				break;
			default : 
				printf("\n Please Enter Correct Choice ");
				break;
				
		}	
	}while(n!=5);

}
int sr()
{
	do
	{
		printf("\n 1. Fifth Standerd");
		printf("\n 2. Six   Standerd");
		printf("\n 3. Seven Standerd");
		printf("\n 4. Eight Standerd");
		printf("\n 5. Nine  Standerd");
		printf("\n 6. Tenth (SSC)");
		printf("\n 7. Exit");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				fifth();
				break;
			case 2:
				sixth();
				break;
			case 3:
				seven();
				break;			
			case 4:
				eight();
				break;
			case 5:
				nine();
				break;
			case 6:
				ssc();
				break;
			case 7:
				exit(2);
				break;
			default :
				printf("\n Please Enter Correct Choice ");
				break;
		}
	}while(n!=7);
}
int clg()
{
	do
	{
		printf("\n 1. 11th Standerd ");
		printf("\n 2. HSC ");
		printf("\n 3. Exit");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1 :
				eleven();
				break;
			case 2 :
				hsc();
				break;
			case 3 :
				exit(3);
				break;
			default :
				printf("\n Please Enter Correct Choice ");
				break;
		}
	}while(n!=3);
}
int bigclg()
{
	do
	{
		printf("\n 1. First  Year of Engineering ");
		printf("\n 2. Second Year of Engineering ");
		printf("\n 3. Third  Year of Engineering ");
		printf("\n 4. Last   Year of Engineering ");
		printf("\n 5. Exit ");
		printf("\n Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1 :
				fe();
				break;
			case 2 :
				se();
				break;
			case 3 :
				te();
				break;
			case 4 :
				be();
				break;
			case 5 :
				exit(2);
				break;
			default :
				printf("\n Please Enter Correct Choice ");				
				break;
		}
	}while(n!=5);
}

int first()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~200) : ");
	scanf("%f",&total);
	mrk=total/2;
	printf("\n You got %0.4f Persentage in 1st Standerd\t------Result-----\n",mrk); 
}
int second()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~200) : ");
	scanf("%f",&total);
	mrk=total/2;
	printf("\n You got %0.4f Persentage in 2nd Standerd\t------Result-----\n",mrk); 
}
int third()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~400) : ");
	scanf("%f",&total);
	mrk=total/4;
	printf("\nYou got %0.4f Persentage in 3rd Standerd\t------Result-----\n",mrk); 
}
int fourth()
{
	float total;
	float mrk;
	char ans;
	printf("\n Enter total Marks (~400) : ");
	scanf("%f",&total);
	mrk=total/4;
	printf("\nYou got %0.4f Persentage in 4th Standerd\t------Result-----\n",mrk); 
	printf("\n Have you Scolership Marks : ");
	ans=getche();
	if(ans=='y')
	{
		scholership();
	}				//cannot Jump
}
int fifth()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~900) : ");
	scanf("%f",&total);
	mrk=total/9;
	printf("\n You got %0.4f Persentage in 5th Standerd\t------Result-----\n",mrk); 
}
int sixth()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~900) : ");
	scanf("%f",&total);
	mrk=total/9;
	printf("\n You got %0.4f Persentage in 6th Standerd\t------Result-----\n",mrk); 
}
int seven()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~1000) : ");
	scanf("%f",&total);
	mrk=total/10;
	printf("\n You got %0.4f Persentage in 7th Standerd\t------Result-----\n",mrk); 
}
int eight()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~1000) : ");
	scanf("%f",&total);
	mrk=total/10;
	printf("\n You got %0.4f Persentage in 8th Standerd\t------Result-----\n",mrk); 
}
int nine()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~850) : ");
	scanf("%f",&total);
	mrk=total/8.5;
	printf("\n You got %0.4f Persentage in 9th Standerd\t------Result-----\n",mrk); 
}
int ssc()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~500) : ");
	scanf("%f",&total);
	mrk=total/5;
	printf("\n You got %0.4f Persentage in SSC\t------Result-----\n",mrk); 
}
int eleven()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~650) : ");
	scanf("%f",&total);
	mrk=total/6.5;
	printf("\n You got %0.4f Persentage in 11th\t------Result-----\n",mrk); 
}
int hsc()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~650) : ");
	scanf("%f",&total);
	mrk=total/6.5;
	printf("\n You got %0.4f Persentage in HSC\t------Result-----\n",mrk); 	
}
int fe()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~1400) : ");
	scanf("%f",&total);
	mrk=total/14;
	printf("\n You got %0.4f Persentage in First Year of Engineering\t------Result-----\n",mrk); 
}
int se()
{
	float total;
	float mrk;
	printf("\n Enter total Marks (~1500) : ");
	scanf("%f",&total);
	mrk=total/15;
	printf("\n You got %0.4f Persentage in Second Year of Engineering\t------Result-----\n",mrk); 
}
int te()
{
	printf("\n Sorry No Result Declared...for TE\t------Result-----\n");
}
int be()
{
	printf("\n Sorry No Result Declared...for BE\t------Result-----\n");
}
int scholership()
{
	int mrk;
	float total;
	printf("\n Enter Scholership Marks (~300): ");
	scanf("%d",&mrk);
	total=mrk/3;
	if(total>=105)
		printf("\n Congratulation You are PASSED...\n");
	else 
		printf("\n Sorry your Attemped is Fail\n");
}
