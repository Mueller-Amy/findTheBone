
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package citbyui.cit260.findTheBone.view;

/**
 *
 * @author Keith Downing 
 
 class GameMenuView {

    void displayMenu() {
        //Comment
        System.out.println("*** New Game Function Displayed. ***");
    }
    
}
*/
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.GameControl;
import byui.cit260.findTheBone.model.Player;
import java.util.Scanner;

/**
 *
 * @author Amy Mueller
 */
public class GameMenuView {
    //private String menu;
    private String promptMessage;
      public GameMenuView() {

   // public GameMenuView() {
        this.promptMessage = "\n"
                    + "\n=========================================="
                    + "\n| Game Menu                             |"
                    + "\n=========================================="
                    + "\nV - View Map"
                    + "\nI - List of Items"
                    + "\nT - Time Used"
                    + "\nL - What is in Backpack"
                    + "\nC - Area of a cylinder"
                    + "\nB - Area of a box"
                    + "\nH - Help"
                    + "\nX - Exit"
                    + "\n==========================================";
    }
    
    public void displayGameMenuView(){
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name

            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) // user wants to quit
                return; // exit the game
                
            // Do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
    }

    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in); 
       String value = "";
       boolean valid = false; 
       String selection = null; 
       
        //while a valid entry has not been retrieved
        while (!valid) { 

            System.out.println("\n" + this.promptMessage);
            
            //get the value entered from the keyboard
            value  = keyboard.nextLine(); 
            value = value.trim(); 
            
            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
        }
        break; 
        
        }
        return value; // return the selection 
               
    }
    

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            switch (choice) {
                case "V": //view map
                    this.viewMap();
                    break;

                case "I": //List of items
                    this.listOfItems();
                    break;

                case "T": //Time Used
                    this.timeUsed();
                    break;

                case "L": // What is in Backpack
                    this.inBackpack();
                    break;
                case "C": // area of cylinder
                    this.areaOfCylinder();
                    break;
                case "B": // Area of Box
                    this.areaOfBox();
                    break;
                case "H": // Help
                    this.help();
                    break;
                case "X": // Exit
                    this.exit();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
       
}

    private void viewMap() {
        System.out.println("*** viewMap function called ***"); 
    
    }

    private void listOfItems() {
        System.out.println("*** listOfItems function called ***"); 
    }

    private void timeUsed() {
        System.out.println("*** timeUsed function called ***"); 
    }

    private void inBackpack() {
        System.out.println("*** inBackpack function called ***"); 
    
    }

    private void areaOfCylinder() {
        System.out.println("*** areaOf Cylinder function called ***"); 
    }

    private void areaOfBox() {
        System.out.println("*** areaOfBox function called ***");    
    }

    private void help() {
        System.out.println("*** help function called ***");     
    }

    private void exit() {
        System.out.println("*** exit function called ***");    
    }
}


