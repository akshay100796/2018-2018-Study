/**
 * 
 * Case I  -  if parent class implements Serializable interface then we can serialized child class object 
 * Case II -  we can implement Child Class as Serializable interface which is Inherit from Parent class
 *              even though Parent Class doesn't implement Serializable.
 *          Ex.
 *          Dog Class can implement Serializable even though Animal Class Does not Implement Serializable 
 * 
 * Case III -  if any variable inherit from Non-serializable parent class then after serialization 
 *             JVM ignore original value of non serializable parent class variable and store default value of 
 *              non-serializable parent class
 * 
 * 
 */


/*
package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable
{
    int a = 15;
}
class Dog extends Animal
{
    int d = 20;  
}
public class SerializeInheritance 
{
    public static void main(String[] args) throws Exception
    {
        Dog d1 = new Dog();
        System.out.println(d1.a+"..."+d1.d);
        FileOutputStream fout = new FileOutputStream("AniXtend.obj");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(d1);
        
        FileInputStream fin = new FileInputStream("AniXtend.obj");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Dog d2 = (Dog) oin.readObject();
        System.out.println(d2.a+"......."+d2.d);
        
    }
}
____________________________________________________________________________
*/

package Serialization_ByDurgaSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal
{
    int a = 1;

    public Animal() {
    System.out.println("Animal Class");
    }
}
class Dog extends Animal implements Serializable
{
    int d = 2;
    public Dog() {
    System.out.println("Dog Class");
    }
    
}

public class SerializeInheritance 
{
    public static void main(String[] args) throws Exception
    {
        Dog d1 = new Dog();
        System.out.println("Value B4 Assigning = "+d1.a+"..."+d1.d);
        d1.a = 111;
        d1.d = 222;
        System.out.println("Value After Assigning = "+d1.a+"..."+d1.d);
        FileOutputStream fout = new FileOutputStream("AniXtend.obj");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(d1);
        
        FileInputStream fin = new FileInputStream("AniXtend.obj");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Dog d2 = (Dog) oin.readObject();
        System.out.println("Values from File = "+d2.a+"..."+d2.d);
    }
}
