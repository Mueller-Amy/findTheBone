/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;
import byui.cit260.findTheBone.control.InventoryControl;
import byui.cit260.findTheBone.model.Item;
        

    

/**
 *
 * @author Amy Mueller
 */
public class InventoryView extends View{
    
    public InventoryView(){
        super ("\n"
             + "\n=========================================="
                    + "\n| Inventory Menu                            |"
                    + "\n=========================================="
                    + "\nA - Twig"
                    + "\nB - Pebble"
                    + "\nC - Box"
                    + "\nD - Cylinder"
                    + "\nE - Paper"
                    + "\nF - Ball"
                    + "\nG - Fish"
                    + "\nH - Cat Hair"
                    + "\nI - Lost Cat Bell"
                    + "\nJ - Cat Collar"
                    + "\nK - Cat Name Tag"
                    + "\nL - Business Card"
                    + "\nM - Treat"
                    + "\nN - Duck Feather"
                    + "\nO - Peanuts"
                    + "\nX - Exit"
                    + "\n==========================================");   
        
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            switch (choice) {
                case "A": //twig item
                    this.twig();
                    break;

                case "B": //pebble item
                    this.pebble();
                    break;

                case "C": //box item
                    this.box();
                    break;

                case "D": // cylinder item
                    this.cylinder();
                    break;
                case "E": // paper item
                    this.paper();
                    break;
                case "F": // ball item
                    this.ball();
                    break;
                case "G": //fish
                    this.fish();
                    break;
                case "H": //Cat Hair
                    this.catHair();
                    break;
                case "I": //Lost cat bell
                    this.lostCatBell();
                    break;
                case "J": //Cat Collar Item
                    this.catCollar();
                    break;  
                case "K": //Cat Name Tag Item
                    this.catNameTag();
                    break;
                case "L": //Business Card Item
                    this.businessCard();
                    break;
                case "M": //Treat Item
                    this.treat();
                    break;
                case "N": //Duck Feather Item
                    this.duckFeather();
                    break;
                case "O": //Peanuts Item
                    this.peanuts();
                    break;
                 
                case "X": // Exit
                    this.exit();
                    break;
                default:
                    // L12 System.out.println("\n*** Invalid selection *** Try Again");
                    this.console.println("\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
       
}

    private void twig() {
        // L12 System.out.println("*** viewTwig function called ***"); 
        this.console.println("*** viewTwig function called ***"); 
    }

    private void pebble() {
        // L12 System.out.println("*** viewpebble function called ***"); 
        this.console.println("*** viewpebble function called ***"); 
    }

    private void box() {
        // L12 System.out.println("*** viewBox function called ***"); 
        this.console.println("*** viewBox function called ***"); 
    }

    private void cylinder() {
        // L12 System.out.println("*** viewCylinder function called ***"); 
        this.console.println("*** viewCylinder function called ***");
    }

    private void paper() {
        // L12 System.out.println("*** viewPaper function called ***"); 
        this.console.println("*** viewPaper function called ***");
    }

    private void ball() {
        // L12 System.out.println("*** viewBall function called ***"); 
        this.console.println("*** viewBall function called ***");
    }

    private void fish() {
        // L12 System.out.println("*** viewFish function called ***"); 
        this.console.println("*** viewFish function called ***");
    }

    private void catHair() {
        // L12 System.out.println("*** viewCatHair function called ***"); 
        this.console.println("*** viewCatHair function called ***");
    }

    private void lostCatBell() {
        // L12 System.out.println("*** viewlostCatBell function called ***"); 
        this.console.println("*** viewlostCatBell function called ***"); 
    }

    private void catCollar() {
        // L12 System.out.println("*** viewCatCollar function called ***"); 
        this.console.println("*** viewCatCollar function called ***");
    }

    private void catNameTag() {
        // L12 System.out.println("*** viewCatNameTag function called ***"); 
        this.console.println("*** viewCatNameTag function called ***"); 
    }

    private void businessCard() {
        // L12 System.out.println("*** viewBusinessCard function called ***"); 
        this.console.println("*** viewBusinessCard function called ***");
    }

    private void treat() {
        // 12 System.out.println("*** viewTreat function called ***"); 
        this.console.println("*** viewTreat function called ***");
    }

    private void duckFeather() {
        // L12 System.out.println("*** viewDuckFeather function called ***"); 
        this.console.println("*** viewDuckFeather function called ***"); 
    }

    private void peanuts() {
        // L12 System.out.println("*** viewPeanuts function called ***"); 
        this.console.println("*** viewPeanuts function called ***");
    }

    private void exit() {
        // L12 System.out.println("*** Exit function called ***"); 
        this.console.println("*** Exit function called ***");
    }

    
}
