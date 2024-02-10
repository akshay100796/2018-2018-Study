package ObjectClass;

public class Equals 
{
    /*
    	public static void main(String[] args)
	{
		Prog p = new Prog();
		Prog q = new Prog();
		System.out.println(p.equals(q));
		p=q;
		System.out.println(p.equals(q));
		Integer a = 10;
		Integer b = 10;
		System.out.println(a.equals(b));
		
		
	}
     */
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
        Equals e = new Equals();
        Equals s = new Equals();
        System.out.println("Hash Code s : "+s.hashCode());
        System.out.println("Hash Code e : "+e.hashCode());
        if(e.equals(s))
        {
            System.out.println("Same Object");
        }
        else
        {
            System.out.println("Diffrent Object");
        }
        
        System.out.println("\n\n\n");
        e=s;
        System.out.println("Hash Code s : "+s.hashCode());
        System.out.println("Hash Code e : "+e.hashCode());
        
        if(e.equals(s))
        {
            System.out.println("Same Object");
        }
        else
        {
            System.out.println("Diffrent Object");
        }
        
    }
}
