
package Singleton;

public class ConstantSingleton 
{
    public static void main(String[] args)
    {
        ConstantValue cst = ConstantValue.getValues();
        cst.ShowValues();
        System.out.println("______________________________________________");
        ConstantValue cst1 = ConstantValue.getValues();
        cst1.ShowValues();
        System.out.println("______________________________________________");
    }   
    
}
