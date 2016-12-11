/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import findthebone.FindTheBone;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class TimeLocationStatusView extends View{

    private String currentLoc;
    private Double timeRemaining;

 
    public TimeLocationStatusView() {
       
    }

    private void promptEnterKey(){
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
}


    public void display(double timeRemaining, String currentLoc) {
        // this.currentLoc = FindTheBone.getCurrentGame().getCurrentLocation().toString();
        this.timeRemaining = FindTheBone.getCurrentGame().getGameTime().getTimeRemaining();
        
        System.out.println( "\n"
                    + "\n=========================================="
                    + "\n|          Time Moving Status            |"
                    + "\n=========================================="
                    + "\n                                          "
                    + "\n           Your time ramainig is" 
                    + "\n           " + timeRemaining
                    + "\n"
                    + "\n        And your current location is"
                    + "\n"            + currentLoc
                    + "\n"
                    + "\n=========================================="
                    + "\n"
                    + "\n          Press ENTER key to go back"
        );
        
        promptEnterKey();// a pause to exit when user press the keyboard
    }
 @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to uppercase
         promptEnterKey();// a pause to exit when user press the keyboard
          return false;
    }
    
    }

    

