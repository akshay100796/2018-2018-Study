

#include<stdlib.h>
#include<stdio.h>
#include<semaphore.h>
#include<unistd.h>
#include<sys/syscall.h>
#include<pthread.h>
#define MAX 10
pid_t gettid(void);

struct num
{
 int num1,num2;
};

void *multiply(void *arg)
{
 int *p = (int*)malloc(sizeof(int));
 struct num *t=(struct num*)arg;
 struct num m=*t;
 printf("after multiplication %d %d \n",m.num1,m.num2);
 *p=m.num1*m.num2;
 printf("%d\n",*p);
 printf("tid::=>%ld",syscall(SYS_gettid));  //gettid will not work here
pthread_exit(p);
return 0;
}

int main()
{
 pthread_t tid[MAX];
 struct num n;
 int sizetemp,r1,c1,r2,c2,value,i,j,k;
 void *s;
 int status;
 int MAT1[MAX][MAX],MAT2[MAX][MAX],MAT3[MAX][MAX];
 printf("ENTER THE MAT1 no of rows and no of cols\n");
 scanf("%d %d",&r1,&c1);
 printf("ENTER THE MAT2 no of rows and no of cols\n");
 scanf("%d %d",&r2,&c2);
 if(c1!=r2)
 {
  printf("MULTIPLICATION IS IMPOSSIBLE\n");
  exit(0);
 }
 printf("ENTER THE MAT1\n");
 for(i=0;i<r1;i++)
 {
  for(j=0;j<c1;j++)
   {
    scanf("%d",&MAT1[i][j]);
   }
 }

 printf("ENTER THE MAT2\n");
 for(i=0;i<r2;i++)
 {
  for(j=0;j<c2;j++)
   {
    scanf("%d",&MAT2[i][j]);
   }
 }
 value=0;
 for(i=0;i<r1;i++)
 {
  for(j=0;j<c2;j++)
   {
   for(k=0;k<c1;k++)
    {
    n.num1=MAT1[i][k];
    n.num2=MAT2[k][j];
    pthread_create(&tid[i],NULL,multiply,&n);

    pthread_join(tid[i],&s);
    status= *((int *)s); 
    printf("%d\n",status);
    value=value+status;  
    } 
  MAT3[i][j]=value;
  value=0;
  }
 }

 printf("RESULTANT MAT3  :==>>\n");
 for(i=0;i<r2;i++)
 {
  for(j=0;j<c2;j++)
   {
    printf("%d  ",MAT3[i][j]);
   }
 printf("\n");
 }
return 1;
}
/*
------------------------OUTPUT--------------------


akshay@akshay-MS-7788:~$ cd Desktop
akshay@akshay-MS-7788:~/Desktop$ gcc mat.c -lpthread
akshay@akshay-MS-7788:~/Desktop$ ./a.out
ENTER THE MAT1 no of rows and no of cols
3
3
ENTER THE MAT2 no of rows and no of cols
3
3
ENTER THE MAT1
7
5
4
1
2
8
3
5
9
ENTER THE MAT2
1
2
3
6
5
4
7 
8
9
after multiplication 7 1 
7
tid::=>28947
after multiplication 5 6 
30
tid::=>289530
after multiplication 4 7 
28
tid::=>289628
after multiplication 7 2 
14
tid::=>289714
after multiplication 5 5 
25
tid::=>289825
after multiplication 4 8 
32
tid::=>289932
after multiplication 7 3 
21
tid::=>290021
after multiplication 5 4 
20
tid::=>290120
after multiplication 4 9 
36
tid::=>290236
after multiplication 1 1 
1
tid::=>29031
after multiplication 2 6 
12
tid::=>290412
after multiplication 8 7 
56
tid::=>290556
after multiplication 1 2 
2
tid::=>29062
after multiplication 2 5 
10
tid::=>290710
after multiplication 8 8 
64
tid::=>290864
after multiplication 1 3 
3
tid::=>29093
after multiplication 2 4 
8
tid::=>29108
after multiplication 8 9 
72
tid::=>291172
after multiplication 3 1 
3
tid::=>29123
after multiplication 5 6 
30
tid::=>291330
after multiplication 9 7 
63
tid::=>291463
after multiplication 3 2 
6
tid::=>29156
after multiplication 5 5 
25
tid::=>291625
after multiplication 9 8 
72
tid::=>291772
after multiplication 3 3 
9
tid::=>29189
after multiplication 5 4 
20
tid::=>291920
after multiplication 9 9 
81
tid::=>292081
RESULTANT MAT3  :==>>
65  71  77  
69  76  83  
96  103  110  
akshay@akshay-MS-7788:~/Desktop$ 


