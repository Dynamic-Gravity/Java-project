/**
 * MyConvertApp
 * Copyright (C) 2017  Dynamic-Gravity
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
