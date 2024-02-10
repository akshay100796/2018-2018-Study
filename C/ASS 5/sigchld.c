
/* Simplest dead child cleanup in a SIGCHLD handler. Prevent zombie processes
 * but don't actually do anything with the information that a child died.
 */
 
#include <sys/types.h>
#include <sys/wait.h>
#include <signal.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>

 
/* SIGCHLD handler. */
static void sigchld_hdl (int sig)
{
	/* Wait for all dead processes.
	 * We use a non-blocking call to be sure this signal handler will not
	 * block if a child was cleaned up in another part of the program. */
	pid_t   pid=getpid();
    int     stat; 
	while (waitpid(-1, &stat, WNOHANG) > 0) {
	printf("child %d terminated\n", pid);
	}
}
 
int main (int argc, char *argv[])
{
	struct sigaction act;
	int i;
 
	memset (&act, 0, sizeof(act));
	act.sa_handler = sigchld_hdl;
 
	if (sigaction(SIGCHLD, &act, 0)) {
		perror ("sigaction");
		return 1;
	}
 
	/* Make some children. */
	for (i = 0; i < 5; i++) 
	{
		switch (fork()) 
		{
			case -1:
				perror ("fork");
				return 1;
			case 0:
			
			printf("\n succesfully created\n");
			printf("\t %d \n",getpid());
				return 0;
		}
	}
 
	/* Wait until we get a sleep() call that is not interrupted by a signal. */
	while (sleep(10)) {
	printf("\nparentsleeping\n");
	}
 
	return 0;
}


/*
____________________________________________OUTPUT___________________________

akshay@akshay-MS-7788:~$ cd Desktop
akshay@akshay-MS-7788:~/Desktop$ gcc sigchld.c
akshay@akshay-MS-7788:~/Desktop$ ./a.out

 succesfully created
	 2527 

 succesfully created
	 2528 
child 2526 terminated

parentsleeping
child 2526 terminated

parentsleeping

 succesfully created
	 2529 
child 2526 terminated

parentsleeping

 succesfully created
	 2530 
child 2526 terminated

parentsleeping

 succesfully created
	 2531 
child 2526 terminated

parentsleeping
akshay@akshay-MS-7788:~/Desktop$ 


*/
