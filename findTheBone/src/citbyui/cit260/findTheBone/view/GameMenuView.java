
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
import byui.cit260.findTheBone.model.Game;
import byui.cit260.findTheBone.model.Item;
import byui.cit260.findTheBone.model.ItemsWithin;
import byui.cit260.findTheBone.model.Player;
import findthebone.FindTheBone;
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
                    + "\nE - Clues List - Temporary Location"
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
                    this.displayMap();
                    break;
                case "E": //clues view temporary
                    this.viewClue();
                    break;

                case "I": //view List of items
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

    
    private void viewClue() {
        CluesView clue = new CluesView();
        clue.display();
    }

    private void inventory() {
        
        InventoryView inventory = new InventoryView();
        inventory.display();
        /*
        StringBuilder line;
        
        Game game = FindTheBone.getCurrentGame();
        Item[] item = game.getInventory();
        
        System.out.println("\n           LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                   ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        for (InventoryItem item: inventory) {
            line = new StringBuilder("                                ");
            line.insert(0, "Twig");
            line.insert(23, "1");
            line.insert(33, "0.0");
            
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Pebble");
            line.insert(23, "1");
            line.insert(33, "0.0");
        }
            
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Box");
            line.insert(23, "1");
            line.insert(33, "0.0");
        }
        
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Cylinder");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Paper");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Ball");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Fish");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Cat Hair");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Lost Cat Bell");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Cat Collar");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Cat Name Tag");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Business Card");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Treat");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Duck Feather");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        for (InventoryItem item: inventory){
            line = new StringBuilder("                                 ");
            line.insert(1, "Peanuts");
            line.insert(22, "1");
            line.insert(33, "0.0");
        }
        
        //Display the line
        System.out.println(line.toString());
        }
        */
    }

    private void timeUsed() {
        System.out.println("*** timeUsed function called ***"); 
    }

    private void inBackpack() {
        System.out.println("*** inBackpack function called ***"); 
    
    }

    private void volumeOfCylinder() {
        VolumeOfCylinderView cylinderView = new VolumeOfCylinderView();
        cylinderView.doAction();
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

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}


