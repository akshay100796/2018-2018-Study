#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#define PI 3.14
#define ROOT3  1.732
int sqr();
int rect();
int trang();
int etrang();
int parall();
int trap();
int circle();
int ellips();
int sect();
int main()
{
	int n=0;
	do
	{
		int n;
		printf("\n");
		printf("\n	***------Welcome To Find Area------***");	
		printf("\n		 1. Area of Square");
		printf("\n		 2. Area of Rectangle");
		printf("\n		 3. Area of Trangle");
		printf("\n		 4. Area of Equillateral Trangle");
		printf("\n		 5. Area of Parallelogram");
		printf("\n		 6. Area of Trapezoid");
		printf("\n		 7. Area of Circle");
		printf("\n		 8. Area of Ellipse");
		printf("\n		 9. Area of Secter(1/4th part of circle)");
		printf("\n		10. I want Leave");
		printf("\n 		Enter Your Choice : ");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
				sqr();
			break;
			case 2:
				rect();
				break;
			case 3:
				trang();
			break;
			case 4:
				etrang();
			break;
			case 5:
				parall();
			break;
			case 6:
				trap();
			break;
			case 7:
				circle();
			break;
			case 8:
				ellips();
			break;
			case 9:
				sect();
			break;
			case 10:
				exit(0);
			break;		
		}
	}while(n!=10);
	return(n);
}

int sqr()
{
	float area;
	int s;
	printf("\n Enter Square Sides : ");
	scanf("%d",&s);
	area=s*s;
	printf("\n Your Require Square Area is  %.4f ",area);
	return 0;
}

int rect()
{
	int l,b,area;
	printf("\n Entre Lenth of Rectangle : ");
	scanf("%d",&l);
	printf("\n Enter Bridth of Rectangle : ");
	scanf("%d",&b);
	area=l*b;
	printf("\n Your Require Rectangle Area is  %d ",area);
	return 0;
}
int trang()
{
	float area;
	int l,h;
	printf("\n Enter Lenth of Trangle : ");
	scanf("%d",&l);
	printf("\n Enter Hight of tragle : ");
	scanf("%d",&h);
	area=0.5*l*h;
	printf("\n Your Require Trangle Area is  %.4f ",area);
	return 0;
}
int etrang()
{
	int l;
	float area;
	printf("\n Enter Equal Lenth of Trangle : ");
	scanf("%d",&l);
	area=(ROOT3/4)*(l*l);
	printf("\n Your Require Equillateral Tangle Area is  %.4f ",area);
	return 0;
}
int parall()
{
	int b,h;
	float area;
	printf("\n Enter Base of Parrallelogram : ");
	scanf("%d",&b);
	printf("\n Enter Hight of Parrallelogram: ");
	scanf("%d",&h);
	area=b*h;
	printf("\n Your Require Parallelogram Area is  %.4f ",area);	
	return 0;
}
int trap()
{
	int b1,b2,h;
	float area;
	printf("\n Enter First Base of Trapazoid : ");
	scanf("%d",&b1);
	printf("\n Enter Second Base of Trapazoid : ");
	scanf("%d",&b2);
	printf("\n Enter Hight of Trapazoid : ");
	scanf("%d",&h);
	area=h/2*(b1+b2);
	printf("\n Your Require Trapazoid Area is  %.4f ",area);
	return 0;
}
int circle()
{
	float area;
	int r;
	printf("\n Enter radias of Circle : ");
	scanf("%d",&r);
	area=PI*r*r;
	printf("\n Your Require Circle Area is  %.4f ",area);
	return 0;
}
int ellips()
{
	float area;
	int x,y;
	printf("\n Enter Radias for x  :  ");
	scanf("%d",&x);	
	printf("\n Enter Radias for y  :  ");
	scanf("%d",&y);
	area=PI*x*y;
	printf("\n Your Require Ellips Area is  %.4f ",area);	
	return 0;
}
int sect()
{
	int angle,r;
	float area;
	printf("\n Enter Radias of Circle : ");
	scanf("%d",&r);
	area=(PI*r*r)/4;										//this formula applicable only if angle between 2 radis line is 90 degree
	printf("\n Your Require Secter Area is  %.4f ",area);	
	return 0;
}







