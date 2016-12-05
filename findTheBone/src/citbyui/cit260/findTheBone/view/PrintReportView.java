/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.enums.SceneType;
import java.io.PrintWriter;

/**
 *
 * @author Jean
 */
public class PrintReportView extends View {

    public PrintReportView() {
    
    super( "\n"
                    + "\n=========================================="
                    + "\n|           Print Report Menu            |"
                    + "\n=========================================="
                    + "\nC - Clues Report"
                    + "\nS - Scene Report"
                    + "\nI - Item Report"
                    + "\nL - Location Report"
                    + "\nV - Inventory Report"
                    + "\nT - TownsPeople Report"
                    + "\nB - Backpack Report"
                    + "\nM - Map Report"
                    + "\nO - Other Report"
                    + "\nX - Exit"
                    + "\n==========================================");
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            
        switch (choice) {
                case "C":  
                    this.cluesReport();
                    break;
                case "S": 
                    this.sceneReport();
                    break;
                case "I": //  
                    this.itemReport();
                    break;
                case "L": // 
                    this.locationReport();
                    break;
                case "V": // 
                    this.inventoryReport();
                    break;
                case "T": // 
                    this.townsPeopleReport();
                    break;
                case "B": //  
                    this.backpackReport();
                    break;
                case "M": //  
                    this.mapReport();// Jean written the selected code function
                    break;
                case "O": //  
                    this.otherReport();
                    break;
                         
                default:
                    //System.out.println("\n*** Invalid selection *** Try Again");
                    ErrorView.display(this.getClass().getName(),//L12 TA
                        "\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
       
}

     //for l12 individual assigment choose one report and write your code inside it
    private void cluesReport() {
       
        System.out.println(" cluesReport Called");
    }

    private void sceneReport() {
        
        System.out.println("sceneReport Called");
    }

    private void itemReport() {
        System.out.println("itemReport Called"); 
    }

    private void locationReport() {
        System.out.println("locationReport Called"); 
    }

    private void inventoryReport() {
        System.out.println("inventoryReport Called"); 
    }

    private void townsPeopleReport() {
        System.out.println("townsPeopleReport Called"); 
    }

    private void backpackReport() {
        System.out.println("backpackReport Called"); 
    }

    private void otherReport() {
        System.out.println("otherReport Called"); 
    }

    private void mapReport() {//function written by Jean Oliveira
          boolean done=false;
          String fileReportName="mapReport.txt";
          String filePath=null;
          
          
          do {
              this.console.println("Please, enter the file path where to be save the Map report file: ");
              filePath = this.getInput(); //get the user file path to save file report
              
          } while (!done);
          
           PrintWriter fileLocation = null;
          
          //print to file a Map report
          
          //create Bufferred object for input file Map report
          try (PrintWriter out=new PrintWriter(fileLocation)) {
              //print title and column headings
              out.println("\n\n           Map Report         ");
              out.printf("%n%-20s%10s%10s%", "Map Name", "Map Code");
              out.printf("%n%-20s%10s%10s%", "--------", "--------");
             
              SceneType[] scene=SceneType.values();
              for (SceneType item:scene) {
                  out.printf("%n%-20s%7d%13.2f", item
                                            //   ,Map Code()
                                                       );
              }
          
    
    }

    
}
}
    
