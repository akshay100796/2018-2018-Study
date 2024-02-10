package generalOld.src.ExeptionByDurgaSir;

public class ThrowsKeyword extends RuntimeException
{
    public static void show() throws Exception
    {
        More();
    }
    public  static  void More() throws Exception
    {
        AnyMore();
    }
    public static void AnyMore() throws Exception
    {
        System.out.println(10/0);
    }
    public static void main(String[] args) throws Exception
    {
        show();
    }
}
