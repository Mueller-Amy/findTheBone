/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.GameControl;
import byui.cit260.findTheBone.model.Game;
import citbyui.cit260.findTheBone.exceptions.GameControlException;
import citbyui.cit260.findTheBone.exceptions.MapControlException;
import findthebone.FindTheBone;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Scanner;

/**
 *
 * @author Keith Downing
 */
public class MainMenuView extends View {

    public MainMenuView(){
             super(   "\n=========================================="
                    + "\n|                 Main Menu              |"
                    + "\n=========================================="
                    + "\nN - Start New Game"
                    + "\nG - Get and Start Saved Game"
                    + "\nS - Save Game"
                    + "\nH - Help"
                    + "\nX - Exit the Game"
                    + "\n==========================================");
    }
    
     
    @Override
    public boolean doAction(String choice){
        try {
            choice = choice.toUpperCase(); // convert choice to uppercase
            
            switch (choice) {
                case "N": //Creates a new game
                    this.startNewGame();
                    break;
                case "G": //get saved game and start
                    this.getSavedGame();
                    break;
                case "S": // Saves game
                    this.saveGame();
                    break;
                case"H": //Displays Help Menu
                    this.displayHelpMenu();
                    break;
                default:
                    ErrorView.display(this.getClass().getName(),//L12 TA
                            "\n*** Invalid selection *** Try Again");//L12 TA
                    //this.console.println("\n*** Invalid selection *** Try Again");
                    break;
                
            }
           
        } catch (GameControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
    }

    private void startNewGame() {
        
        try {
            GameControl.createNewGame(FindTheBone.getPlayer());
        } catch (MapControlException | GameControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        // create a new game
       
        
    }
    

    //L12 TA
    private void saveGame() {
        //prompt for and get the name of the file to save game in
        this.console.println("\n\nEnter the file path for file where the game"
                              + "is to be saved");
        String filePath=this.getInput();
        
        try {
                //save the game to the specified file
                GameControl.saveGame(FindTheBone.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
            }
   
   
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
   
    private void getSavedGame() throws GameControlException {
         System.out.println("\n\nEnter the file path for file where the game " + "was saved last.");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
       }
      
}
