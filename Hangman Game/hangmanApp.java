/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Christopher King
 */
import javax.swing.*;
import java.util.*;
public class hangmanApp {
    
     public static void main(String[] args) {
        // TODO code application logic here
         Hangman MyHangman = new Hangman(); 
         MyHangman.setRepeat("true");
         
         while (MyHangman.getRepeat().equalsIgnoreCase("true")) {
   
        MyHangman.setGuess(JOptionPane.showInputDialog(null, "What is your first guess"));
        if (MyHangman.getGuess == Letters.equalsIgnoreCase(""))
        
        
        
        
    }
               
     }
}
