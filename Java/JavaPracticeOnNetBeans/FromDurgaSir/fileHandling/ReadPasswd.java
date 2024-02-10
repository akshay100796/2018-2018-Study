package Basic_File_Operation;
import java.io.Console;
public class ReadPasswd {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            System.out.print("Enter Password : ");
            char[] ch = c.readPassword();
            String psswd = String.valueOf(ch);
            System.out.println("Your passwd is : "+psswd);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }    
}

/** ---------------> ERROR <---------------
 * 
 * You will get Runtime Error Here, because This Programm
 * applicable onlya at Console, not here
 * 
 * 
 * This code does not show password which we typed
 * 
 */