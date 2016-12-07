/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

//import java.util.Scanner;

import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jean
 */
public class ActionMenuView extends View {
    //private String menu;
    //private String promptMessage = this.promptMessage = "\nPlease, enter your option:" ; //promptMessage ="Please, enter your name"
    
    public ActionMenuView() {
           super("\n"
                     + "\n-------------------------------------"
                     + "\n|            Action Menu              |"
                     + "\n-------------------------------------"
                     + "\nL - Look - details about the surrounding area"
                     + "\nS - Search - search around the area"
                     + "\nD - Dig Around - search ground items."
                     + "\nA - Asking - ask a question to a person in the area"
                     + "\nI - Inventory - display items and clues"
                     + "\nG - Give an item from your backpack to the character in the area"
                     + "\nM - Display the Map"
                     + "\nC - Complex Calculation - Diagonal Rectangle."
                     + "\nX - Exit"
                     + "\n-------------------------------------");
       }
    
    /*public void displayActionMenuView() {
        
        System.ouX.println("\n" + this.menu);
        
        boolean done = false; // set flag to not done
        do {
            
             // prompt for and get players name
             String menuOption = this.getMenuOption();
             if (menuOption.toUpperCase().equals("E")) // user wants to exit menu
                 return;  // Exit to Main Menu
             
             // do the requested action and display the next view
             done = this.doAction(menuOption);
             System.ouX.println("\n" + this.menu);
        } while (!done);
        }
    */
    
   /* private String getMenuOption() {
        
        
        Scanner keyboard = new Scanner(System.iX); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            
            System.ouX.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading adn trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.ouX.println("\n" + this.menu);
                
                System.ouX.println("\nInvalid value: value can not be blank");
                continue;
        }
        break; // end the loop
        
        }
        return value; // return the value entered
               
    }
    */
    @Override
    public boolean doAction(String choice) {
        
       
        
        choice = choice.toUpperCase(); // convert choice to upper case
        switch (choice) {
            case "L": // Look. Provides details about the surrounding area.
                this.actionLookAround();
                break;
            case "S": // Search. Prompts the user to search around the area.
                this.actionSearchAround();
                break;
            case "D": // Dig. Dig around. Search is above ground items.
                this.actionDigAround();
                break; 
            case "A": // Question - Allows the users to question a person in the area.
                this.actionDoQuestion();
                break;  
            case "I": // Inventory - Display Inventory of Items\Clues
                this.actionDisplayInventory();
                break; 
            case "G": // Give an item from your backpack to the character in the area.
                this.actionGiveItem();
                break; 
            case "M": // Map - Display the map.
                this.actionDisplayMap();
                break;  
            case "C": {
            try {
                // Complex Calculation - Diagonal Rectangle
                this.actionComplexCalculationDiagonal();
            } catch (CalculationsControlException me) {
                ErrorView.display(this.getClass().getName(),me.getMessage());
            }
        }
                break;          

            default:
                 ErrorView.display(this.getClass().getName(),//L12 TA
                            "\n*** Invalid selection *** Try Again");
                 //System.ouX.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
        
    }

    private void actionLookAround() {
         this.console.println("*** actionLookAround function called ***");
    }

    private void actionSearchAround() {
         this.console.println("*** actionSearchAround function called ***");
    }

    private void actionDigAround() {
         this.console.println("*** actionDigAround function called ***");
    }

    private void actionDoQuestion() {
         this.console.println("*** actionDoQuestion function called ***");
    }

    private void actionDisplayInventory() {
         this.console.println("*** actionDisplayInventory function called ***");
    }

    private void actionGiveItem() {
         this.console.println("*** actionGiveItem function called ***");
    }

    private void actionDisplayMap() {
         this.console.println("*** actionDisplayMap function called ***");
    }

    private void actionComplexCalculationDiagonal() throws CalculationsControlException {
               
       DiagonalCalculationView rectangleDiagonal = new DiagonalCalculationView();
                rectangleDiagonal.displayRectangleDiagonal();
    
    }


}

