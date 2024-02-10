#include<stdio.h>
int main()
{
	enum day{Sun,Mon,Tues,Wednes,Thurs=67,Fri,Sat};
	printf("\n\tI am Sunday    at  %d",Sun);
	printf("\n\tI am Monday    at  %d",Mon);
	printf("\n\tI am Tuesday  	at  %d",Tues);
	printf("\n\tI am Wednesday at  %d",Wednes);
	printf("\n\tI am Thursday  at  %d",Thurs);
	printf("\n\tI am Friday    at  %d",Fri);
	printf("\n\tI am Saturday  at  %d",Sat);
	return 0;
}
