
import java.util.Vector;


public class VectorOperation 
{
    public static void main(String[] args) 
    { 
        Vector v = new Vector(5);
        v.add("C");
        v.add("C++");
        v.add("Java");
        v.add("C#");
        v.add("PHP");
        v.add(".NET");
        v.add("Android");
        v.add("MySQL");
        v.add("JavaScript");
        v.add("Fortan");
        v.add("GO");
        v.add("Python");
        v.add("XML");
        v.add("JSON");
        v.add("Ruby");
        v.add("HTML");
        v.add("CSS");
        
        v.insertElementAt("Akshay", 3);
        System.out.println(v);
    }
}
