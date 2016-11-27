/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.ItemControl;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public final class ItemScreenView {
       public void promptEnterKey(){
            System.out.println("Press \"ENTER\" to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
       }
          
    void display() {
         System.out.println("\n"
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
        System.out.print("Numbers Order : ");
        ItemControl sorter = new ItemControl();
        int[] input = {32,7,56,20,12,98,2,36,64,22,77};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
          
        }
        System.out.println ("");
         promptEnterKey();
         

    }
    
}
    
    

    

    
    

