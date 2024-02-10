
#include<iostream>
using namespace std;
class Akshay
{
	public:
		int rn;
		char name[20];
		char passwd[30];
	int input()
	{
		cout<<"\n Enter Roll No : ";
		cin>>rn;
		cout<<"\n Enter Name   :  ";
		cin>>name;
		cout<<"Enter valid password  (only letters) : ";
		cin>>passwd;
	}
	int output()
	{
		cout<<"\n user_id      :  "<<rn;
		cout<<"\n usename  :  "<<name;
		cout<<"\n Passwd   :"<<passwd<<"\n";
	}
};
int main()
{
	Akshay a;
	a.input();
	a.output();
	return 0;

}





























