/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import citbyui.cit260.findTheBone.exceptions.GameTimeControlException;
import java.text.DecimalFormat;

/**
 *
 * @author Jean
 */
public class GameTimeControl {
    
    public static double calcNewGameTime(double currentTime, double timeLoss)
    throws GameTimeControlException{
        
        //declare variable and initialize to 0, defalt game over.
        double newTime = 0;
        try{
            if (currentTime > 24.0)
            {
                //Something is wrong, just default it to 24
                currentTime = 24.0;            
            }
            if (currentTime < 0.01)
            {
                currentTime = 0.01;            
            }        

            if (timeLoss > 5 | timeLoss < 0.01)
            {
                //something is wrong. Default it to 0.01
                timeLoss = 0.1;
            }

            newTime = currentTime - timeLoss;

            if (newTime < 0)
            {
                newTime = 0;
            }

            //format the time so that only 2 decimal points are returned
            DecimalFormat df = new DecimalFormat("#.##"); 

            newTime = Double.valueOf(df.format(newTime));
        }
        catch(Exception ex){
                                    
            throw new GameTimeControlException("ERROR: There was a problem with "
                    + "calculating the new game time.");
        }
        
        return newTime;
    }
        
}
