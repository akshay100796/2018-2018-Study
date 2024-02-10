/**
 * Source programm : Deep Cloning from Single Class 
 */
package Clone;

public class Single implements Cloneable                                        //  implementation
{
    int i=10;
    public static void main(String[] args) throws CloneNotSupportedException    //Exeption    
    {
        Single s = new Single();
        System.out.println("s.i  =  "+s.i);
        Single s1 = (Single)s.clone();                                          //Cloning
        s1.i = 88;
        System.out.println("s1.i =  "+s1.i);
    }
    
}
