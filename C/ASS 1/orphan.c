

#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdio.h>

int main()
{
  pid_t ch;
printf("before fork\n");  

ch=fork();
  if(ch>0)
    {

    printf("parent process %dstarted\n",getpid());
    printf("Parent of parent is %d\n",getppid());
	
    }
  else
    {
     printf("\nchild process is %d",getpid());
     printf("\nparent of child process is %d",getppid());
     printf("\nchild prints 1 item");
     sleep(10);
     printf("\nchild prints 2 item");
     printf("\nparent of child process is %d",getppid());
     
    }
  return 0;
}


/*Output
yashashri@yashashri-Inspiron-3542:~$ cd OS
yashashri@yashashri-Inspiron-3542:~/OS$ gcc orphan.c
yashashri@yashashri-Inspiron-3542:~/OS$ ./a.out
before fork
parent process 3688started
Parent of parent is 3633

child process is 3689
parent of child process is 1767
yashashri@yashashri-Inspiron-3542:~/OS$ child prints 1 item
child prints 2 item
parent of child process is 1767
*/

