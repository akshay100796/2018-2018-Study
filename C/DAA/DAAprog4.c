#include<stdio.h>
#include<stdlib.h>
int DistMat[10][10],visitedCity[10],n,cost=0,InitialVertex=0;
int getDistMat();
int mincost(int);
int least(int);
int main()
{
	getDistMat();
	printf("\n\nOptional Path is:->:\n");
	cost =mincost(InitialVertex);
	
	printf("\n\n Minimum cost is%d\n",cost);
	return 0;
} 
int getDistMat()
{
	int i,j;
	printf("Enter Number of cities:->");
	scanf("%d",&n);
	
	printf("Enter the distance matrix:->\n");
	for(i=0;i<n;i++)
	{
		printf("\n Enter the distance of Row:%d\n",i+1);
		for(j=0;j<n;j++)
		{
			scanf("%d",&DistMat[i][j]);
		}
		visitedCity[i]=0;
	}
	printf("\n\n Cost Matrix:->");
	for(i=0;i<n;i++)
	{
		printf("\n");
		for(j=0;j<n;j++)
		{
		printf("\t%d",DistMat[i][j]);
		}
	}
}
int mincost(int city)
{
	int i,ncity;
	visitedCity[city]=1;
	printf("%d-->",city+1);
	ncity=least(city);
	
	if(ncity==999)
	{
		ncity=0;
		printf("%d",ncity+1);
		cost+=DistMat[city][ncity];
		return cost;
	}
	mincost(ncity);
}
int least(int c)
{
	int i,nc=999;
	int min=999,kmin;
	for(i=0;i<n;i++)
	{
		if((DistMat[c][i]!=0)&&(visitedCity[i]==0))
			if(DistMat[c][i]+DistMat[i][c]<min)
			{
				min=DistMat[i][0]+DistMat[c][i];
				kmin=DistMat[c][i];
				nc=i;
			}
	}
	if(min!=999)
		cost+=kmin;
	return nc;
}

/************************OUTPUT***************


svit@abhiru:~/Desktop/SP+DAA$ gcc DAAprog4.c
svit@abhiru:~/Desktop/SP+DAA$ ./a.out
Enter Number of cities:->4
Enter the distance matrix:->

 Enter the distance of Row:1
4 8 2 6

 Enter the distance of Row:2
9 4 3 6

 Enter the distance of Row:3
7 1 3 9

 Enter the distance of Row:4
8 4 2 6


 Cost Matrix:->
	4	8	2	6
	9	4	3	6
	7	1	3	9
	8	4	2	6

Optional Path is:->:
1-->3-->2-->4-->1

 Minimum cost is17
svit@abhiru:~/Desktop/SP+DAA$ 
*/


