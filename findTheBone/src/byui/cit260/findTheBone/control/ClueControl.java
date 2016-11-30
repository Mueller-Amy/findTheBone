/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import citbyui.cit260.findTheBone.exceptions.ClueControlException;

/**
 *
 * @author Home
 */
public class ClueControl {
    
    public double calcVolumeOfBox (double length, double width, double height) 
            throws ClueControlException {
            if (length < 0 || length > 6) { //length out of range?
            //return -1;
                throw new ClueControlException("Length out of range. "
                        + "Please enter a number between 0 and 6.");
               }
            
            if (width < 0 || width > 6) { //width out of range?
            //return -1;
             throw new ClueControlException("Width out of range. "
                        + "Please enter a number between 0 and 6.");
            }
            
            if (height < 0 ||  height > 3) { //height out of range?
            //return -1;
             throw new ClueControlException("Height out of range. "
                        + "Please enter a number between 0 and 6.");
            }
            
            double volume = (length * width * height);
              
            return volume;
                            
     }
}
