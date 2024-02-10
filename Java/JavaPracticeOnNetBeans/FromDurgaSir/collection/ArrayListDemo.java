
package CollectionByDurgaSir;

import java.util.ArrayList;
public class ArrayListDemo          //without objects
{
    public static void main(String[] args) 
    {
        ArrayList a = new ArrayList();
        System.out.println("Size :  "+a.size());
        a.add("A");
        a.add(1);
        a.add(3.14);
        a.add(3.14f);
        a.add(null);
        a.add('a');
        a.add(3, "Akshay");
        System.out.println(a);
        //a.clear();          //will remove all element 
        System.out.println(a);
        System.out.println("getting 4th element :"+a.get(4));
        System.out.println("Is EmpT : "+a.isEmpty());
        System.out.println("remove A : "+a.remove("A"));
        System.out.println(a);
    }
}
