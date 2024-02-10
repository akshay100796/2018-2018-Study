package AnnonymousClass;

interface Test
{
    void Spicy();
    void Salty();
}
abstract public class PopCorn implements Test
{
    public static void main(String[] args)
    {
       Test t = new Test()
       {
           @Override
           public void Spicy()
           {
               System.out.println("Popcorn Test is 1 Spicy");
           }

           @Override
           public void Salty() 
           {
               System.out.println("Popcorn Test is 0 Salty");
           }
       };
       t.Salty();
       t.Spicy();
    }
}







/*
_______________________________________________________________________________

Source Code : Annonymous Innner Class taken from https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html



public class PopCorn 
{
    interface HelloWorld 
    {
        public void greet();
        public void greetSomeone(String someone);
    }
    public void sayHello()
    { 
        class EnglishGreeting implements HelloWorld 
        {
            String name = "Akshay";
            @Override
            public void greet() 
            {
                 greetSomeone("Akshay");
            }
            @Override
            public void greetSomeone(String someone) 
            {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();
        
        HelloWorld marathiGreeting = new HelloWorld() 
        {
            String name = "Rohit";
            public void greet()
            {
                greetSomeone("Kasa Ahes Mitra?");
            }
            public void greetSomeone(String someone) 
            {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld HindiGreeting = new HelloWorld() 
        {
            String name = "Shukla";
            public void greet()
            {
                greetSomeone("Shukla");
            }
            public void greetSomeone(String someone) 
            {
                name = someone;
                System.out.println("Hi..., " + name);
            }
        };
        englishGreeting.greet();
        marathiGreeting.greetSomeone("Army");
        HindiGreeting.greet();
    }

    public static void main(String... args) 
    {
        PopCorn myApp = new PopCorn();
        myApp.sayHello();
    }            
}


*/

















