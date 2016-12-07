/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

/**
 *
 * @author Keith Downing
 */
public class CluesView extends View{
    
    public CluesView(){
        super ("\n"
             + "\n=========================================="
                    + "\n| Clues Menu                      |"
                    + "\n==================================="
                    + "\n1 - Clue 1"
                    + "\n2 - Clue 2"
                    + "\n3 - Clue 3"
                    + "\n4 - Clue 4"
                    + "\n5 - Clue 5"
                    + "\n6 - Clue 6"
                    + "\n7 - Clue 7"
                    + "\n8 - Clue 8"
                    + "\n9 - Clue 9"
                    + "\nA - Clue 10"
                    + "\nB - Clue 11"
                    + "\nC - Clue 12"
                    + "\nD - Clue 13"
                    + "\nE - Clue 14"
                    + "\nX - Exit"
                    + "\n====================================");   
        
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
            
            switch (choice) {
                case "1": //Clue 1
                    this.clue1();
                    break;
                case "2": //Clue 2
                    this.clue2();
                    break;
                case "3": //Clue 3
                    this.clue3();
                    break;
                case "4": //Clue 4
                    this.clue4();
                    break;    
                case "5": //Clue 5
                    this.clue5();
                    break;
                case "6": //Clue 6
                    this.clue6();
                    break;
                case "7": //Clue 7
                    this.clue7();
                    break;
                case "8": //Clue 8
                    this.clue8();
                    break;
                case "9": //Clue 9
                    this.clue9();
                    break;
                case "A": //Clue 10
                    this.clue10();
                    break;
                case "B": //Clue 11
                    this.clue11();
                    break;
                case "C": //Clue 12
                    this.clue12();
                    break;
                case "D": //Clue 13
                    this.clue13();
                    break;
                case "E": //Clue 14
                    this.clue14();
                    break;
                case "X": // Exit
                    this.exit();
                    break;
                default:
                    this.console.println("\n*** Invalid selection *** Try Again");
                    break;
                
            }
            return false;
       
}

    private void clue1() {
        this.console.println("*** viewclue1 function called ***"); 
    }

    private void clue2() {
        this.console.println("*** viewclue2 function called ***"); 
    }

    private void clue3() {
        this.console.println("*** viewclue3 function called ***"); 
    }

    private void clue4() {
        this.console.println("*** viewclue4 function called ***"); 
    }

    private void clue5() {
        this.console.println("*** viewclue5 function called ***"); 
    }

    private void clue6() {
        this.console.println("*** viewclue6 function called ***"); 
    }

    private void clue7() {
        this.console.println("*** viewclue7 function called ***"); 
    }

    private void clue8() {
        this.console.println("*** viewclue8 function called ***"); 
    }

    private void clue9() {
        this.console.println("*** viewclue9 function called ***"); 
    }
    private void clue10() {
        this.console.println("*** viewclue10 function called ***"); 
    }
    private void clue11() {
        this.console.println("*** viewclue11 function called ***"); 
    }

    private void clue12() {
        this.console.println("*** viewclue12 function called ***"); 
    }

    private void clue13() {
        this.console.println("*** viewclue13 function called ***"); 
    }

    private void clue14() {
        this.console.println("*** viewclue14 function called ***"); 
    }
    private void exit() {
        this.console.println("*** Exit function called ***"); 
    }
    

    
}
