
package CollectionByDurgaSir;

// vector ==>  Enumarator

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


// ArrayList ==> iterator

// List ==> Listiterator  

/*
public class IteratorDemo               //vector
{
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.add(i);           
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer)e.nextElement();
            System.out.println(i);
        }       
    }
}

________________________________________________________________________________
public class IteratorDemo                   //ArrayList
{
    public static void main(String[] args) 
    {
        ArrayList l = new ArrayList();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            Integer i = (int)it.next();
            System.out.println(i);
        }
        
    }
}
________________________________________________________________________________
*/
public class IteratorDemo
{
    public static void main(String[] args) 
    {
        ArrayList l = new ArrayList();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        ListIterator it = l.listIterator();
        while(it.hasNext())
        {
            Integer i = (int)it.next();
            System.out.println(i);
        }
        
    }
}

