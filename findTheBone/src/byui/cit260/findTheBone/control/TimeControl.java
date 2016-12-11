/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import citbyui.cit260.findTheBone.exceptions.TimeControlException;
import java.io.Serializable;

/**
 *
 * @author Jean
 */
public class TimeControl implements Serializable{
    double newTime;
    private Double timeRemaining;
    
    public TimeControl(double currentTime) throws TimeControlException {
        try{
           newTime = timeRemaining-0.5;
           timeRemaining= newTime;
            
            if (newTime < 0.01)  {
                //your time over
                System.out.println("call end of game View");
                currentTime = 0.01;            
            }        
            
            currentTime = timeRemaining - 0.5;

        }
        catch(Exception ex){
                                    
            throw new TimeControlException("ERROR: There was a problem with "
                    + "calculating the new game time.");
        }
        
    }
    
}

