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
public class Hangman {
    
    //varaibles
    private  String Letters;
    private  String Guess;
    private  String secertWord;
    private  String Displaymessage;
    private  String Repeat;
    
    //declaring variables
    public Hangman(){
        Guess = "";
        secertWord = "Hello World";
        Displaymessage = "";
        Letters = "h, e, l, o, w, r, d";
        Repeat = "true"; 
    }
    
    //setters and getters

    public void setLetters(String Letters) {
        this.Letters = Letters;
    }

    public void setGuess(String Guess) {
        this.Guess = Guess;
    }

    public void setSecertWord(String secertWord) {
        this.secertWord = secertWord;
    }

    public void setDisplaymessage(String Displaymessage) {
        this.Displaymessage = Displaymessage;
    }

    public void setRepeat(String repeat) {
        this.Repeat = repeat;
    }

    public String getLetters() {
        return Letters;
    }

    public String getGuess() {
        return Guess;
    }

    public String getSecertWord() {
        return secertWord;
    }

    public String getDisplaymessage() {
        return Displaymessage;
    }

    public String getRepeat() {
        return Repeat;
    }
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
