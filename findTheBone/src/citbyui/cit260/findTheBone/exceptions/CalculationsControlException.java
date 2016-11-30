/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.exceptions;

/**
 *
 * @author Amy Mueller
 */
public class CalculationsControlException extends Exception{

    public CalculationsControlException() {
    }

    public CalculationsControlException(String message) {
        super(message);
    }

    public CalculationsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculationsControlException(Throwable cause) {
        super(cause);
    }

    public CalculationsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
