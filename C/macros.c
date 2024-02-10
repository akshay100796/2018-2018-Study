#include<stdio.h>
#include<conio.h>
#define PI 3.14
#define Area() (PI*r*r)
int main()
{
	int r;
	float area;
	printf("\n\n\tEnter radias of Circle : ");
	scanf("%d",r);
	area=Area(r);                                //Formula for area of Circle
	printf("\n The Area of Circle is : %f",area);
	return 0;
}


//   This Program can't  executes because gives some error.....
