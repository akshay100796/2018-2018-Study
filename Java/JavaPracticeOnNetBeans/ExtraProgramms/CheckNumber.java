package ExtraProgramms;

public class CheckNumber 
{
    public static void main(String[] args) 
    {
        String digit = "Akshay257429Pawar";
        
        for(int i=0;i<digit.length();i++)
        {
            boolean b = Character.isDigit(digit.charAt(i));
            if(b)
            {
                System.out.println(digit.charAt(i)+" is Number");
            }
            else
            {
                System.out.println(digit.charAt(i)+" is Not Digit");
            }
        } 
    }
}

