
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package citbyui.cit260.findTheBone.view;

/**
 *
 * @author Keith Downing 
 
 
*/

package citbyui.cit260.findTheBone.view;

import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amy Mueller
 */
public class GameMenuView extends View{

    private Object game;
    private Object findTheBone;
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
                    + "\nA - Item - Jean Oliveira L10 Assignment"
                    + "\nE - Clues List - Temporary Location"
                    + "\nI - Inventory"
                    + "\nT - Time Used"
                    + "\nL - What is in Backpack"
                    + "\nC - Volume of a cylinder"
                    + "\nR - Àrea of a box"
                    + "\nB - Volume of a box"
                    + "\nP - Print Report"
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
       Scanner keyboard = new Scanner(System.iX); 
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
                case "A": // call to Jean individual L10 Assignment
                    this.displayItem();
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
                case "C": 
                    // volume of cylinder
                     this.volumeOfCylinder();
                     break;
                case "B": 
                    // Volume of Box
                    this.volumeOfBox();
                    break;
                case "R": 
                    // calcAreaOfBox
                    this.calcAreaOfBox();
                    break;
                case "P": // Print Report
                    this.printReport();
                    break;
                case "H": // Help
                    this.displayHelpMenu();
                    break;
                              
                default:
                    //System.out.println("\n*** Invalid selection *** Try Again");
                    ErrorView.display(this.getClass().getName(),//L12 TA
                        "\n*** Invalid selection *** Try Again");
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
        
        StringBuilder line;
        
        //Game game = FindTheBone.getCurrentGame();
        //Item[] item = item.getInventory();
        
        System.out.println("\n           LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                   ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        /*
        for (InventoryView item: inventory) {
            line = new StringBuilder("                                ");
            line.insert(0, item;
            line.insert(23, item.getDescription());
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
         try {
        VolumeOfCylinderView cylinderView = new VolumeOfCylinderView();
        cylinderView.doAction();
        } catch (CalculationsControlException me) {
           System.out.println(me.getMessage());
       }
        
        }
    

    private void volumeOfBox()  {
       try {
        VolumeOfBoxView volumeView = new VolumeOfBoxView();
        volumeView.getVolume();
       } catch (CalculationsControlException me) {
           System.out.println(me.getMessage());
       }
    }

    private void calcAreaOfBox() {
        // try {
         VolumeOfBoxView volumeofbox = new VolumeOfBoxView();
       // } catch (CalculationsControlException me) {
          // System.out.println(me.getMessage());
       //}
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    

    private void viewGamePlayMenu() {
        GamePlayView gamePlay = new GamePlayView();
        gamePlay.display();
    }

    private void displayMap() {
  //get locations from the current game
        /*Location[][] locations = LocationControl.currentLocation();
        
        //Display title
        System.out.println(
                 "\n--------------------"
                +"\n FIND THE BONE MAP  "
                +"\n--------------------");
        //Display row of column numbers
        System.out.println(" 0  1  2 ");
        //Display row divider
        System.out.println(" -------");
        
        //Display row numbers
        for (int i = 0; i < locations.length; i++) {
            //Display column divider
            System.out.println(i + 1 + "|");
            
            for (Location location : locations[i]) {
                
                //If location has been visited, display map symbol
                if (location.getVisited()) {
                    System.out.println(location.getScene());
                } else {
                    System.out.println("??");
                }
                //Display ending column divider 
                System.out.println("|");
            }
            //Display ending row divider
            System.out.println("\n -------");
        }
*/
    }

   
    private void displayItem() {
        ItemScreenView itemView = new ItemScreenView() {
            @Override
            public boolean doAction(String value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //itemView.display();
    }

    private void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
      
    
    }

   




