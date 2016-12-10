/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import findthebone.FindTheBone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**********
 ******
 * @author Amy Mueller
 */
public  abstract class View implements ViewInterface{
    protected String displayMessage;
    private String value;
  
    //L12 TA
    private String message;
    protected final BufferedReader keyboard =FindTheBone.getInFile();
    protected final PrintWriter console =FindTheBone.getOutFile();
    
    
    
    public View() {
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
            //         do
            do {  
            //  prompt for and get playersName
               String playersName = this.getInput();
               if (value.toUpperCase().equals("X")) // user wants to Exit
               return;  //exit the game
               //do the requested action and display next view 
               done = this.doAction(value);
    }       
            while (!done);
    }
    
    @Override 
    public String getInput() {
      
        //L12 TA deleted line -->        Scanner keyboard = new Scanner(System.iX); // get infile for keyboar
        boolean valid = false; // initialize to not valid
        
        
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); // get next line typed on keyboard ----- L12 TA changed
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading Input: " + ex.getMessage());
            }
            value = value.trim(); // trim off leading adn trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),//L12 TA
                        "\nInvalid value: value can not be blank");//L12 TA
                continue;
        }
        break; // end the loop
        
        }
        return value; // return the value entered
               
    }
}
    
