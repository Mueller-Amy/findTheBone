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
public class AreaOfBoxView {
    
    public String getInput() {
    
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            //get the value entered from the keyboard
            selection = keyboard.netLine();
            selection = selection.trim();
            
            if (selection.length() <1) {//blank value entered
                System.out.println("\n*** Invalid selection. Try again***");
                continue;
            }
            break;
    }
            return selection; //return the name
    }
    
}
