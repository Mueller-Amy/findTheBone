
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;
import java.util.Scanner;
/**
 /**
 *
 * @author Amy Mueller
 */

/**public class VolumeOfBoxView {
   String promptMessages = "\n"
           "+\n=================="
           "+\n| Enter the width of the box:"
           "+\n============================"
           "+\n| Enter the length of the box:"
           "+\n============================"
           "+\n| Enter the height of the box:"
           "+\n=============================";
    
    public String getInput() {
    
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            System.out.print("\n" + this.promptMessages);
            
            //get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();
         
            
            if (value.length() <1) {//blank value entered
                System.out.println("\n*** Invalid selection. Try again***");
                continue;
            }
            break;
        }
            return value;
        }
            
}
            
          //  System.out.println("\n The volume of the box is: " + calcVolumeOfBox(double length, double width, double height) + "\n";
         //   }
         //   break;
    //}
   //         return selection; //return the name
  //  }
    
//}



*/
