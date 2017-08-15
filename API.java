import java.io.*;
import java.util.Scanner;
import Weight.*;
import Length.*;
public class API {
    public static void main (String[] args){
        // aliasing nl to new line
        String nl = System.getProperty("line.separator");
    
        // Greet the user
        System.out.println("Welcome to my Imperial/Metric Convertor!");
        
        boolean loop = true;
    
        // Start the main loop
        while (loop){
            // Print menu
            System.out.println("Menu" + nl + "1) Imperial" + nl + "2) Metric" + "3) Exit" + nl + "~> ");
            
            Scanner scan = new Scanner(System.in);
            
            weightObject = new  Weight();
            lenghObject = new Length();
            
            
            String s = scan.next();
            
            switch(Integer.parseInt(s)){
                case 1 : //stuff
                    break;
                case 2 : //stuff
                    break;
                case 3 : //stuff
                    break;
                default: //stuff
            }
            scan.close();
        }
    }
}