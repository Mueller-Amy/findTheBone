
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
//import java.util.Scanner;

/**
 *
 * @author Amy Mueller
 */
public class GameMenuView extends View{
    //private String menu;
    //private String promptMessage;
      public GameMenuView() {

   // public GameMenuView() {
        super( "\n"
                    + "\n=========================================="
                    + "\n|           Game Menu                    |"
                    + "\n=========================================="
                    + "\nG - Game Play Menu"
                    + "\nV - View Map"
                    + "\nI - Inventory"
                    + "\nT - Time Used"
                    + "\nL - What is in Backpack"
                    + "\nC - Volume of a cylinder"
                    + "\nB - Area of a box"
                    + "\nH - Help"
                    + "\nX - Exit"
                    + "\n==========================================");
    }
    
   /* public void displayGameMenuView(){
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
*/

   /* private String getMenuOption() {
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
    
*/
      @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            
        switch (choice) {
                case "G": //view map
                    this.viewGamePlayMenu();
                    break;
                case "V": //view map
                    this.viewMap();
                    break;

                case "I": //List of items
                    this.inventory();
                    break;

                case "T": //Time Used
                    this.timeUsed();
                    break;

                case "L": // What is in Backpack
                    this.inBackpack();
                    break;
                case "C": // volume of cylinder
                    this.volumeOfCylinder();
                    break;
                case "B": // Volume of Box
                    this.volumeOfBox();
                    break;
                case "H": // Help
                    this.displayHelpMenu();
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

    private void inventory() {
        InventoryView inventory = new InventoryView();
        inventory.display();
    }

    private void timeUsed() {
        System.out.println("*** timeUsed function called ***"); 
    }

    private void inBackpack() {
        System.out.println("*** inBackpack function called ***"); 
    
    }

    private void volumeOfCylinder() {
        System.out.println("*** volumeOf Cylinder function called ***"); 
    }

    private void volumeOfBox() {
        VolumeOfBoxView volumeView = new VolumeOfBoxView();
        volumeView.getVolume();
    }

    

    private void exit() {
        System.out.println("*** exit function called ***");    
    }

    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewGamePlayMenu() {
        GamePlayView gamePlay = new GamePlayView();
        gamePlay.display();
    }

}


