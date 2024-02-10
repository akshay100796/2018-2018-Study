package generalOld.src;

import java.util.Scanner;
class cont
{
    public static void main(String[] args)
    {
        int n,i;
        String[] dlt=new String[5];
        Scanner s = new Scanner(System.in);
        String arry[]={"asa","qwq","ooo","xxx","hhh"};
        System.out.println(" 0 "+arry[0]);
        System.out.println(" 1 "+arry[1]);
        System.out.println(" 2 "+arry[2]);
        System.out.println(" 3 "+arry[3]);
        System.out.println(" 4 "+arry[4]);
        for(i=0;i<arry.length;i++)
            dlt[i]=arry[i];
System.out.println("Enter no to delete : ");
        n = s.nextInt();
        for(i=0;i<dlt.length;i++)
        {
            if(i!=n)
                continue;
            else
            {
                for(i=n;i<dlt.length;i++)
                {
                    dlt[i]=dlt[i+1];
                }
            }
        }
        dlt[i]=dlt[i+1];
        for(i=0;i<dlt.length;i++)
        {
            System.out.println(" 0 "+dlt[0]);
            System.out.println(" 1 "+dlt[1]);
            System.out.println(" 2 "+dlt[2]);
            System.out.println(" 3 "+dlt[3]);
            System.out.println(" 4 "+dlt[4]);
        }
    } 
}
