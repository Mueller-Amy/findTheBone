/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jean
 */
public class ComplexCalculationsView extends View {

    public ComplexCalculationsView() {
        super(        "\n=========================================="
                    + "\n|      Complex Calculations Menu         |"
                    + "\n=========================================="
                    + "\nB - Volume of Box"
                    + "\nC - Volume of Cylinder"
                    + "\nR - Rectangle Diagonal"
                    + "\nX - Exit the Game"
                    + "\n==========================================");
    }
    
    @Override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch (choice) {
            case "B": //volumeOfBox
                this.volumeOfBox();
                break;
            case "C": //get saved game and start
                this.volumeOfCylinder();
                break;
            case "R": {
            try {
                // rectangleDiagonal
                this.rectangleDiagonal();
            } catch (CalculationsControlException ex) {
                Logger.getLogger(ComplexCalculationsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                ErrorView.display(this.getClass().getName(),//L12 TA
                        "\n*** Invalid selection *** Try Again");//L12 TA
                //this.console.println("\n*** Invalid selection *** Try Again");
                break;
                
        }
         return false;
    }

   
    private void volumeOfBox() {
        try {
        VolumeOfBoxView volumeView = new VolumeOfBoxView();
        volumeView.getVolume();
       } catch (CalculationsControlException me) {
           this.console.println(me.getMessage());
       }
    }

    private void volumeOfCylinder() {
        try {
        VolumeOfCylinderView cylinderView = new VolumeOfCylinderView();
        cylinderView.doAction();
        } catch (CalculationsControlException me) {
           this.console.println(me.getMessage());
       }
        
        }

    private void rectangleDiagonal() throws CalculationsControlException {
        DiagonalCalculationView diagonalCalculationView = new DiagonalCalculationView();
        diagonalCalculationView.displayRectangleDiagonal();
               
        }
      
        
       }
    
    
    

    
