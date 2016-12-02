/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.GameControl;
import findthebone.FindTheBone;
//import java.util.Scanner;

/**
 *
 * @author Keith Downing
 */
public class MainMenuView extends View {
    
  //private String menu;
  //  private String promptMessage;

  //  public MainMenuView() {
  //      this.promptMessage = "\n"
    public MainMenuView(){
             super(   "\n=========================================="
                    + "\n|                 Main Menu              |"
                    + "\n=========================================="
                    + "\nN - Start New Game"
                    + "\nL - Load Saved Game"
                    + "\nS - Save Game"
                    + "\nH - Help"
                    + "\nA - Action Menu - (it's a temporary place)"
                    + "\nX - Exit the Game"
                    + "\n==========================================");
    }
    
 /*   public void displayMainMenuView(){
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; // Quit the game
                
            // Do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
   }
 */

 /*  private String getMenuOption() {
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
    public boolean doAction(String choice)  {
        choice = choice.toUpperCase(); // convert choice to uppercase
            
            switch (choice) {
                case "N": //Creates a new game
                    this.startNewGame();
                    break;
                case "L": //Loads existing game
                    this.startExistingGame();
                    break;
                case "S": // Saves game
                    this.saveGame();
                    break;
                case"H": //Displays Help Menu
                    this.displayHelpMenu();
                    break;
                case"A": //Displays Action Menu
                    this.displayActionMenu();
                    break;
                default:
                     ErrorView.display(this.getClass().getName(),//L12 TA
                        "\n*** Invalid selection *** Try Again");//L12 TA
                    //this.console.println("\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
    }

    private void startNewGame(){
        
    
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        // create a new game
    GameControl.createNewGame(FindTheBone.getPlayer());
        
    }
    
       
    

    /**
     *
     */
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    private void displayActionMenu() {
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

    
}
