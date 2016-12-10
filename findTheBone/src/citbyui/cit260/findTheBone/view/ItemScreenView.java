/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.ItemControl;
import java.io.IOException;

/**
 *
 * @author Jean
 */
public abstract class ItemScreenView extends View {
       public final void promptEnterKey(){
            this.console.println("Press \"ENTER\" to continue...");
           try {
               //Scanner scanner = new Scanner(System.iX);
               this.keyboard.readLine();
           } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading Input: " + ex.getMessage());
           }
       }
          
    /**
     *
     */
    @Override
    public final void display() {
         this.console.println("\n"
                    + "\n=========================================="
                    + "\n|                                        |"
                    + "\n|        L10 Individual Assignment       |"
                    + "\n|              Jean Oliveira             |"
                    + "\n|                                        |"
                    + "\n|    This function display a shorted     |"
                    + "\n|       array of numbers entered         |"
                    + "\n|       within this same function.       |"
                    + "\n|                                        |"
                    + "\n=========================================="
                   );
         promptEnterKey();
    }
       
    

    public ItemScreenView() {
        this.display(); //display screen
        this.console.print("Numbers Order : ");
        ItemControl sorter = new ItemControl();
        int[] input = {32,7,56,20,12,98,2,36,64,22,77};
        sorter.sort(input);
        for(int i:input){
            this.console.print(i);
            this.console.print(" ");
          
        }
       this.console.println ("");
         promptEnterKey();
         

    }
    
}
    
    

    

    
    

