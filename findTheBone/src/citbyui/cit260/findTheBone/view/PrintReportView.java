/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

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
                    this.mapReport();// Jean wrote the selected code function
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

    private void mapReport() {//function wrote by Jean Oliveira
        System.out.println("otherReport Called");
    }
    
}
