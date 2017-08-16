/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconvertapp;

import java.util.Scanner;

/**
 *
 * @author Dynamic-Gravity
 */
public class MyConvertApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aliasing nl to new line
        String nl = System.getProperty("line.separator");
    
        // Greet the user
        System.out.println("Welcome to my Imperial/Metric Convertor!");
        
        boolean loop = true;
    
        Weight weightObject = new Weight();
        Length lenghObject = new Length();
         
        // Start the main loop
        while (loop){
            // Print menu
            System.out.println(nl+"Menu"+nl+"1) Imperial"+nl+"2) Metric"+nl+"3) Exit");
            System.out.print("~> ");
            
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
                
            switch(Integer.parseInt(s)){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    System.out.println("Exiting...");
                    loop = false;
                    break;
                }
                default:{
                    System.out.println("Invalid option");
                }
            }
        }
    }    
}
