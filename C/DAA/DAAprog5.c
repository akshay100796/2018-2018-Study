#include<stdio.h>
#include<math.h>

int Board[16],count;
void Queen(int,int);
int PlaceQueen(int ,int );
void DisplaySolution(int n);
int main()
{
	int i,n,j;
	

	printf("Enter the no. of Queens:");
	scanf("%d",&n);
	Queen(1,n);
	return 0;
}

void Queen(int row ,int n)
{
	int col;
	for(col=1;col<=n;++col)
	{
		if(PlaceQueen(row,col))
		{
			Board[row]=col;
			if(row==n)
			{
				DisplaySolution(n);
			}
			else
			{
				Queen(row+1,n);
			}
		}
	}
}
int PlaceQueen(int row,int coloumn)
{
	int i;
	for(i=1;i<row-1;++i)
	{
		if(Board[i]==coloumn)
		{
		       
			return 0;
		}
		else
		{
			if( abs(Board[i]-coloumn) == abs(i-row) )
			{
				return 0;
			}
		}
	}
	return 1;
}
void DisplaySolution(int n)
{
	int i,j;
	printf("\n\n Solution %d:\n\n",++count);
	for(i=1;i<=n;++i)
	printf("\tR%d",i);
	for(i=1;i<=n;++i)
	{
		printf("\n\nC%d",i);
		for(j=1;j<=n;++j)
		{
			if(Board[i]==j)
			{
				printf("\t Q");
			}
			else
			{
				printf("\t.");
			}
		
		}
	}
	printf("\n\n");
}



/**************************OUTPUT************

svit@abhiru:~/Desktop/SP+DAA$ ./a.out
Enter the no. of Queens:2


 Solution 1:

	R1	R2

C1	 Q	.

C2	 Q	.



 Solution 2:

	R1	R2

C1	 Q	.

C2	.	 Q



 Solution 3:

	R1	R2

C1	.	 Q

C2	 Q	.



 Solution 4:

	R1	R2

C1	.	 Q

C2	.	 Q

svit@abhiru:~/Desktop/SP+DAA$ 
*/

