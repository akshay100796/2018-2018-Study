

#include <stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>

void quick(int *, int down, int up);
void merge(int *, int low,int high);
void display(int *a,int sz);
void mergesort(int *a, int low,int mid, int high);
int main()
{
	pid_t pid;
	int *a, sz, i;
	printf("enter the size of array");
	scanf("%d",&sz);
	a = (int *)malloc(sz *sizeof(int));
	printf("\n enter elemts of array");
	for(i=0;i<sz;i++)
		scanf("%d",&a[i]);
	
	pid = fork();
	switch(pid)
	{
	case -1 : 
		printf("\n error in fork"); 
		exit(-1);
	case 0: printf("\nchild process"); 
		quick(a,0,sz-1); 
		printf("\nsorted array is");		
		display(a,sz);
		exit(0);	
	default :wait(NULL); 
		printf("\nparent process"); 
		printf("\nUnsorted array is");		
		display(a,sz);  		
		merge(a,0,sz-1); 
		printf("\nsorted array is");
		display(a,sz);
		exit(0);
	}	
return (0);
}

void quick(int *a, int down,int up)
{
	int pivot,i,j,temp;

	if(down<up)
	{	i=down;j=up+1;
		pivot=a[down];
		do {	
			do i++; while(a[i]<pivot);
			do j--; while(a[j]>pivot);
			if(i<j) { temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		   		}
		   }while(i<j);
	
temp=a[down];
a[down]=a[j];
a[j]=temp;
quick(a,down,j-1);
quick(a,j+1,up);
}//end if

}

void display(int *a,int sz)
{
int i,j;

for(i=0;i<sz;i++)
		printf("\t%d",a[i]);

}

void merge(int *a,int low, int high)
{
int mid;
if(low<high)
{
	mid=(low+high)/2;
	merge(a,low,mid);
	merge(a,mid+1,high);
	mergesort(a,low,mid,high);
}
}

void mergesort(int *a, int low,int mid, int high)
{
	int i,m,k,l,temp[100];
	l=low;
	i=low;
	m=mid+1;
	while((l<=mid)&&(m<=high))
	{
	if(a[l]<=a[m])
		{
		temp[i]=a[l];
		l++;
		}
	else
		{
		temp[i]=a[m];
		m++;
		}
	i++;
	}
	if(l>mid)
	{
		for(k=m;k<=high;k++)
		{
		temp[i]=a[k];
		i++;
		}
	}
	else
	{
		for(k=l;k<=mid;k++)
		{
		temp[i]=a[k];
		i++;
		}

	}
	for(k=low;k<=high;k++)
	{
		a[k]=temp[k];
	
	}
}


/*output
yashashri@yashashri-Inspiron-3542:~$ cd OS
yashashri@yashashri-Inspiron-3542:~/OS$ gcc sortass1.c
yashashri@yashashri-Inspiron-3542:~/OS$ ./a.out
enter the size of array5

 enter elemts of array32
95
64
105
13

child process
sorted array is	13	32	64	95	105
parent process
Unsorted array is	32	95	64	105	13
sorted array is	13	32	64	95	105
yashashri@yashashri-Inspiron-3542:~/OS$ 
*/


