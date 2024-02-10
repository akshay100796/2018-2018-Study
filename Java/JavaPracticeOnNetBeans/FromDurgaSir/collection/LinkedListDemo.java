
package CollectionByDurgaSir;
import java.util.LinkedList;
public class LinkedListDemo 
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add("A");
        l.add("K");
        l.add("S");
        l.add("H");
        l.add("A");
        l.add("Y");
        l.add(3.14);
        System.out.println(l);      //[A, K, S, H, A, Y, 3.14]
        l.addFirst("Akshay");
        l.addLast("Pawar");
        System.out.println(l);      //[Akshay, A, K, S, H, A, Y, 3.14, Pawar]
        System.out.println(l.getFirst());       //Akshay
        System.out.println(l.getLast());        //Pawar
        System.out.println(l.indexOf("A"));     //1
        System.out.println(l.peek());           //Akshay
        System.out.println(l.pollFirst());      //Akshay
        System.out.println(l.pollLast());          //Pawar
        System.out.println(l.remove());             //A
        System.out.println(l);                  //[K, S, H, A, Y, 3.14]
        
        
        
    }
}
