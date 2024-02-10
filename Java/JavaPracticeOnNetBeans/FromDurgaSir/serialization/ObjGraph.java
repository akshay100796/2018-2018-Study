
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable
{
    Person p = new Person();
}

class Person implements Serializable
{
    Employee e = new Employee();
}
class Employee implements Serializable
{
    int i = 100;
}
public class ObjGraph 
{
    public static void main(String[] args) throws Exception
    {
        Human h = new Human();
        FileOutputStream fout = new FileOutputStream("ObjFile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(h);
        
        FileInputStream fin = new FileInputStream("ObjFile.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Human h1 = (Human)oin.readObject();
        System.out.println("h1 = "+h1.p.e.i);
    }
}
