#include<stdio.h>
int maha();
int guj();
int delhi();
int tamil();
int kolkata();
int main()
{
	maha();
	printf("\nI am back in Main() Function");
	return 0;
}
int maha()
{
	printf("\nI am in Maharashtra() Function");
	guj();
}
int guj()
{
	printf("\nI am in Gujrat() Function");
	delhi();
}
int delhi()
{
	printf("\nI am in Delhi() Function");
	tamil();
}
int tamil()
{
	printf("\nI am in Tamil() Function");
	kolkata();
}
int kolkata()
{
	printf("\nI am in Kolkata() Function");
	main()
}











