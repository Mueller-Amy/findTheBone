
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;
import java.util.Scanner;
import byui.cit260.findTheBone.control.CalculationsControl;
/**
 /**
 *
 * @author Amy Mueller
 */

public class VolumeOfBoxView {
   String promptMessages = "\n"
           + "\n=================="
           + "\n| Let's Find the Volume of the box"
           + "\n============================"
           + "\n| Enter the width of the box: (Enter -1 to cancel)"
           + "\n============================";
    String promptMessagesTwo = "\n"
           + "\n=================="
           + "\n| Enter the length of the box:"
           + "\n============================";
    String promptMessagesThree ="\n"
           + "\n=================="
           + "\n| Enter the height of the box:"
           + "\n=============================";
    
    private double getWidth() {
    
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        double width = 0;
        String response;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            System.out.print("\n" + this.promptMessages);
            
            //get the value entered from the keyboard
            width = keyboard.nextDouble();
            if (width == -1)
                return -1;
            
            else if (width <= 0) {
                response = "Invalid Entry";
            }
            else {
                valid = true;
            }
        }
            return width;
        }
    
        
        private double getLength() {
            Scanner keyboard = new Scanner(System.in);
            String value ="";
            boolean valid = false;
            double length = 0;
            String response;
            while (!valid) {
                System.out.println("\n" + this.promptMessagesTwo);
                    
               length = keyboard.nextDouble();
               if (length == -1)
                return -1;
            
               else if (length<=0) {
                response = "Invalid Entry";
            }
            else {
                valid = true;
            }
            }
            return length;
            }
            
        private double getHeight() {
            Scanner keyboard = new Scanner(System.in);
            String value = "";
            boolean valid = false;
            double height = 0;
            String response;
            while(!valid){
                System.out.println("\n" + this.promptMessagesThree);
                
                height = keyboard.nextDouble();
                
              if (height == -1)
                return -1;
              else if(height<=0) {
                  response = "Invalid Entry";
              }
              else{
                  valid = true;
              }
            }
              return height;
            }
        
        public void getVolume(){
            boolean valid = false;
            
            while(!valid)
            {
        
            double width = getWidth();
            if (width == -1){
                System.out.println("\nYou chose to cancel");
                return;
            }
            double length = getLength();
             if (length == -1){
                System.out.println("\nYou chose to cancel");
                return;
            }
            double height = getHeight();
            if (height == -1){
                System.out.println("\nYou chose to cancel");
                return;
            }
            CalculationsControl calcControl = new CalculationsControl();
            
            double volume = calcControl.calcVolumeOfBox(width, length, height);
            if (volume == -1) {
                System.out.println("\nYou did not enter a valid width. It must be between 1 and 6");
            }
            else if (volume == -2 ) {
                System.out.println("\nYou did not enter a valid length. It must be between 1 and 6");
            }
            else if (volume == -3 ){
                System.out.println("\nYou did not enter a valid height. It must be between 1 and 6");
            }
            else if (volume < 0) {
                System.out.println("\nInvalid entries");
            }
            else{
            System.out.println("\nThe volume of your box is" + volume);
            valid = true;
            }
            }
        }
}
        
            
        
            
    




