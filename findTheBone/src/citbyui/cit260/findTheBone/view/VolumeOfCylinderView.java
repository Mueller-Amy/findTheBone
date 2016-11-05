 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 *
 * @author Keith Downing
 */
package citbyui.cit260.findTheBone.view;
import java.util.Scanner;
public class VolumeOfCylinderView {
        
    String promptMessages = "\n"
                    + "\n=========================================="
                    + "\n| Let's Continue our Search                              |"
                    + "\n=========================================="
                    + "\n| Please Enter a Diameter"
                    + "\n==========================================";
    String promptMessagesTwo = "\n"
                    + "\n=========================================="
                    + "\n| Let's Continue our Search                              |"
                    + "\n=========================================="
                    + "\n| Please Enter a Height"
                    + "\n==========================================";
    
    
    
    
    
    
    
    
    
    
    
    
    private String getInput() {
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessages);
            
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
    
    
    
    
    
    
    
    
   // private boolean doAction() {
   
    //}
    
}
