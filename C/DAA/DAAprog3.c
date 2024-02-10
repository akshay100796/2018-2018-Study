#include<stdio.h>
#include<stdlib.h>

int main()
{
	int numVertex,edge[20][2],DistMat[20][20],i,j,k=0;
	printf("Enter the no. of vertices:-->");
	scanf("%d",&numVertex);
	
	printf("Enter the distance matrix:\n");
	for(i=0;i<numVertex;i++)
	        for(j=0;j<numVertex;j++)
	        {
		        scanf("%d",&DistMat[i][j]);
		        	if(DistMat[i][j]!=0)
			        	edge[k][0]=i,edge[k++][i]=j;
	        }		
	if(Bellman_Ford(DistMat,numVertex,k,edge))
	{
		printf("\n No negative weight cycle\n");
	}
	else
	{
		printf("\n Negative weight cycle exist\n");
	}
	return 0;
}
int Bellman_Ford(int DistMat[20][20],int numVertex,int E,int edge[20][2])
{
	int i,u,v,k,distance[20],parent[20],S,flag=1;
	for(i=0;i<numVertex;i++)
	{
		distance[i]=1000,parent[i]=-1;
	}
	printf("Enter source vertex no.:->");
	scanf("%d",&S);
	distance[S-1]=0;
	
	for(i=0;i<numVertex-1;i++)
	{
		for(k=0;k<E;k++)
		{
			u=edge[k][0],v=edge[k][1];
			if(distance[u]+DistMat[u][v]<distance[v])
			{
				distance[v]=distance[u]+DistMat[u][v],parent[v]=u;
			}
		}
	}
	for(k=0;k<E;k++)
	{
		u=edge[k][0],v=edge[k][1];
		if(distance[u]+DistMat[u][v]<distance[v])
		{
			flag=0;
		}
	}
	if(flag)
	{
		for(i=0;i<numVertex;i++)
		{
			printf("Vertex %d->cost=%d parent=%d\n",i+1,distance[i],parent[i]+1);
		}
	}
	return flag;
}

/***************************OUTPUT*************
svit@abhiru:~/Desktop/SP+DAA$ gcc DAAprog3.c
svit@abhiru:~/Desktop/SP+DAA$ ./a.out
Enter the no. of vertices:-->4
Enter the distance matrix:
7
5
9
1
Enter source vertex no.:->1
Vertex 1->cost=0 parent=0
Vertex 2->cost=5 parent=1
Vertex 3->cost=9 parent=1
Vertex 4->cost=1 parent=1

 No negative weight cycle
svit@abhiru:~/Desktop/SP+DAA$ 






















