/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.CalculationsControl;
import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;
import findthebone.FindTheBone;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class DiagonalCalculationView {
    
    protected final BufferedReader keyboard =FindTheBone.getInFile();
    protected final PrintWriter console =FindTheBone.getOutFile();

    
   
        public void promptEnterKey(){
            System.out.println("Press \"ENTER\" to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
}
  
        public DiagonalCalculationView() {
                      //this.displayBanner(); //display the banner when view is created
    
        }
    void displayBanner() {
        System.out.println(
              "\n*********************************************************************"
            + "\n*                Diagonal Rectangle Calculation                     *"
            + "\n*********************************************************************"          
            + "\n*        Now, that you remembered where you buried the bone,        *"
            + "\n*  you must do a calculation to know exactly where the bone are.    *"
            + "\n*     You must enter the length and height of the rectangle.        *"
            + "\n*     Do not enter negative values. And not enter equal values.     *"
            + "\n*  Also do not enter very low or very high values. You have three   *"
            + "\n*        chances to find an acceptable diagonal result,             *"
            + "\n*                 or cry for the bone forever.                      *"
            + "\n*********************************************************************" 
        );          
                   
        }              
     
    /**
     * display the banner
     * 
     */
    
    /** 
     * start the logical variable
     * start the counter - 3 times
     *    DO - WHILE ( done = false)-- start of a condition block 
     *      begin getting input values
     *         prompt to get the length
     *         prompt to get the width
     *      
     *   call doAction to do the calculate,check 
     *         valid or invalids values , checking errors , return done value
     *   add 1 to counter
     *   if counter == 4(--- the user had doing the 3 chances, 
     *              if YES the user lost the game 
     *          pause the screen to until user press a key          
     *          
     * }
     * end of WHILE --- (if done FALSE AND not used the three attempts repeat DO-WHILE)
     *                   if done TRUE get out from DO-WHILE 
     *                   or if attempts is >= 4 get out from DO-WHILE>
     *                   
     * return to start a game
     *          
     * @throws citbyui.cit260.findTheBone.exceptions.CalculationsControlException
     */
        
    public void displayRectangleDiagonal() throws CalculationsControlException {
        boolean done = false;
        double counter = 1;
            //         do
            do {  
                 
            //  prompt for and get values
               double length = this.getLength();
               double width = this.getWidth();
               
               // do the requested action and display next view 
               done = this.doAction(length,width);
              
               counter = counter + 1; 
              
               if (counter == 4) {
          this.console.println("\n**********************************************"
                           + "\n*      oh oh !!! You used all atempts!       *"  
                           + "\n       You lost the BONE and the GAME        *"
                           + "\n                   GAME OVER                 *"
                           + "\n**********************************************");
                   
                   promptEnterKey();// a pause to exit when user press the keyboard
               }
               
            }while (!done && counter < 4);
             // while done =false AND counter <4 repeat
            // return to the start programm menu
            //create a StartProgramView and display the start program view
        //StartProgramView startProgramView = new StartProgramView();
        //startProgramView.display();
    
            }      
    /* call a function within CalculationsControl class to calculate the diagonal
     * if RETURN == -1 {
     *             message Invalid Values - try again
     *             return false to done variable
     *  else
     *          THE CALCULATON IS CORRECT AND THE USER WIN THE GAME. The congratulations message
     *     will display to the user. And return TRUE value to DONE variable to get out
     *     from the previous DO-WHILE.
     *        
    */
    public boolean doAction(double length, double width) throws CalculationsControlException {
         // create a new instance of CalculationsControl classe.
         // call calcDiagonalRectangle function within CalculatonsControl class
         // to calculate the diagonal of a rectangle and set the result to diagonal variable
        CalculationsControl newDiagonal = new CalculationsControl();
        double diagonal = newDiagonal.calcDiagonalRectangle(length,width);
        
             
                         
               if (diagonal == -1.0) {
                   //Call control function to calculate the triangle diagonal
                   this.console.println("\n Invalid values for length or width. Try again.");
                   return false;
               }
               else {
                   
                   this.console.println("The Rectangle Diagonal = " + diagonal );
                   this.console.println("\n***************************************************"
                           + "\n*      Congratulations !!! You found the bone.    *"  
                           + "\n                    GAME OVER                     *"
                           + "\n***************************************************");
       //promptEnterKey();// a pause to exit when user press the keyboard
                   return true;
                               }
                   }
              
     // to get input values from the user
    private double getLength() {
        Double length=null;
        while (length == null){
		//create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
			
		this.console.println("\nPlease, enter the rectangle length value:"); // prompt user to enter length
		
        length = inFile.nextDouble(); // get weight entered from console
	
        }
    return length;	
    }
    private double getWidth()  {
            
            Double width=null;
        while (width == null){
		//create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
                this.console.println("\nPlease, enter the rectangle width value:"); // prompt user to enter length
                width = inFile.nextDouble(); // get weight entered from console
    }

return width;
    }

}


   

 
