/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.exceptions;

import java.util.logging.Logger;

/**
 *
 * @author Jean
 */
public class TimeControlException extends Exception{

    public TimeControlException() {
    }

    public TimeControlException(String message) {
        super(message);
    }

    public TimeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeControlException(Throwable cause) {
        super(cause);
    }

    public TimeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   
    
}
