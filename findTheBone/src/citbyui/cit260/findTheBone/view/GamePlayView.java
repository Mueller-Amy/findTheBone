/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jean Oliveira
 */
public class GamePlayView extends View {
     //private String menu;
     //  private String promptMessage;
     //private String currentLocation = "Zoo - Tiger Lodge"; //starting variable to test
    
    public GamePlayView(){          // ahead we replace Time, Currentt location and Details with variable value 
             super(   "\n==============================================================="
                    + "\n|                     Game Play Screen                        |"
                    + "\n==============================================================="
                    + "\n                      Time = 10:30 PM                          " 
                    + "\n         Current location -->Zoo - Tiger Lodge                 " 
                    + "\n         Location Details -->  You look around.                "
                    + "\n          There are a lot of wild cats in this part of town... "
                    + "\n---------------------------------------------------------------"
                    + "\n                    What do you want to do?                    "
                    + "\n==============================================================="
                    + "\n                 (A)Actions - (M)Map - (X)Exit                 "
                    + "\n===============================================================");
    }
    
 /*   public void displayGamePlayMenuView(){
        boolean done = false; // set flag to not done
        do {
            // prompt for and get user choice
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) //user wants to quit
                return; // Quit the GamePlayMenu
                
            // Do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
   }
 */

 /*  private String getMenuOption() {
       Scanner keyboard = new Scanner(System.iX); // get infile for keyboard
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
        try {
            choice = choice.toUpperCase(); // convert choice to uppercase
            
            switch (choice) {
                case"A": //Displays Action Menu
                    this.displayActionMenu();
                    break;
                case "M": //display Map Menu
                    this.displayMapMenu();
                    break;
                default:
                    //System.out.println("\n*** Invalid selection *** Try Again");
                     ErrorView.display(this.getClass().getName(),//L12 TA
                        "\n*** Invalid selection *** Try Again");//L12 TA
                    break;
                
            }
           
        } catch (CalculationsControlException ex) {
            Logger.getLogger(GamePlayView.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
    }

   
    private void displayActionMenu() throws CalculationsControlException{
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

    private void displayMapMenu() {
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }

    
}