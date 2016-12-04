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
                    + "\nO - Other Report"
                    + "\nX - Exit"
                    + "\n==========================================");
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            
        switch (choice) {
                case "C": //view map
                    this.cluesReport();
                    break;
                case "S": //view map
                    this.sceneReport();
                    break;
                case "I": // call to Jean individual L10 Assignment
                    this.itemReport();
                    break;
                case "L": //clues view temporary
                    this.locationReport();
                    break;
                case "V": //view List of items
                    this.inventoryReport();
                    break;
                case "T": //Time Used
                    this.townsPeopleReport();
                    break;
                case "B": // What is in Backpack
                    this.backpackReport();
                    break;
                case "O": // What is in Backpack
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
    
}
