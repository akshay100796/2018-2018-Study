#include<stdio.h>
#include<math.h>
int main()
{
	char g;
	int ans;
	char m='M';
	char f='F';
	int value;
	float discount,find,amount;
	printf("\n Enter Your Gender (M | F) : ");
	scanf("%c",&g);
	if(g=='M' || g=='m')
	{
		printf("\nHey...Gentalment, You have free tickets ,want to take (y = 121| N = 110) ");
		scanf("%d",&ans);
		if(ans == 121)
		{
			printf("\nCongratulation...You recived %d Persent dicount",50);
			//getch();
			printf("\n************Bill paid Section...!*************");
			printf("\nEnter your amount :");
			scanf("%d",&value);
			find=0.50*value;				//discount... 
			discount=value-find;			//...formula
			printf("\nYour paid Amount is : %f",discount);
			do
			{
				printf("\nEnter amount to be paid : ");
				scanf("%f",&amount);
				if(discount==amount)
				{
						printf("\nThank You ... Visit Again\n");	
						break;
				}
				else
				{
					printf("\nThis amount is not sufficiant to be paid ,Please Enter valid amount...");
				
				}
			}while(discount!=amount);
			
		}
		else
		{
			printf("\nOops... you lost our discount ,We will give next best Offer\n");
			printf("\n Enter amount : ");
			scanf("%d",&value);
			find=0.10*value;				//discount... 
			discount=value-find;			//...formula
			printf("\nYour paid Amount is : %f",discount);
			do
			{
		   j:	printf("\nEnter amount to be paid : ");
				scanf("%f",&amount);
				if(discount==amount)
				{
						printf("\nThank You ... Visit Again\n");	
						break;
				}
				else
				{
					printf("\nThis amount is not sufficiant to be paid ,Please Enter valid amount...");
					goto j;
				}
			}while(discount==amount);
		}
	}
	else
	{
		printf("\nHellow Lady... want to use our discount (y = 121| N = 110) ");
		scanf("%d",&ans);
		if(ans == 121)
		{
			printf("\nCongratulation...You recived %d Persent dicount",75);
			//getch();
			printf("\n************Bill paid Section...!*************");
			printf("\nEnter your amount :");
			scanf("%d",&value);
			find=0.75*value;				//discount... 
			discount=value-find;			//...formula
			printf("\nYour paid Amount is : %f",discount);
			do
			{
		z:		printf("\nEnter amount to be paid : ");
				scanf("%f",&amount);
				if(discount==amount)
				{
						printf("\nThank You ... Visit Again\n");	
						break;
				}
				else
				{
					printf("\nThis amount is not sufficiant to be paid ,Please Enter valid amount...");
					goto z;
				}
			}while(discount==amount);
		}
		else
		{
			printf("\nOops...Lady, you lost our discount ,We will give next best Offer\n");
			printf("\n Enter amount : ");
			scanf("%d",&value);
			find=0.25*value;				//discount... 
			discount=value-find;			//...formula
			printf("\nYour paid Amount is : %f",discount);
			do
			{
		   t:	printf("\nEnter amount to be paid : ");
				scanf("%f",&amount);
				if(discount==amount)
				{
						printf("\nThank You ... Visit Again\n");	
						break;
				}
				else
				{
					printf("\nThis amount is not sufficiant to be paid ,Please Enter valid amount...");
					goto t;
				}
			}while(discount==amount);
		}
	}
}

