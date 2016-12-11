/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.enums.MapCodeType;
import byui.cit260.findTheBone.enums.SceneType;
import byui.cit260.findTheBone.enums.InventoryName;
import byui.cit260.findTheBone.enums.InventoryView;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jean Oliveira
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
           String filePath = null;
           String fileLocation="inventoryreport.txt";
           boolean vali
                   
                   { 
            this.console.println("Enter where you would like the Inventory Report saved: ");
            
            try {
                filePath = this.keyboard.readLine(); 
                filePath = filePath.trim(); 
            
            if (filePath.length() < 1) { 
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value: value can not be blank");]
            continue;
            }
             
               
        }  catch (IOException ex) {
                  ErrorView.display(this.getClass().getName(),
                        "Error reading Input: " + ex.getMessage());
                   
              }

        break; 
        
        }
         
            
           try (PrintWriter outFile=new PrintWriter(filePath + fileLocation)) {  
             
              outFile.println("\n\n    Inventory List    ");
              outFile.printf("%n%-20s%8s", "Inventory List", "Inventory Item");
              outFile.printf("%n%-20s%10s", "-------------", "--------");
             
                  for (int i=0;i < name.length;i++){
                  String inventoryname = name[i].toString();
                  String intventoryitem = code[i].toString();
                  
                  outFile.printf("%n%-20s%10s", inventoryname, inventoryView );
                  
              }      
                }   catch (IOException ex) {
               ErrorView.display(this.getClass().getName(),"Error with saving Inventory Report");    
        
        } 
                  this.console.println("\n=================="
                          
                                     + "\n|  Report Saved   |"
                                     + "\n==================");

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
          
           String filePath = null;//Specify the file location of the file
           String fileLocation="mapreport.txt";//variable for a file stream
           boolean valid = false; // initialize to not valid
        
           //getting file path 
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
         
            //print report
           try (PrintWriter outFile=new PrintWriter(filePath + fileLocation)) {  
             
              outFile.println("\n\n           Map Report         ");
              outFile.printf("%n%-20s%10s", "Map Name", "Map Code");
              outFile.printf("%n%-20s%10s", "--------", "--------");
            
              SceneType[] name=SceneType.values();
              MapCodeType[] code=MapCodeType.values();
             
              //for statement to go through the list of enum items to be displayed
                  for (int i=0;i < name.length;i++){
                  String mapname = name[i].toString();
                  String mapcode = code[i].toString();
                  
                  outFile.printf("%n%-20s%10s", mapname, mapcode );
                  
              }      
                 
    
    }   catch (IOException ex) {
               ErrorView.display(this.getClass().getName(),"Error saving or writing data to map file report !!!");    
        
        } 
                  this.console.println("\n=========================================="
                                     + "\n|       Report Sucessfuly saved !!!      |"
                                     + "\n==========================================");

              }

    
          }
