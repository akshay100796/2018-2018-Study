package SwingOperation.src; /**
 * 
 *   Coder              :      Akshay Pawar
 * 
 *   Source Code        :      Programm of KBC (kaun Banega Carodpati) in java Language for Biginner
 *                  
 *   Used Content       :      Array, if_else, Swich-case
 * 
 *   Programming Level  :      Biginnar 
 * 
 *   IDE Used           :      Netbeans IDE 8.2
 *   
 */

import java.io.*;
public class kbc 
{
    public static void main(String[] args) throws IOException
    {
        int n,i,j,k;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String name;
        char ans[]={3,3,1,1,2};
        System.out.println("Enter your Name : ");
        name = b.readLine();
        System.out.println("Welcome "+name+", in KAUN BANEGA COREPATI");
        System.out.println("_________________________________________");
        System.out.println("1. Let's Start ");
        System.out.println("2. Display Rules");
        System.out.println("3. Quit");
        System.out.println("   Enter your Choice : ");
        n=Integer.parseInt(b.readLine());
        switch(n)
        {
            case 1:
            {
                System.out.println("LEVEL 1 for Rs. 10,000 \n");
                System.out.println("Q.1) Name the Country having Largest Popuplation ");        
                System.out.println(" 1) Russia \t 2) India \n 3) China \t 4) America");   
                System.out.print("\n1. Lifelines");
                System.out.print("\n2. Give us Answare \n-->");
                int l1=Integer.parseInt(b.readLine());
                if(1==l1) 
                {
                    System.out.println("1]-------> 5%");
                    System.out.println("2]--------------> 15%");
                    System.out.println("3]-------------------------------> 60%");
                    System.out.println("4]-------------------> 20%");
                    System.out.println(" Enter your choice : ");
                    int ua0 = Integer.parseInt(b.readLine());
                    if(ans[0]==ua0) 
                    {
                        System.out.println("Congratulation...you won Rs. 10,000");
                        System.out.println("________________________________________");
                        System.out.println("LEVEL 2 for Rs. 1,00,000 \n");
                        System.out.println("Q.2) Where is Fort William located ?");
                        System.out.println(" 1) Chennai \t 2) Goa \n 3) Kolkata \t 4)Maisur ");  
                        System.out.print("\n1. Lifelines");
                        System.out.print("\n2. Give us Answare \n-->");
                        int l2 = Integer.parseInt(b.readLine());
                        if(l2==1) 
                        {
                            System.out.println("Answare Either 2 or 3 : ");        
                            int ua1 = Integer.parseInt(b.readLine());
                            if(ans[1]==ua1) 
                            {
                                System.out.println("Congratulation...you won Rs. 1,00,000");
                                System.out.println("________________________________________");
                                System.out.println("LEVEL 3 for Rs. 10,00,000 \n");
                                System.out.println("Q.3 Which country to host the 2018 ASEAN-India Pravasi Bharatiya Divas (PBD)?");
                                System.out.println(" 1) Singapore \t 2) India \n 3) Malaysia \t 4)Indonesia ");  
                                System.out.print("\n1. Lifelines");
                                System.out.print("\n2. Give us Answare \n-->");
                                int l3 = Integer.parseInt(b.readLine());
                                if(l3==1) 
                                {
                                    System.out.println("Answare Either 1 or 2 : ");
                                    int ua2 = Integer.parseInt(b.readLine());
                                    if(ans[2]==ua2)  
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("___________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan "); 
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1) 
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3) 
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("___________________________________");                                               
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                } 
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3) 
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");  
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }

                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                                else
                                {
                                    System.out.println("Enter your Choice : \n-->");
                                    int ua3 = Integer.parseInt(b.readLine());
                                    if(ans[3]==ua3)
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("______________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan ");
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1)
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("___________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra "); 
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("next 5th question will apper here");
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 2");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("\t\t\t Oops...Right Answare is 3");
                                System.out.println("\t\t\t Thanks for Playing with us ");
                                System.out.println("\t\t\t Wining Price is : Rs. 10,000");
                                System.exit(0);
                            }
                        }
                        else
                        {
                            System.out.println("Enter your Choice : \n-->");
                            int ua1 = Integer.parseInt(b.readLine());
                            if(ans[1]==ua1)
                            {
                                System.out.println("Congratulation...you won Rs. 1,00,000");
                                System.out.println("________________________________________");
                                System.out.println("LEVEL 3 for Rs. 10,00,000 \n");
                                System.out.println("Q.3 Which country to host the 2018 ASEAN-India Pravasi Bharatiya Divas (PBD)?");
                                System.out.println(" 1) Singapore \t 2) India \n 3) Malaysia \t 4)Indonesia ");  
                                System.out.print("\n1. Lifelines");
                                System.out.print("\n2. Give us Answare \n-->");
                                int l3 = Integer.parseInt(b.readLine());
                                if(l3==1)
                                {
                                    System.out.println("Answare Either 1 or 2 : ");
                                    int ua2 = Integer.parseInt(b.readLine());
                                    if(ans[2]==ua2)
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("___________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan "); 
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1)
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand  \t\t 4) Maharashtra "); 
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            } 
                                        }
                                    }  
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                                else
                                {
                                    System.out.println("Enter your Choice : \n-->");
                                    int ua2 = Integer.parseInt(b.readLine());
                                    if(ans[2]==ua2)
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("___________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea   4) Japan ");  // 1
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1)
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("___________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");  // 2
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }  
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("___________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                } 
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }  
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("\t\t\t Oops...Right Answare is 3");
                                System.out.println("\t\t\t Thanks for Playing with us ");
                                System.out.println("\t\t\t Wining Price is : Rs. 10,000");
                                System.exit(0);
                            }   
                        }
                    }
                    else
                    {
                        System.out.println("\t\t\t Oops...Right Answare is 3");
                        System.out.println("\t\t\t Thanks for Playing with us ");
                        System.exit(0);
                    }
                }
