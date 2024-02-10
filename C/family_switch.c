/*You have to do Program of Family Switch using Function */
/*This prog is also family switch but normal in main() function*/

#include<stdio.h>
void main()
{
	int n;
	printf("\n 1.Ramdas Kisan Pawar ");
	printf("\n Press 1 to Continue.... ");
	printf("\nEnter Your Choice : ");
	scanf("%d",&n);
	switch(n)
	{
	
		case 1:
			printf("\n1. Tilusa      Ramdsa Pawar ");       //Done------------------------------------
			printf("\n2. Bhalchandra Ramdas Pawar ");  //Done------------------------------------
			printf("\n3. Brijlal     Ramdas Pawar ");
			printf("\n Enter Your Choice : ");
			scanf("%d",&n);
			switch(n)
			{
				case 1:
					printf("\n Information Not Available for Tilusa Pawar [He is no more with us] (N/A)");
					printf("\n 1. Chandrakant Tilusa Pawar");
					printf("\n 2. Manda Tilusa Pawar (surname is Be4 Marride)");
					printf("\n 3. Kunda Tilusa Pawar (surname is Be4 Marride)");
					printf("\n Enter Your Choice : ");	
					scanf("%d",&n);
					switch(n)
					{
						case 1:
								printf("\nLive in Nashik (MH) , Retire Person from TC in Railway");
								printf("\nSorry...No More Information Available Yet....N/A");
								break;
						case 2:
								printf("\nLive in Surat (GJ) , Retire Women in Home");
								printf("\nSorry...No More Information Available Yet....N/A");
								break;
						case 3:
								printf("Live in Surat (GJ) , Retire Women in Home");
								printf("\nSorry...No More Information Available Yet....N/A");
								break;
						default :
								printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
								break;
					}
					break;
				case 2:
					printf("\n Information Not Available for Bhalchandra Pawar [He is no more with us] (N/A)");
					printf("\n 1. Umakant  Bhalchandra Pawar");
					printf("\n 2. Shubhash Bhalchandra Pawar");
					printf("\n 3. Ganesh   Bhalchandra Pawar");
					printf("\n Enter Your Choice : ");
					scanf("%d",&n);
					switch(n)
					{
						case 1:
							printf("\n Live in Sinnar <Nashik> (MH) , Worked as Animal Doctor [He is no more with us]");
							printf("\n    Sorry... We can't Extend any more Information...N/A");
							printf("\n 1. Dnyaneshwar Umakant Pawar");
							printf("\n 2. Gajanan Umakant Pawar");
							printf("\n Enetr Your choice : ");
							scanf("%d",&n);
							switch(n)
							{
								case 1:
									printf("\nLive in Nashik (MH) , Working Something...N/A");
									printf("\nSorry...No More Information Available Yet about Dnyaneshar Pawar....");
									printf("\n He has One Doughter.... Siddhi Dnyaneshwar Pawar");
									printf("\n She is work as a Student....");
								break;
								case 2:
									printf("\nLive in Sinnar <Nashik> (MH) , Works Nothing...");
									printf("\nSorry...No More Information Available Yet about Gajanan Pawar....");
									printf("\n He has One Son.... Rushikesh Gajanan Pawar");
									printf("\n He is work as a Student....");
								break;
								default :
									printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
									break;
							}
						break;
						case 2 : 
							printf("Live in Surat (GJ) , He has Own Cloth Raymond Shop ");
							printf("\nSorry...No More Information Available Yet....N/A");
							printf("\n 1. Rajesh Shubhash Pawar");
							printf("\n 2. Mukesh Shubhash Pawar");
							printf("\n 3. Bhavna Shubhash Pawar <Surname be4 Marride>");
							printf("\n Enter Your Choice : ");
							scanf("%d",&n);
							switch(n)
							{
								case 1:
									printf("\n Live in Surat (GJ) , He has Own Cloth Raymond Shop  ");
									printf("\nSorry...No More Information Available Yet about Rajesh Pawar....");
									printf("\nHe has one Son Name give soon...");
									printf("\nHe Work as a student...");
								break;
								case 2:
									printf("\n Live In Amdabad (GJ) , He has Own Company of Chemical");
									printf("\nSorry...No More Information Available Yet about Mukesh Pawar....N/A");
									printf("\n He has Two Children whose work as Student ");
								break;
								case 3:
									printf("\nLive in Mumbai (MH) , Just Marride be4 1 Year , Work as a House Wife");
									printf("\nSorry...No More Information Available Yet about Bhavna Pawar....N/A");
								break;
								default :
									printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
								break;
							}
						break;
						case 3:
								printf("\n Live in Surat (GJ) , Work as a Worker ");
								printf("\n Sorry...No More Information Available Yet about Ganesh Pawar....");
								printf("\n He has One Doughter , \n Name : Sonal Ganesh Pawar <Marride>");
						break;
						default :
								printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
								break;
					}
					break;
				case 3 : 
						printf("\n Information Not Available for Brijlal Pawar [He is no more with us] (N/A)");
						printf("\n 1. Kishor  Brijlal Pawar");
						printf("\n 2. Mukund  Brijlal Pawar");
						printf("\n 3. Sunil   Brijlal Pawar");
						printf("\n 4. Sanjay  Brijlal Pawar");
						printf("\n 5. Bhimrav Brijlal Pawar");
						printf("\n Enter Your Choice : ");
						scanf("%d",&n);
						switch(n)
						{
							case 1:		//---------------------------------------------------------------------Kishor Pawar
								printf("\n Live in Surat (GJ) , Work as a Worker in Company  ");
								printf("\n Sorry...No more Information Available about Kishor Pawar...");
								printf("\n 1. Rita     Kishor Pawar");
								printf("\n 2. Manoj    Kishor Pawar");
								printf("\n 3. Ashish   Kishor Pawar");
								printf("\n 4. Shailesh Kishor Pawar");
								printf("\n Enter Your Choice : ");
								scanf("%d",&n);
								switch(n)
								{
									case 1 : 
										printf("\n Live in Surat (GJ) , Work as a House wife");
										printf("\n  Sorry...No more Information Available about Rita Pawar...");
										break;
									case 2:
										printf("\n Live in Surat (GJ) , Work as a worker in Company ");
										printf("\n  Sorry...No more Information Available about Manoj Pawar...");
										break;
									case 3:
										printf("\n Live in Surat (GJ) , Work as a Contracter");
										printf("\n  Sorry...No more Information Available about Ashish Pawar...");
										break;
									case 4:
										printf("\n Live in Surat (GJ) , Work as a Shop Owner");
										printf("\n  Sorry...No more Information Available about Shailesh Pawar...");
										break;
									default :
										printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 4....");
										break;
								}
								break;
							case 2 :         //--------------------------------------------------------------------------Mukund Pawar
								printf("\n Live in Surat (GJ) , Work as a Katlari Owner ");
								printf("\n Sorry...No more Information Available about Mukund Pawar...");
								printf("\n 1. Anil   Mukund Pawar ");
								printf("\n 2. Shital Mukund Pawar");
								printf("\n Enter Your Choice : ");
								scanf("%d",&n);
								switch(n)
								{
									case 1:
										printf("\n Live in Surat (GJ) , Work as a Postman");
										printf("\n  Sorry...No more Information Available about Anil Pawar...");
										break;
									case 2:
										printf("\n Live in Surat (GJ) , Work as a House wife");
										printf("\n  Sorry...No more Information Available about Shital Pawar...");
										break;
									default :
										printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
										break;
								}
								break;
							case 3:  //-------------------------------------------------------------------------Sunil Pawar
								printf("\n Live in Sinnar <Nashik> (MH) , Work as a Shop Owner...");
								printf("\n Mobile no : 8007546981 , \n Address : Gavtha Sinnar, Nashik 422103 ");
								printf("\n 1. Vicky   Sunil Pawar");
								printf("\n 2. Akshay  Sunil Pawar ");
								printf("\n 3. Pallavi Sunil Pawar ");
								printf("\n Enter Your Choice : ");
								scanf("%d",&n);
								switch(n)
								{
									case 1:
										printf("\n Work as Student ,\n Education : Graduate in Commers , Banking ,Taxesion");
										printf("\n Mobile : 9623998486 \nAddress : Gavtha Sinnar, Nashik 422103  ");
										printf("\n Email  : vicky.pawar198@gmail.com ");
										break;
									case 2:
										printf("\n Work as a Student ,\nEducation : Second Year in Information Technology");
										printf("\nCollage : SVIT Chincholi Collage ,Nashik ,\nAddress : Gavtha Sinnar, Nashik 422103 ");
										printf("\nEmail   : pawarakshay13@gmail.com \nMobile  : 9657513437 || 7757888063 ");
										break;
									case 3:
										printf("\n Work as A Student ,\nEducation : 12th Science");
										printf("\nCollage : Navgeevan Collage ,Sinnae ,\n Address : Gavtha Sinnar, Nashik 422103 ");
										break;
									default :
										printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
										break;
								}
								break;
							case 4 :   //-----------------------------------------------------------Sanjay Pawar
								printf("\nLive in Surat (GJ) , Work as a Tailer");
								printf("\n  Sorry...No more Information Available about Sanjay Pawar...");
								printf("\n 1. Nikhil Sanjay Pawar");
								printf("\n 2. Harshita Sanjay Pawar");
								printf("\n Enter Your Choice : ");
								scanf("%d",&n);
								switch(n)
								{
									case 1 : 
										printf("\nLive in Surat (GJ) , Work as a Student");
										printf("\n  Sorry...No more Information Available about Nikhil Pawar...");	
										break;
									case 2:
										printf("\nLive in Surat (GJ) , Work as a Student");
										printf("\n  Sorry...No more Information Available about Harshita Pawar...");
										break;
									default :
										printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
										break;
								}
								break;
							case 5 : 
								printf("\nLive in Surat (GJ) , Work as a cloth Exporter within area");
								printf("\n  Sorry...No more Information Available about Bhimrav Pawar...");
								printf("\n 1. Tushar Bhimrav Pawar ");
								printf("\n 2. Eshita Bhimrav Pawar");
								printf("Enter Your Choice : ");
								scanf("%d",&n);
								switch(n)
								{
									case 1:
										printf("\nLive in Surat (GJ) , Work as a Student");
										printf("\n  Sorry...No more Information Available about Tushar Pawar...");	
										break;
									case 2:
										printf("\nLive in Surat (GJ) , Work as a Student");
										printf("\n  Sorry...No more Information Available about Eshita Pawar...");
										break;
									default :
										printf("Sorry...Your Enterance is Not match to our case....Plaese try within 1 to 3....");
										break;
									
								}
								break;
						}
						
						
			}
			break;

	}
	
	
}









