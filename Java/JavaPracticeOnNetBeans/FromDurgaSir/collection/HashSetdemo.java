
package CollectionByDurgaSir;

import java.util.HashSet;

public class HashSetdemo {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++) {
                System.out.println(s.add(i));
            }
            
        }
        System.out.println(s);
    }
}
