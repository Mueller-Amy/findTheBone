/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.CalculationsControl;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public final class ComplexCalculationDiagonal {

    
    
        public void promptEnterKey(){
            System.out.println("Press \"ENTER\" to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
}
        public ComplexCalculationDiagonal() {
                        this.displayBanner(); //display the banner when view is created
    }

    public void displayBanner() {
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
     * display to get input values 3 times
     */
    
    /** 
     * initialize the counter - 3 times
     *    DO   --  begin getting input values
     *         prompt to get the length
     *         prompt to get the width
     *      if RETURN == -1 {
     *             message Invalid Values - try again
     *             add 1 to counter
     *           else
     *                 call doAction to do the calculate and congrats
     * }
     * while 
     */
        
    public void displayRectangleDiagonal() {
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
          System.out.println("\n**********************************************"
                           + "\n*      oh oh !!! You used all atempts!       *"  
                           + "\n       You lost the BONE and the GAME        *"
                           + "\n                   GAME OVER                 *"
                           + "\n**********************************************");
                   
                   promptEnterKey();
               }
    }       
            while (!done && counter < 4);
            
            //create a StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    private boolean doAction(double length, double width) {
            
        CalculationsControl newDiagonal = new CalculationsControl();
        double diagonal = newDiagonal.calcDiagonalRectangle(length,width);
             
                         
               if (diagonal == -1.0) {
                   //Call control function to calculate the triangle diagonal
                   System.out.println("\n Invalid values for length or width. Try again.");
                   return false;
               }
               else {
                   
                   System.out.println("The Rectangle Diagonal = " + diagonal );
                   System.out.println("\n***************************************************"
                           + "\n*      Congratulations !!! You found the bone.    *"  
                           + "\n                    GAME OVER                     *"
                           + "\n***************************************************");
       promptEnterKey();
                   return true;
                               }
                   }
              
     
    private double getLength() {
        
		//create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
			
		System.out.println("\nPlease, enter the Triangle Length value:"); // prompt user to enter length
		
		double length = inFile.nextDouble(); // get weight entered from console
		return length;
		
    }

    private double getWidth() {
        //create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
			
		System.out.println("\nPlease, enter the Triangle Width value:"); // prompt user to enter length
		
		double width = inFile.nextDouble(); // get weight entered from console
		return width;
    }

   

}
