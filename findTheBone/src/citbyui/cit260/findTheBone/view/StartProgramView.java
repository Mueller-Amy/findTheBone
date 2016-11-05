/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.GameControl;
import byui.cit260.findTheBone.model.Player;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class StartProgramView {
    private String promptMessage;
        public StartProgramView() {
            this.promptMessage = "\nPlease, enter your name:" ; //promptMessage ="Please, enter your name"
            this.displayBanner(); //display the banner when view is created
    }

    private void displayBanner() {
        System.out.println(
              "\n*************************************************************************************"
            + "\n* > Where's My Bone? <  is a text based role playing game.                          *"
            + "\n* You will assume the role of a dog who you get to name at the start of the game    *"
            + "\n* One day you wake up from a night of bad dreams. Cat DeVil, the mean cat from      *"
            + "\n* next door, had been hissing and clawing at you all night. Thirsty, you get up     *"
            + "\n* to get a drink of water. While you're at it you decide to take some time for a    *"
            + "\n* chew session on your favorite bone. That's when your real nightmare begins. The   *"
            + "\n* hole you dug for keeping that bone safe IS EMPTY You make a thorough search of    *"
            + "\n* the yard. No bone.                                                                *"
            + "\n* Being the great hound dog that you are, you are able to sniff up a few clues.     *"
            + "\n* First, you find paw prints leading in all directions throughout the yard. After   *"
            + "\n* some sniffing and deducing, you know these prints could only have been left by a  *"
            + "\n* cat-specifically Cat DeVil, the mean cat who lives next door.  You see a bird     *"
            + "\n* pecking at the ground a little ways off from your bone's hole. When you walk over *" 
            + "\n* you see what appear to be seeds scattered around on the ground. It's now time for *"
            + "\n* you to start your quest to find that bone!                                        *"
            + "\n* The game begins with a prompt to question the bird. When you do this, the bird    *"
            + "\n* tells you what he saw the night before. If you're quick with your wits, you'll    *"
            + "\n* find a clue hidden in his response. Throughout the game you'll be able to find    *"
            + "\n* clues to help you to know where to look next. If you go to the wrong place you'll *"
            + "\n* come up empty and have the option to either continue somewhere else arbitrarily,  *"
            + "\n* or retrace your steps to the last clue and try again.                             *"
            + "\n*                                                                                   *"
            + "\n* You have 24 hours to find your bone, or you will never see it again! Since this   *"
            + "\n* is your favorite bone, failure is not an option for you! As you proceed through   *"
            + "\n* the game you'll be told how much time it will take you to get to each search      *"
            + "\n* location. If you have to retrace your steps back to the last clue, that will cost *" 
            + "\n* you precious time and put you at risk of losing your bone forever.                *"
            + "\n*************************************************************************************"
        
        );
    }
    /**
     * display the start menu view
     */
    public void displayStartProgramView() {
        boolean done = false;
            //         do
            do {  
            //  prompt for and get playersName
               String playersName = this.getPlayersName();
               if (playersName.toUpperCase().equals("Q")) // user wants to Quit
               return;  //exit the game
               //do the requested action and display next view 
               done = this.doAction(playersName);
    }       
            while (!done);
    }

    private String getPlayersName() {
        /*Here is a generic template for an algorithm to prompt for
          and get input from and end user.
        *
    WHILE valid value is not be entered
        DISPLAY promptMessage 
        GET the value entered from keyboard
        Trim front and trailing blanks off of the name]

        IF the length of the value is blank THEN
                DISPLAY :"Invalid value: the value can not be blank"
                CONTINUE
        ENDIF

        BREAK

    ENDWHILE
    RETURN name
         
    */   
        
        
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

    private boolean doAction(String playersName) {
        /*Here is the algorithm for the doAction() function
        *
            doAction(playersName): boolean
            BEGIN
                if the length of the playersName < 2 then
                display “Invalid name: The name must be > 1 character”
                    return false
                    create Player with specified name
                    if unsuccessful then
                    display “Invalid name: The name is too short”
                    return false
                    display customized welcome message
                    display mainMenuView
                return true
                END
        */
        
        if (playersName.length()<2 ) {
            System.out.println("\ninvalid players name: "
                       + "The name must be greater than one character in length");
            return false;
                    }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating he player.");
            return false;
        }
        // display next view
        this.displayNextView(player);
                return true; // success !
        
    }
       private void displayNextView(Player player) {
        /*Here is the algorithm for the displayNextView() function
        *
        displayNextView(player): Player
        BEGIN
            Print a customized welcome message
            Create the MainMenuView
            display the MainMenuVIew
        END
        */
        
        // display a custom welcome message
        
         System.out.println("\n=========================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun !"
                          + "\n=========================================="
                         );
        
    // Create MainMenuView object
    MainMenuView mainMenuView = new MainMenuView();
                
    //Display the main menu view
    mainMenuView.displayMainMenuView();
    }
}       
    

   

