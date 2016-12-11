
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Keith Downing 
 
 
*/

package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.model.Game;
import byui.cit260.findTheBone.model.GameTime;
import byui.cit260.findTheBone.model.Location;
import byui.cit260.findTheBone.model.Map;
import byui.cit260.findTheBone.model.Scene;
import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;
import findthebone.FindTheBone;

/**
 *
 * @author Amy Mueller
 */
public class GameMenuView extends View{

   
    //private String menu;
    //private String promptMessage;
      public GameMenuView() {

   // public GameMenuView() {
        super( "\n"
                    + "\n=========================================="
                    + "\n|           Game Menu                    |"
                    + "\n=========================================="
                    + "\nV - View Map"
                    + "\nM - Move to new Location"
                    + "\nT - Time Remaining"
                    + "\nL - What is in Backpack"
                    + "\nC - Volume of a cylinder"
                    + "\nR - Àrea of a box"
                    + "\nB - Volume of a box"
                    + "\nP - Print Report"
                    + "\nH - Help"
                    + "\nX - Exit"
                    + "\n==========================================");
    }

      @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            
        switch (choice) {
                
                case "V": //view map
                    this.displayMap();
                    break;
                case "M": 
                    this.moveToLocation();
                    break;
                case "T": //Time Used
                    this.timeRemaining();
                    break;
               
                case "L": // What is in Backpack
                    this.inBackpack();
                    break;
                case "C": 
                    // volume of cylinder
                     this.volumeOfCylinder();
                     break;
                case "B": 
                    // Volume of Box
                    this.volumeOfBox();
                    break;
                case "R": 
                    // calcAreaOfBox
                    this.calcAreaOfBox();
                    break;
                case "P": // Print Report
                    this.printReport();
                    break;
                case "H": // Help
                    this.displayHelpMenu();
                    break;
                              
                default:
                    //System.ouX.println("\n*** Invalid selection *** Try Again");
                    ErrorView.display(this.getClass().getName(),//L12 TA
                        "\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
       


    }

    
    private void inBackpack() {
        this.console.println("*** inBackpack function called ***"); 
    
    }

    private void volumeOfCylinder() {
         try {
        VolumeOfCylinderView cylinderView = new VolumeOfCylinderView();
        cylinderView.doAction();
        } catch (CalculationsControlException me) {
           this.console.println(me.getMessage());
       }
        
        }
    

    private void volumeOfBox()  {
       try {
        VolumeOfBoxView volumeView = new VolumeOfBoxView();
        volumeView.getVolume();
       } catch (CalculationsControlException me) {
           this.console.println(me.getMessage());
       }
    }

    private void calcAreaOfBox() {
        // try {
         VolumeOfBoxView volumeofbox = new VolumeOfBoxView();
       // } catch (CalculationsControlException me) {
          // this.console.println(me.getMessage());
       //}
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    private void timeRemaining() {
        TimeLocationStatusView timeStatus = new TimeLocationStatusView();
        timeStatus.display();
        
    }
    
    private void displayMap() {
                  String leftIndicator;
                  String rightIndicator;

        Game game = FindTheBone.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        GameTime gameTime = game.getGameTime(); //retrieve current time remaining
        Location[][] locations = map.getLocations(); // retreive the locations from map
        try {
            System.out.print("  |");
            for (int column = 0; column < locations[0].length; column++) {
                System.out.print("  " + column + " |"); // print col numbers to side of map
            }
            System.out.println();
            for (int row = 0; row < locations.length; row++) {
                System.out.print(row + " "); // print row numbers to side of map
                for (int column = 0; column < locations[row].length; column++) {
                    leftIndicator = " ";
                    rightIndicator = " ";
                    if (locations[row][column] == game.getCurrentLocation()) {
                        leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "*"; // same as above
                    } else if (locations[row][column].getVisited()) {
                        leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "<"; // same as above
                    }
                    System.out.print("|"); // start map with a |
                    if (locations[row][column].getScene() == null) {
                        System.out.print(leftIndicator + "??" + rightIndicator);
                    } else {
                        System.out.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
                    }
                }
                System.out.println("|");
            }
            Scene currentScene = (Scene) game.getCurrentLocation().getScene();
            if (currentScene != null) {
                System.out.println("Your current location is " + currentScene.getName());    
                System.out.println(currentScene.getDescription());
                System.out.println("\n Your time remaining is " + gameTime.getTimeRemaining());
                System.out.println(currentScene.getClue());
            }
            
        } catch (Exception e) {
            this.console.println("Error");
        }
    }

    private void printReport() {
        PrintReportView printReport = new PrintReportView();
        printReport.display();
    }

    
    }

    
    }

   




