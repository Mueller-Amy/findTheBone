/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

/**
 *
 * @author Home
 */
public class ClueControl {
    
    public double calcVolumeOfBox (double length, double width, double height) {
            if (length < 0 || length > 6) { //length out of range?
            return -1;
               }
            
            if (width < 0 || width > 6) { //width out of range?
            return -1;
            }
            
            if (height < 0 ||  height > 3) { //height out of range?
            return -1;
            }
            
            double volume = (length * width * height);
              
            return volume;
                            
     }
}
