/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.exceptions;

/**
 *
 * @author Jean
 */
public class GameTimeControlException extends Exception{
    
    
    public GameTimeControlException(){
    }
       
    //Overriden Constructors
    public GameTimeControlException(String message){
        super(message);
    }
    
    public GameTimeControlException(String message, Throwable cause){
        super(message, cause);
    }
    
    public GameTimeControlException(Throwable cause){
        super(cause);
    }
    
    public GameTimeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
