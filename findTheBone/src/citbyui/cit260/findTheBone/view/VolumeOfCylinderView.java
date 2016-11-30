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
import byui.cit260.findTheBone.control.CalculationsControl;
import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;


public class VolumeOfCylinderView {

    private String promptMessagesOne;
    private String promptMessagesTwo;
    private String winningBanner;

    public VolumeOfCylinderView() {
        this.promptMessagesOne = "\n"
            + "\n=========================================="
            + "\n| Let's Continue our Search                              |"
            + "\n=========================================="
            + "\n| Please Enter a Diameter"
            + "\n==========================================";
        this.promptMessagesTwo = "\n"
                + "\n=========================================="
                + "\n| Let's Continue our Search                              |"
                + "\n=========================================="
                + "\n| Please Enter a Height"
                + "\n==========================================";
        this.winningBanner = "\n"
                + "\n======================================="
                + "\n Congratulations!!!!!!!!!!!!!         |"
                + "\n======================================="
                + "\n You have solved the complex calculation"
                + "\n to find your bone.                   |"
                + "\n=======================================";
    }

    private double getDiameter() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        double diameter = 0;
        String response;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessagesOne);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
   
            continue;
            }
            try {
            diameter = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                
                System.out.println("\nYou must enter a valid number."
                                    + " Try again or enter Q to quit.");
            }

            if (diameter <= 0) {
                response = "Invalid Entry";
            } 
            else if (diameter < 3) {
                response = "Too Short";
            } 
            else if (diameter > 3) {
                response = "Too Long";
            } 
            else {
                response = "Just Right";
                valid = true;
            }
            System.out.println(response);
        }
        return diameter;
    }
    private double getHeight() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        double height = 0;
        String response;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessagesTwo);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            //Amy individual assignment
            try {
            height = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                
                System.out.println("\nYou must enter a valid number."
                        + "Try again or enter Q to quit.");
            }
            }

            if (height <= 0) {
                response = "Invalid Entry";
            } 
            else if (height < 8) {
                response = "Too Short";
            } 
            else if (height > 8) {
                response = "Too Long";
            } 
            else {
                response = "Just Right";
                valid = true;
            }
            System.out.println(response);
        }
        return height;
    }
           
    
   /** public void doAction() throws CalculationsControlException {
           double diameter = getDiameter();
           double height = getHeight();
           CalculationsControl calcControl = new CalculationsControl();

           double volume = calcControl.calcVolumeOfCylinder(diameter, height);
           System.out.println(winningBanner + "\n\nThe Volume of the cylinder: " + volume);
        }

    
**/










}
 
   
    
    
    
  