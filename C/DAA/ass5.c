#include<stdio.h>
#include<ctype.h>
#include<string.h>

void Fprime();
void Tprime();
void T();
void check1();
void F();

char expr[15];
int count,flag;

void main()
{
        count=0;
        flag=0;
        printf("\n Enter an algebraic expression");
        scanf("%s",expr);
        T();
        if((strlen(expr)== count) && (flag ==0))
        {
                printf("\n The expression %s is valid\n",expr);
         }
         else
         {
                printf("\n The expression %s is Invalid\n",expr);
         }
         
 }
 
 void T()
 {
        F();
        Tprime();
 }
 
 void F()
 {
        check1();
        Fprime();
 }
 void Fprime()
 {
        if(expr[count] == '*')
        {
                count++;
                check1();
                Fprime();
        }
 }
 
 void check1()
 {
        if(isalnum(expr[count]))
        {
                count++;
        }
        else if(expr[count] =='(') 
        {
                count++;
                T();
                if(expr[count] ==')')
                {
                        count++;
                 }
                 else
                 {
                        flag =1;
                  }
           }
           else
           {
                flag =1;
            }
   }
   
   void Tprime()
   {
        if(expr[count] =='+')
        {
                count++;
                F();
                Tprime();
          }
   }                                                                   
          
          
          
***************OUTPUT***************

svit@abhiru:~$ cd Desktop
svit@abhiru:~/Desktop$ gcc ass5.c
svit@abhiru:~/Desktop$ ./a.out

 Enter an algebraic expression(a+b)*c

 The expression (a+b)*c is valid
svit@abhiru:~/Desktop$ gcc ass5.c
svit@abhiru:~/Desktop$ ./a.out

 Enter an algebraic expression(a+b*c

 The expression (a+b*c is Invalid
svit@abhiru:~/Desktop$ 


          
