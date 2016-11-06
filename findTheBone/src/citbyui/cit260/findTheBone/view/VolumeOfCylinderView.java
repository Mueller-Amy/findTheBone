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
import byui.cit260.findTheBone.control.GameControl;
import findthebone.FindTheBone;

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

    private double getDiameter() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        double diameter = 0;
        String response;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessages);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            diameter = Double.parseDouble(value);

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

            height = Double.parseDouble(value);

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
        }
        return height;
    }
           

private void doAction() {
           double diameter = getDiameter();
           double height = getHeight();
           CalculationsControl calcControl = new CalculationsControl();

           double volume = calcControl.calcVolumeOfCylinder(diameter, height);
    
        }

    











}
 
   
    
    
    
  