#include <fcntl.h>
#include <stdio.h>
#include <sys/stat.h>
#include <unistd.h>
#define MAX_BUF 1024
int main()
{
	int fd;
    	char * myfifo = "myfifo";
    	char buf[MAX_BUF];
    	//char buf1[MAX_BUF];
   	int words = 1, len = 0, i=0;
   	FILE *fp;
   	int fd1;
   	char * myfifo1 = "myfifo1";
    	/* create the FIFO (named pipe) */
    	mkfifo(myfifo1, 0777);
   	// mkfifo(myfifo, 0666);
     	/* open, read, and display the message from the FIFO */
    	fd = open(myfifo, O_RDWR);
    	read(fd, buf, MAX_BUF);
    	printf("First Message Received: %s\n", buf);
    	while(buf[i]!='\0')
    	{
    		while(buf[i]==' ')
    		{
			words++;
			i++;
    		}
		i++;
	}
	printf("\n total words = %d \n",words);
	fp = fopen("test.txt", "w+");
   	fprintf(fp, "\n total words = %d \n",words);
   	fputs("This is testing for fputs...\n", fp);
   	fclose(fp);
  	close(fd);
  	unlink(myfifo);
   	fd1 = open(myfifo1, O_RDWR);
    	write(fd1, &words, sizeof(words));
    	close(fd1);
	return 0;
}


/*

akshay@akshay-MS-7788:~$ cd Desktop
akshay@akshay-MS-7788:~/Desktop$ gcc fifo.c
akshay@akshay-MS-7788:~/Desktop$ ./a.out
First Message Received: This is nothing about kernel

 total words = 5
akshay@akshay-MS-7788:~/Desktop$ 

*/
