//________________________________________________________________________________________________________________________________
                else  
                {
                    System.out.println("Enter your Choice : \n-->");
                    int ua0 = Integer.parseInt(b.readLine());
                    if(ans[0]==ua0)
                    {
                        System.out.println("Congratulation...you won Rs. 10,000");
                        System.out.println("________________________________________");
                        System.out.println("LEVEL 2 for Rs. 1,00,000");
                        System.out.println("Q.2) Where is Fort William located ?");
                        System.out.println(" 1) Chennai \t 2) Goa \n 3) Kolkata \t 4)Maisur ");  
                        System.out.print("\n1. Lifelines");
                        System.out.print("\n2. Give us Answare \n-->");
                        int l2 = Integer.parseInt(b.readLine());
                        if(l2==1) 
                        {
                            System.out.println("Answare Either 2 or 3 : ");      
                            int ua1 = Integer.parseInt(b.readLine());
                            if(ans[1]==ua1) 
                            {
                                System.out.println("Congratulation...you won Rs. 1,00,000");
                                System.out.println("________________________________________");
                                System.out.println("LEVEL 3 for Rs. 10,00,000 \n");
                                System.out.println("Q.3 Which country to host the 2018 ASEAN-India Pravasi Bharatiya Divas (PBD)?");
                                System.out.println(" 1) Singapore \t 2) India \n 3) Malaysia \t 4)Indonesia "); 
                                System.out.print("\n1. Lifelines");
                                System.out.print("\n2. Give us Answare \n-->");
                                int l3 = Integer.parseInt(b.readLine());
                                if(l3==1) 
                                {
                                    System.out.println("Answare Either 1 or 2 : ");
                                    int ua2 = Integer.parseInt(b.readLine());
                                    if(ans[2]==ua2) 
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("___________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan ");
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1) 
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3) 
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra "); 
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");   
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                } 
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3) 
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");  // 2
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                                else
                                {
                                    System.out.println("Enter your Choice : \n-->");
                                    int ua3 = Integer.parseInt(b.readLine());
                                    if(ans[3]==ua3)
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("______________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan ");  
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1)
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");  
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("___________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra "); 
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("\t\t\t Oops...Right Answare is 3");
                                System.out.println("\t\t\t Thanks for Playing with us ");
                                System.out.println("\t\t\t Wining Price is : Rs. 10,000");
                                System.exit(0);
                            }
                        }
                        else
                        {
                            System.out.println("Enter your Choice : \n-->");
                            int ua1 = Integer.parseInt(b.readLine());
                            if(ans[1]==ua1)
                            {
                                System.out.println("Congratulation...you won Rs. 1,00,000");
                                System.out.println("________________________________________");
                                System.out.println("LEVEL 3 for Rs. 10,00,000 \n");
                                System.out.println("Q.3 Which country to host the 2018 ASEAN-India Pravasi Bharatiya Divas (PBD)?");
                                System.out.println(" 1) Singapore \t 2) India \n 3) Malaysia \t 4)Indonesia ");  
                                System.out.print("\n1. Lifelines");
                                System.out.print("\n2. Give us Answare \n-->");
                                int l3 = Integer.parseInt(b.readLine());
                                if(l3==1)
                                {
                                    System.out.println("Answare Either 1 or 2 : ");
                                    int ua2 = Integer.parseInt(b.readLine());
                                    if(ans[2]==ua2)
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("______________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan "); 
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1)
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra "); 
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");  
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us \n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            } 
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,000");
                                        System.exit(0);
                                    }
                                }
                                else
                                {
                                    System.out.println("Enter your Choice : \n-->");
                                    int ua2 = Integer.parseInt(b.readLine());
                                    if(ans[2]==ua2)
                                    {
                                        System.out.println("Congratulation...you won Rs. 10,00,000");
                                        System.out.println("______________________________________");
                                        System.out.println("LEVEL 4 for Rs. 50,00,000 \n");
                                        System.out.println("Q.4 The world’s tallest and longest glass bridge has opened in which country?");
                                        System.out.println(" 1) China \t 2) North Corea \n 3) South Korea  4) Japan "); 
                                        System.out.print("\n1. Lifelines");
                                        System.out.print("\n2. Give us Answare \n-->");
                                        int l4 = Integer.parseInt(b.readLine());
                                        if(l4==1)
                                        {
                                            String fname;
                                            System.out.println("Which Friend do you want to call ? ");
                                            fname=b.readLine();
                                            System.out.println("Your Friend "+fname+" says Ans  1 ");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra ");  
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                        
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 2");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Enter your Choice : \n-->");
                                            int ua3 = Integer.parseInt(b.readLine());
                                            if(ans[3]==ua3)
                                            {
                                                System.out.println("Congratulation...you won Rs. 50,00,000");
                                                System.out.println("______________________________________");
                                                System.out.println("LEVEL 5 for Rs. 1,00,00,000 \n");
                                                System.out.println("Q.5 The National Sugar Institute (NSI) is located in which state?");
                                                System.out.println(" 1) Madhya Pradesh \t 2) Uttar Pradesh \n 3) Jharkhand \t\t 4) Maharashtra "); 
                                                System.out.print("\n1. Lifelines");
                                                System.out.print("\n2. Give us Answare \n-->");
                                                int l5 = Integer.parseInt(b.readLine());
                                                if(l5==1) 
                                                {
                                                    System.out.println("Expert Judge Mr. R. S. Kapoor Says Answare  2 (Uttar Pradesh)");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4)
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Enter your Choice : \n-->");
                                                    int ua4 = Integer.parseInt(b.readLine());
                                                    if(ans[4]==ua4) 
                                                    {
                                                        System.out.println("\n\n\n\n\n\t\t\t\tFIRST  CORERPATI");
                                                        System.out.println("\n\n\t\t\t\tCongratulation...you won Rs. 1,00,00,000");
                                                        System.out.println("\t\t\t\t____________________________________________________");
                                                        System.out.println("\t\t\t\tThank you Mr/Mrs "+name+" to play with us\n\n\n\n");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                                        System.out.println("\t\t\t Wining Price is : Rs. 50,00,000");
                                                        System.exit(0);
                                                    }
                                                } 
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\t Oops...Right Answare is 1");
                                                System.out.println("\t\t\t Thanks for Playing with us ");
                                                System.out.println("\t\t\t Wining Price is : Rs. 10,00,000");
                                                System.exit(0);
                                            }
                                        }  
                                    }
                                    else
                                    {
                                        System.out.println("\t\t\t Oops...Right Answare is 1");
                                        System.out.println("\t\t\t Thanks for Playing with us ");
                                        System.out.println("\t\t\t Wining Price is : Rs. 1,00,00,000");
                                        System.exit(0);
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("\t\t\t Oops...Right Answare is 3");
                                System.out.println("\t\t\t Thanks for Playing with us ");
                                System.out.println("\t\t\t Wining Price is : Rs. 10,000");
                                System.exit(0);
                            }   
                        }
                    }
                    else
                    {
                        System.out.println("\t\t\t Oops...Right Answare is 3");
                        System.out.println("\t\t\t Thanks for Playing with us ");
                        System.exit(0);
                    }
                }
            }
            break;
            case 2:
            {
                System.out.println("1. Display chart of 5 Question ");
                System.out.println("2. Audiance Poll ");
                System.out.println("3. 50-50 ");
                System.out.println("4. Judje ");
                System.out.println("   Enter choice to see Rules : ");
                int d =Integer.parseInt(b.readLine());
                switch(d)
                {
                    case 1:
                        
                        System.out.println("First  Question for Rs. 10,000 (10 Thausand)\n Lifeline is : Audiance pole");
                        System.out.println("Second Question for Rs. 1,00,000 (1 Lakh) \n Lifeline is : 50-50");
                        System.out.println("Third  Question for Rs. 10,00,000 (10 Lakh) \n Lifeline is : 50-50");
                        System.out.println("Fourth Question for Rs. 50,00,000 (50 Lakh) \n Lifeline is : Phone a Friend ");
                        System.out.println("Fifth  Question for Rs. 1,00,00,000 (1 Cr.) \n Lifeline is : Judge");
                        break;
                    case 2:
                          System.out.println("100 Audiance are Available , your Ans Will calculate in Percentage(%)");
                          break;
                    case 3:
                        System.out.println("We will either delete any 2 option or sujjest any 2 Correct Answare");
                        break;
                    case 4:
                        System.out.println("Finally , we will provide you judge.\n Who name is R. S. Kapoor \n He will Definatly tells you Correct Answare ");
                        break;
                }
            }     
            break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please Enter Correct Choice : ");            
        }
    }
}