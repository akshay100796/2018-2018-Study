package Clone;

class Cotton
{
    int i;
    public Cotton(int i) 
    {
        this.i = i;
    }
}
class Linen implements Cloneable
{
    Cotton c;
    int j;
    public Linen(Cotton c, int j) 
    {
        this.c = c;
        this.j = j;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Cotton c1 = new Cotton(8888);
        Linen d1 =  new Linen(c1, 9999);
        return d1;
    }
}
public class Deep
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cotton c = new Cotton(10);
        Linen d = new Linen(c, 11);
        
        System.out.println(d.j+"   "+d.c.i);
        
        Linen d1 = (Linen)d.clone();
        
        d1.j = 90;
        d1.c.i = 99;
        System.out.println(d1.j+"  "+d1.c.i);
    }
}









