
//Source code 	: if...else on cloth Shopping 
#include<stdio.h>
#include<conio.h>
int main()
{
	double discount;
	float paid;
	int amt;
	char ans='y';
	char sex='m';
	printf("\n Enter your Sex (m or f) : ");
	scanf("%c",&sex);
	if(sex=='m')
	{
		printf("\n Hellow...Gentalmen....Enter total Shopping Amount : ");
		scanf("%d",&amt);
		if(amt>=10000)
		{
			printf("\nCongratulation.....You Got 35 persent Discount\n");
			printf("\nDo you want use it..");
			ans=getche();
			if(ans=='y')
			{
				float discount=(35/100)*amt;	
				printf("\n Your Paid Amount is : %.4f",discount);
				printf("\n Enter Above Amount for Paid : ");
				scanf("%f",&paid);
				if(discount==paid)
				{
					printf("\n Your Bill Amount is PAID ");
					printf("\n Thank You....Visit Again");
				}
				else
					printf("\n Invalid Amount is PAID");
				
			}
			else
				printf("\nOhhhh.....You Missed the Discount offer.......\n");
			puts("\nOK We will come back soon with next offer......Visit Again");
		}
		else
		{
			printf("\n Your PAID amount is %d ",amt);
			puts("\nOK We will come back soon with next offer......Visit Again");	
		}
			
	}
	else
	{
		printf("\n Hellow...Women...Enter total Shopping Amount : ");
		scanf("%d",&amt);
		if(amt>=30000)	
		{
			printf("\nCongratulation.....You Got 60 persent Discount\n");
			printf("\nDo you want use it..");
			ans=getche();
			if(ans=='y')
			{
				discount=(60/100)*amt;
				printf("\n Your Paid Amount is : %f",discount);
				printf("\n Enter Above Amount for Paid : ");
				scanf("%f",&paid);
				if(discount==paid)
				{
					printf("\n Your Bill Amount is PAID ");
					printf("\n Thank You....Visit Again");
				}
				else
					printf("\n Invalid Amount is PAID");
			}	
			else
				printf("\n Ohhhh.....You Missed the Discount offer.......\n");
			puts("\nOK We will come back soon with next offer......Visit Again");		
		}
	}
return 0;
}

