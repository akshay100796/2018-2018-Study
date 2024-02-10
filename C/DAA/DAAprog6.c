#include<stdio.h>
#include<stdlib.h>
int least(int c);
int DistanceMatrix[10][10],visitedCities[10],n,cost=0;
void getData()
{
	int i,j;
	printf("\n\nEnter Number of Cities:->");
	scanf("%d",&n);
	
	printf("Enter the distance matrix:\n");
	
	for(i=0;i<n;i++)
	{
		printf("Enter the elements of Row#:%d:->\n",i+1);
		for(j=0;j<n;j++)
		{
			scanf("%d",&DistanceMatrix[i][j]);
		}
		visitedCities[i]=0;
	}
	printf("\n\n The distance matrix is :\n");
	for(i=0;i<n;i++)
	{
		printf("\n\n");
		for(j=0;j<n;j++)
		{
			printf("\t%d",DistanceMatrix[i][j]);	
		}
	}
}
void mincost(int city)
{
	int i,ncity;
	visitedCities[city]=1;
	printf("%d-->",city+1);
	ncity=least(city);
	if(ncity==999)
	{
		ncity=0;
		printf("%d",ncity+1);
		cost+=DistanceMatrix[city][ncity];
		return;
	}
	mincost(ncity);
	
}
int least(int c)
{
	int i,nc=999;
	int min=999,kmin;
	for(i=0;i<n;i++)
	{
		if((DistanceMatrix[c][i]!=0)&&(visitedCities[i]==0))
		if(DistanceMatrix[c][i]<min)
		{
			min=DistanceMatrix[i][0]+DistanceMatrix[c][i];
			kmin=DistanceMatrix[c][i];
			nc=i;
		}
	}
	if(min!=999)
	{
		cost+=kmin;
		
	}
	return nc;
}
void DisplayPath()
{
	printf("\n\n Minimum cost:");
	printf("%d",cost);
}
int main()
{
	getData();
	printf("\n The path is :\n");
	mincost(0);
	DisplayPath();
}

/*****************************OUTPUT******************



svit@abhiru:~/Desktop/SP+DAA$ gcc DAAprog6.c 
svit@abhiru:~/Desktop/SP+DAA$ ./a.out


Enter Number of Cities:->4
Enter the distance matrix:
Enter the elements of Row#:1:->
4
8
9
5
Enter the elements of Row#:2:->
1
8
3
2
Enter the elements of Row#:3:->
7
4
6
9
Enter the elements of Row#:4:->

1
5
8
3


 The distance matrix is :


	4	8	9	5

	1	8	3	2

	7	4	6	9

	1	5	8	3
 The path is :
1-->4-->2-->3-->1

 Minimum cost:20svit@abhiru:~/Desktop/SP+DAA$ 
*/
