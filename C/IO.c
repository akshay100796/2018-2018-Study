#include<stdio.h>
#include<stdlib.h>
int main()
{
    FILE *f;
    char ch;
    f=fopen("abcd.txt","w");
    if(f==NULL)
    {
        printf("Can't Open File...");
        exit(0);
    }
    while(1)
    {
        ch=fgetc(f);
        if(ch==EOF)
            break;
        fputc(ch,stdin);
    }
    return 0;
}
