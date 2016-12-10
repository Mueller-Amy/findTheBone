/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.enums.SceneType;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                       //Amy Mueller Lesson 12
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
        String filePath=null;
        String fileLocation="inventoryReport.txt";
        
            boolean valid = false;
         while (!valid){
             this.console.println("Enter where you want to save the Inventory Report: ");
             
             try{
                 filePath = this.keyboard.readLine(); 
               
                 filePath = filePath.trim(); 
            
            if (filePath.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),//L12 TA
                        "\nMust enter a number");
            continue;
            }
             
               
        }  catch (IOException ex) {
                  ErrorView.display(this.getClass().getName(),
                        "Could not read " + ex.getMessage());
                   
              }

        break; 
        
        }

          
          try  (FileWriter outFile=new FileWriter(filePath + fileLocation)){
             
              outFile.write("\n\nInventory");
              outFile.write("Inventory List");
              outFile.write("--------"+ "--------");
            
              SceneType[] scene=SceneType.values();
              
            
              for (SceneType item:scene) {
                  outFile.write("\n " + item +"\n");
                                                                           
              }        
    
    }   catch (IOException ex) {
               ErrorView.display(this.getClass().getName(),"Did not save");    
        
        } 
                  this.console.println("Report Saved");
              }
          }
             
         
            
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
          
          //String fileReportName="mapReport.txt";
          String filePath = null;
          //FileWriter outFile=null;//variable for a file stream
          String fileLocation="mapreport.txt";//Specify the file location of the file
          //String reportname = "mapReport.txt";
          
            boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            this.console.println("Please, enter the file path where to be save the Map report file: ");
            
            try {
                filePath = this.keyboard.readLine(); // get next line typed on keyboard ----- L12 TA changed
                filePath = filePath.trim(); // trim off leading and trailing blanks
            
            if (filePath.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),//L12 TA
                        "\nInvalid value: value can not be blank");//L12 TA
            continue;
            }
             
               
        }  catch (IOException ex) {
                  ErrorView.display(this.getClass().getName(),
                        "Error reading Input: " + ex.getMessage());
                   
              }

        break; // end the loop
        
        }
         
          
          //print to file a Map report
          
          try  (FileWriter outFile=new FileWriter(filePath + fileLocation)){//file path + file name report
              
              //outFile = new FileWriter(fileLocation);//create and open a new file atream for the output file
              
              //outFile=new FileWriter(reportname);
              //print title and column headings
              
              outFile.write("\n\n           Map Report         ");
              outFile.write("Map Name"+ "Map Code");
              outFile.write("--------"+ "--------");
             //"%n%-20s%10s%10s%"+   "%n%-20s%10s%10s%"+ 
              SceneType[] scene=SceneType.values();
              
              //for statement to go through the list of items to be displayed
              for (SceneType item:scene) {
                  outFile.write("\n " + item +"\n");
                                            //   ,Map Code() 
                     //"%n%-20s%7d%13.2f" +                                  
              }        
    
    }   catch (IOException ex) {
               ErrorView.display(this.getClass().getName(),"Error saving or writing data to map file report !!!");    
        
        } 
                  this.console.println("Report Sucessfuly saved !!!");
              }
          }
