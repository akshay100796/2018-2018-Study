#include<stdio.h>
#include<stdlib.h>
#define MAX 10


typedef struct cpu
{
  char name[MAX];
  int at,bt,prt,wt,rbt,k;
}cpu;

cpu cpu1[MAX];
int n;

void fcfs()
{
  cpu temp[MAX],temp1;
  int i,tbt=0,j;
  float twt=0,ttat=0;
  for(i=0;i<n;i++)  
    temp[i]=cpu1[i];

  for(i=1;i<=n;i++)
    for(j=0;j<n-i;j++)
      if(temp[j].at>temp[j+1].at)
      {
        temp1=temp[j];
        temp[j]=temp[j+1];
        temp[j+1]=temp1;
      }
  printf("\ndetails after sorting: ");
  printf("\nname\tat\tbt\tprt");
  for(i=0;i<n;i++)
    printf("\n%s\t%d\t%d\t%d",temp[i].name,temp[i].at,temp[i].bt,temp[i].prt);

  temp[0].wt=0;
  for(i=1;i<n;i++)
    temp[i].wt=temp[i-1].wt+temp[i-1].bt;
    
  for(i=0;i<n;i++)
  {
    twt+=temp[i].wt;
    ttat+=temp[i].bt+temp[i].wt;
    tbt+=temp[i].bt;
  }

  printf("\n\ngantt chart: \n\n");
  for(i=0;i<n;i++)
    printf("  %d [%s]",temp[i].wt,temp[i].name);
  printf("  %d",tbt);
  printf("\n\navg waiting time: %.2f",twt/n);
  printf("\n\navg tat: %.2f",ttat/n);

}

void sjf()
{
  cpu temp[MAX],temp1;
  int i,tbt=0,j;
  float twt=0,ttat=0;
  for(i=0;i<n;i++)  
    temp[i]=cpu1[i];

  for(i=1;i<=n;i++)
    for(j=0;j<n-i;j++)
      if(temp[j].bt>temp[j+1].bt)
      {
        temp1=temp[j];
        temp[j]=temp[j+1];
        temp[j+1]=temp1;
      }
  printf("\ndetails after sorting: ");
  printf("\nname\tat\tbt\tprt");
  for(i=0;i<n;i++)
    printf("\n%s\t%d\t%d\t%d",temp[i].name,temp[i].at,temp[i].bt,temp[i].prt);

  temp[0].wt=0;
  for(i=1;i<n;i++)
    temp[i].wt=temp[i-1].wt+temp[i-1].bt;
    
  for(i=0;i<n;i++)
  {
    twt+=temp[i].wt;
    ttat+=temp[i].bt+temp[i].wt;
    tbt+=temp[i].bt;
  }

  printf("\n\ngantt chart: \n\n");
  for(i=0;i<n;i++)
    printf("  %d [%s]",temp[i].wt,temp[i].name);
  printf("  %d",tbt);
  printf("\n\navg waiting time: %.2f",twt/n);
  printf("\n\navg tat: %.2f",ttat/n);

}

void prt()
{
  cpu temp[MAX],temp1;
  int i,tbt=0,j;
  float twt=0,ttat=0;
  for(i=0;i<n;i++)  
    temp[i]=cpu1[i];

  for(i=1;i<=n;i++)
    for(j=0;j<n-i;j++)
      if(temp[j].prt>temp[j+1].prt)
      {
        temp1=temp[j];
        temp[j]=temp[j+1];
        temp[j+1]=temp1;
      }
  printf("\ndetails after sorting: ");
  printf("\nname\tat\tbt\tprt");
  for(i=0;i<n;i++)
    printf("\n%s\t%d\t%d\t%d",temp[i].name,temp[i].at,temp[i].bt,temp[i].prt);

  temp[0].wt=0;
  for(i=1;i<n;i++)
    temp[i].wt=temp[i-1].wt+temp[i-1].bt;
    
  for(i=0;i<n;i++)
  {
    twt+=temp[i].wt;
    ttat+=temp[i].bt+temp[i].wt;
    tbt+=temp[i].bt;
  }

  printf("\n\ngantt chart: \n\n");
  for(i=0;i<n;i++)
    printf("  %d [%s]",temp[i].wt,temp[i].name);
  printf("  %d",tbt);
  printf("\n\navg waiting time: %.2f",twt/n);
  printf("\n\navg tat: %.2f",ttat/n);

}

void rr()
{
  cpu temp[MAX],temp1;
  int i,tbt=0,j,qt,k=0;
  float twt=0,ttat=0;
  for(i=0;i<n;i++)  
    temp[i]=cpu1[i];

  for(i=1;i<=n;i++)
    for(j=0;j<n-i;j++)
      if(temp[j].at>temp[j+1].at)
      {
        temp1=temp[j];
        temp[j]=temp[j+1];
        temp[j+1]=temp1;
      }
  printf("\ndetails after sorting: ");
  printf("\nname\tat\tbt\tprt");
  for(i=0;i<n;i++)
    printf("\n%s\t%d\t%d\t%d",temp[i].name,temp[i].at,temp[i].bt,temp[i].prt);

  printf("\nenter qt: ");
  scanf("%d",&qt);
  for(i=0;i<n;i++)
  {
    tbt+=temp[i].bt;
    temp[i].rbt=temp[i].bt;
  }
  j=tbt;
  while(j)
    for(i=0;i<n;i++)
      if(temp[i].rbt>0)
      {
        printf("  %d [%s]",k,temp[i].name);
        if(temp[i].rbt<qt)
        {
          j-=temp[i].rbt;
          k+=temp[i].rbt;
          temp[i].rbt=0;
        }
        else
        {
          j-=qt;
          temp[i].rbt-=qt;
          k+=qt;
        }
        temp[i].k=k;
      }
  printf("  %d",tbt);
  for(i=0;i<n;i++)
  {
    temp[i].wt=temp[i].k-temp[i].bt-temp[i].at;
    twt+=temp[i].wt;
    ttat+=temp[i].k-temp[i].at;
  }
  printf("\n\navg waiting time: %.2f",twt/n);
  printf("\n\navg tat: %.2f",ttat/n);

}


main()
{
  int i,j,ch;
  printf("\nenter no of processes: ");
  scanf("%d",&n);
  printf("\nEnter process name,at,bt,prt: ");
  for(i=0;i<n;i++)
    scanf("%s%d%d%d",&cpu1[i].name,&cpu1[i].at,&cpu1[i].bt,&cpu1[i].prt);
  printf("\nentered details: ");
  printf("\nname\tat\tbt\tprt");
  for(i=0;i<n;i++)
    printf("\n%s\t%d\t%d\t%d",cpu1[i].name,cpu1[i].at,cpu1[i].bt,cpu1[i].prt);
  while(1)
  {
    printf("\n1.fcfs\n2.sjf\n3.prt\n4.rr\n5.exit\n\nenter ch: ");
    scanf("%d",&ch);
    switch(ch)
    {
      case 1:
        fcfs();
      break;
      case 2:
        sjf();
      break;
      case 3:
        prt();
      break;
      case 4:
        rr();
      break;
      case 5:
	exit(0);

    }
  }
}
