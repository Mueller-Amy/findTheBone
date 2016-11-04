/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

/**
 *
 * @author Amy Mueller
 */
public class VolumeOfBoxView {
   
    
    public String getInput() {
    
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            System.out.print("\n Enter the length of the box: ");
            Scanner length = new Scanner (System.in);
            //get the value entered from the keyboard
            selection = keyboard.netLine();
            selection = selection.trim();
         
            
            if (selection.length() <1) {//blank value entered
                System.out.println("\n*** Invalid selection. Try again***");
                continue;
            System.out.print('\n Enter the width of the box:");
            Scanner length = new Scanner (System.in);
            selection = keyboard.netLine ();
            selection = selection.trim();
              if (selection.length() <1) {//blank value entered
                System.out.println("\n*** Invalid selection. Try again***");
                continue;
              }
           System.out.print("\n Enter the height of the box:");
           Scanner length = new Scanner (System.in);
           selection = keyboard.netLine ();
           selection = selection.trim();
                if (selection.height()< 1) {
                    System.out.println ("\n *** Invalid selection. Try again");
                    continue;
                }
            
            System.out.println("\n The volume of the box is: " + calcVolumeOfBox(double length, double width, double height) + "\n";
            }
            break;
    }
            return selection; //return the name
    }
    
}



