package NestedClass;

public class LocalClass 
{
    int a = 10;
    public void Show()       
    {
        int x = 20;
        class Inner
        {
            String name;
            public Inner(String name) 
            {
                this.name = name;
            }
            void Display()
            {
                System.out.println("Name : "+name);
            }
        }
        Inner i = new Inner("Akshay");
        i.Display();
        
        System.out.println("x = "+x);
    }
    public static void main(String[] args) 
    {
        LocalClass lc = new LocalClass();
        lc.Show();
        System.out.println("a = "+lc.a);
    }
    
}
