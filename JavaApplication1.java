/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author enescanpolat
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("sdfsa");
         String input;
        
        input = JOptionPane.showInputDialog("Please Enter a single character");
    
            char c = input.charAt(0);
    
        // while(!Character.isLetterOrDigit(c)){
          //   JOptionPane.showInputDialog("Please Enter a single character again!!!");
         //}   
            
    if(Character.isDigit(c)){
        System.out.println("Digit");
    }
    
    if(Character.isAlphabetic(c)){
        System.out.println("Alphabetic");
    }
    
    else {
        System.out.println("Not a letter or digit");
    }
    
    
    
    
          
        }
    }
    

