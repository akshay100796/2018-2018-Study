
package Clone;

public class ArrayCloning 
{
    public static void main(String[] args) 
    {
        String name[] = {"Akshay","Amit","Bagul","Chetan","Deepak","Faran","Lion","Max","Sam","Viraj","Zeta"};
        
        String name1[] = name.clone();
        System.out.println(name1==name.clone());
        for(int i=0;i<name1.length;i++)
            System.out.println(name1[i]);
    }
}














