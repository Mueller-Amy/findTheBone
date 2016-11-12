/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import java.util.Scanner;

/**
 *
 * @author Amy Mueller
 */
public  abstract class View implements ViewInterface{
    protected String displayMessage;
    private String value;
  
    
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
      
        Scanner keyboard = new Scanner(System.in); // get infile for keyboar
        boolean valid = false; // initialize to not valid
        //String value = null; // value to be returned
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading adn trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
        }
        break; // end the loop
        
        }
        return value; // return the value entered
               
    }
}
    
