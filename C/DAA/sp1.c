#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
 int isKeyword(char buffer1[])
{
   char keyword[32][10]=
     {
          "auto","break","case","char","consl","continue","default","do","double","else","enum",
          "extern","float","for","goto","if","int","","long","register","retrurn","short","signed",
           "sizeof","static","struct","switch","typedef","union","unsigned","void","volatile","while"
     };
int j,flag=0;
for(j=1;j<32;j++)
  {
      if(strcmp(keyword[j],buffer1)==0)
          {
                flag=1;
                break;
           }
  }
return flag;
}
int main()
{
  char ch1,buffer1[15],operator[]="+-*/%=";
   FILE *fp;
   int k,l=0;
    fp=fopen("/home/svit/program.txt","r");
   if(fp==NULL)
     {
         printf("enter while opening the file\n");
         exit(0);
     }
while((ch1=fgetc(fp))!=EOF)
{
    for(k=1;k<6;k++)
      {
          if(ch1==operator[k])
          printf("%s :-is operator\n",ch1);
      }
	if(isalnum(ch1))
	{
	    buffer1[l++]=ch1;
	}
	else if((ch1== ' ' || ch1=='\n')&&(l!=0))
	{
	   buffer1[l]='\0';
	    l=0;

		if(isKeyword(buffer1)==1)
		printf("%s :-is keyword\n",buffer1);
		else
		printf("%s :-is identifier\n",buffer1);
	}
}
fclose(fp);
return 0;
}
/********************************output/*************************
svit@svit-ThinkCentre-M70e:~$ gcc sp1.c
svit@svit-ThinkCentre-M70e:~$ ./a.out
void :-is keyword
main :-is identifier
int :-is keyword
abadd :-is identifier
svit@svit-ThinkCentre-M70e:~$ 


