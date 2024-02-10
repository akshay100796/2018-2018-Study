#include<stdio.h>

void MinMax(int,int);
int A[10],n,max,min;

int main()
{
	int i;
	
	printf("\n Enter List size->");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("\n Entered element %d:->",i);
		scanf("%d",&A[i]);
	}
	
	max=A[0];
	min=A[0];
	MinMax(0,n-1);
	
	printf("\n Maximum number:->%d",max);
	printf("\n Minimum number:->%d",min);
	float T;
	T=((3*n)-4)/2;
	printf("\n The time complexity is:%f",T);
	
	return 0;
}

void MinMax(int i,int j)
{
	int max1,min1,mid;
	if(i==j)
	{
		max=A[i];
		min=A[i];
	}
	else if(i==j-1)
	{
		if(A[i]<A[j])
		{
			min=A[i];
			max=A[j];		
		}
		else
		{
			min=A[j];
			max=A[i];
		}
	}
	else
	{
		mid=(i+j)/2;
		MinMax(i,mid);
		max1=max;
		min1=min;
		MinMax(mid+1,j);
		if(max<max1)
		{
			max=max1;
		}
		if(min>min1)
		{	
			min=min1;
		}
	}
}

/***********OUTPUT***********
svit@svit-ThinkCentre-M70e:~$ cd DAA
svit@svit-ThinkCentre-M70e:~/DAA$ gcc DAA1.c
svit@svit-ThinkCentre-M70e:~/DAA$ ./a.out

 Enter List size->4

 Entered element 0:->23

 Entered element 1:->67

 Entered element 2:->90

 Entered element 3:->121

 Maximum number:->121
 Minimum number:->23
 The time complexity is:4.000000
 svit@svit-ThinkCentre-M70e:~/DAA$ 
 svit@svit-ThinkCentre-M70e:~/DAA$ */


