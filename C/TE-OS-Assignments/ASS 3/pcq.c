

#include<stdio.h>
#include<stdlib.h>
#include<semaphore.h>
#include<pthread.h>
#define BUFFER_SIZE 5

pthread_mutex_t mutex;
sem_t full,empty;
int buffer[BUFFER_SIZE];
int counter=0;
pthread_t tid;
int front=-1,rear=-1;

void *producer();
void *consumer();

int insert_item(int item)
{
  if(rear=-1)
           {
	      front=rear=0;
	   }
           if(((rear+1)%5)!=front) 
	   {
              buffer[rear] = item;
	      rear=(rear+1)%5;
              return 0;
           }
           else 
           { 
             /* Error the buffer is full */
              return -1;
           }
}

int remove_item(int *item)
{
   if(front!=-1) 
	   {
              *item = buffer[(front)];
             if(front==rear)
               {
                 front=rear=-1;
               }
             else
              front=(front+1)%5;
              return 0;
           }
           else 
           { 
             /* Error buffer empty */
              return -1;
           }
}

void *producer()
{
  int item;
  while(1)
  {
    sleep(2);
    item=rand();
    sem_wait(&empty);       /* acquire the empty lock */
    pthread_mutex_lock(&mutex);/* acquire the mutex lock */

    if(insert_item(item))
    {
      printf("\nProducer report error condition\n");
    }
    else
    {
      printf("\nProducer Produced %d\n",item);
    }
    
    pthread_mutex_unlock(&mutex);/* release the lock */
    sem_post(&full);/* acquire the full lock */
  }
}

void *consumer()
{
  int item;
  while(1)
  {
    sleep(2);
    item=rand();
    sem_wait(&full);/* acquire the full lock */
    pthread_mutex_lock(&mutex);/* acquire the mutex lock */

    if(remove_item(&item))
    {
      printf("\nConsumer report error condition\n");
    }
    else
    {
      printf("\nConsumer consumed %d\n",item);
    }

    pthread_mutex_unlock(&mutex);/* release the mutex lock */
    sem_post(&empty);/* acquire the empty lock */
  }
}

int main(int argc,char* argv[])
{
  int i;
 if(argc != 4) 
	   {
              fprintf(stderr, "USAGE:./main.out <INT> <INT> <INT>\n");
           }

  int mainSleepTime=atoi(argv[1]);
  int numProd=atoi(argv[2]);
  int numConsm=atoi(argv[3]);

  pthread_mutex_init(&mutex,NULL);
  sem_init(&full,0,0);
  sem_init(&empty,0,BUFFER_SIZE);

  counter=0;

/* Create the producer threads */
  for(i=0;i<numProd;i++)
  {
    pthread_create(&tid,NULL,producer,NULL);
  }

/* Create the consumer threads */
  for(i=0;i<numConsm;i++)
  {
    pthread_create(&tid,NULL,consumer,NULL);
  }

 /* join the thread */
 /*for(i = 0; i < numCons; i++) 
   {
     pthread_join(tid,NULL);
   }*/
          
  sleep(mainSleepTime);
  printf("Exit the program\n");
  exit(0);
}


/*
 OUTPUT:

localhost@ubuntu:~$ cc pcq.c -pthread
localhost@ubuntu:~$ ./a.out 5 4 3

Producer Produced 1714636915

Consumer consumed 1714636915

Producer Produced 1957747793

Consumer consumed 1957747793

Producer Produced 424238335

Consumer consumed 424238335

Producer Produced 719885386

Consumer consumed 719885386

Producer Produced 1025202362

Consumer consumed 1025202362

Producer Produced 1350490027

Consumer consumed 1350490027

Producer Produced 783368690

Producer Produced 1102520059
Exit the program



 
[student@localhost ~]$ cc pcq.c -lpthread
[student@localhost ~]$ ./a.out 10 3 3

Producer Produced 1804289383

Producer Produced 846930886

Producer Produced 1681692777

Consumer consumed 1681692777

Consumer consumed 0

Consumer report error condition

Producer Produced 719885386

Producer Produced 1649760492

Producer Produced 596516649

Consumer consumed 596516649

Consumer consumed 0

Consumer report error condition

Producer Produced 783368690

Producer Produced 1102520059

Producer Produced 2044897763

Consumer consumed 2044897763

Consumer consumed 0

Consumer report error condition

Producer Produced 304089172

Producer Produced 1303455736

Producer Produced 35005211

Consumer consumed 35005211

Consumer consumed 0

Consumer report error condition
Exit the program



[student@localhost ~]$ cc pcq.c -lpthread
[student@localhost ~]$ ./a.out 3 10 3

Producer Produced 1804289383

Producer Produced 846930886

Producer Produced 1681692777

Producer Produced 1714636915

Producer Produced 1957747793

Consumer consumed 1957747793

Consumer consumed 0

Producer Produced 424238335

Consumer consumed 424238335

Producer Produced 719885386

Producer Produced 596516649
Exit the program
[student@localhost ~]$ 



 
 */
