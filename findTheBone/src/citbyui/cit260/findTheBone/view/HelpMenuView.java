/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

//import java.util.Scanner;

/**
 *
 * @author Keith Downing
 */
public class HelpMenuView extends View {
    
    //private String menu;
   // private String promptMessage;
    //private Object helpMenu;

    public HelpMenuView() {
        super( "\n"
                    + "\n=========================================="
                    + "\n| Help Menu                              |"
                    + "\n=========================================="
                    + "\nN - Start New Game"
                    + "\nL - Load Saved Game"
                    + "\nS - Save Game"
                    + "\nW - How to move"
                    + "\nL - Look"
                    + "\nC - Search"
                    + "\nD - Dig"
                    + "\nQ - Question" 
                    + "\nI - Inventory"
                    + "\nG - Give an item from your backpack to the character in the area."
                    + "\nM - Map"
                    + "\nX - Exit"
                    + "\n==========================================");
    }
    /*public void displayHelpMenuView(){
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) //user wants to quit
                return; // Exit game
                
            // Do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
    }
*/
    

    /*private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
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
    */

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to uppercase
            
            switch (choice) {
                case "N": //Creates a new game
                    this.startNewGameOne();
                    break;
                case "L": //Loads existing game
                    this.startExistingGameOne();
                    break;
                case "S": // Saves game
                    this.saveGameOne();
                    break;
                case "W": //Displays How to move
                    this.howToMove();
                    break;
                case "E": //Look at surroundings
                    this.howToLook();
                    break;
                case "C": //Look at surroundings
                    this.howToSearch();
                    break;
                case "D": //How to dig in surroundings
                    this.howToDig();
                    break;
                case "Q": //Search surroundings
                    this.howToQuestion();
                    break;
                case "I": //Inventory
                    this.howToInventory();
                    break;
                case "G": //Give items
                    this.howToGive();
                    break; 
                case "M": //Displays map
                    this.howToMap();
                    break; 
                default:
                    // L12 System.out.println("\n*** Invalid selection *** Try Again");
                    this.console.println("\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
    }
    private void startNewGameOne(){
        // L12 System.out.println("*** New Game ***");
        this.console.println("*** New Game ***");
    }
    private void startExistingGameOne() {
        // L12 System.out.println("*** Load Existing game ***");
        this.console.println("*** Load Existing game ***");
    }
    private void saveGameOne() {
        // L12 System.out.println("*** Saved Game Loads ***");
        this.console.println("*** Saved Game Loads ***");
    }
    private void howToMove() {
        // L12 System.out.println("*** User Must enter a Alpha+Numeric to move to a new location. (Example A5)***");
        this.console.println("*** User Must enter a Alpha+Numeric to move to a new location. (Example A5)***");
    }
    private void howToLook() {
        // L12 System.out.println("*** Provides details about the surrounding area. ***");
        this.console.println("*** Provides details about the surrounding area. ***");
    }
    private void howToSearch() {
        // L12 System.out.println("*** Prompts the user to search around the area. ***");
        this.console.println("*** Prompts the user to search around the area. ***");
    }
    private void howToDig() {
        // L12 System.out.println("*** Dig around. Search is above ground items. ***");
        this.console.println("*** Dig around. Search is above ground items. ***");
    }
    private void howToQuestion() {
        // L12 System.out.println("*** Allows the users to question a person in the area. ***");
        this.console.println("*** Allows the users to question a person in the area. ***");
    }
    private void howToInventory() {
        // L12 System.out.println("*** Display Inventory of Items. ***");
        this.console.println("*** Display Inventory of Items. ***");
    }
    private void howToGive() {
        // L12 System.out.println("*** Give an item from your backpack to the character in the area. ***");
        this.console.println("*** Give an item from your backpack to the character in the area. ***");
    }
    private void howToMap() {
        // L12 System.out.println("*** Display the map. ***");
        this.console.println("*** Display the map. ***");
    }



   
    }

