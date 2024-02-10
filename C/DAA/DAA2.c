#include<stdio.h>

int n,Sum=0,pSum=0;
int L[10];
int RT[10]={0};

void OptimalStorageSchedule();
void SortProgs();

int main()
{
	int i;
	printf("Enter the no. of elements:");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&L[i]);
	}
	OptimalStorageSchedule();
	return 0;
}

void OptimalStorageSchedule()
{
	int k=0,i;
	printf("\nOriginal program length:->");
	for(i=0;i<n;i++)
	{
		printf("%d\t",L[i]);
	}
	SortProgs();
	printf("\nSorted program length:->");
	for(i=0;i<n;i++)
	{
		printf("%d\t",L[i]);
	}
	for(i=0;i<n;i++)
	{
		pSum=pSum+L[i];
		Sum=pSum+L[i];
		RT[i]=Sum;
	}
	printf("\nTotal Retrival Time:->%d",RT[2]);
	printf("\nMean Retrival Time:->%f",RT[2]/(float)n);
}

void SortProgs()
{
	int i,j,temp;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<(n-i-1);j++)
		{
			if(L[j+1]<L[j])
			{
				temp=L[j];
				L[j]=L[j+1];
				L[j+1]=temp;
			}
		}
	}
}
/***********OUTPUT************
svit@svit-ThinkCentre-M70e:~$ cd DAA
svit@svit-ThinkCentre-M70e:~/DAA$ gcc DAA2.c
svit@svit-ThinkCentre-M70e:~/DAA$ ./a.out
Enter the no. of elements:5
34
6
79
111
90

Original program length:->34	6	79	111	90	
Sorted program length:->6	34	79	90	111	
Total Retrival Time:->198
Mean Retrival Time:->39.599998svit@svit-ThinkCentre-M70e:~/DAA$ ^C
svit@svit-ThinkCentre-M70e:~/DAA$ */





	
	
