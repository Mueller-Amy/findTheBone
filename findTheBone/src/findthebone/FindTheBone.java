/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthebone;

import byui.cit260.findTheBone.model.Game; // Keith Downing
import byui.cit260.findTheBone.model.Player; // Amy Mueller
import citbyui.cit260.findTheBone.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Home
 */
public class FindTheBone {
    
    private static Game currentGame = null;
    private static Player player = null;
    //private static Map currentMap= null;
    //private static Location currentLocation = null;

    //L12 team Assignment- TA
    private static PrintWriter outFile=null;
    private static BufferedReader inFile=null;
    private static PrintWriter logFile=null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FindTheBone.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FindTheBone.player = player;
    }


    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FindTheBone.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FindTheBone.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FindTheBone.logFile = logFile;
    }
  
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a StartProgramViewOrig and display the start program view
        
        try {
               //L12 TA open character stream files for end user input and output
               FindTheBone.inFile=new BufferedReader(new InputStreamReader(System.in));
               FindTheBone.outFile=new PrintWriter(System.out, true);
               //open log file
               String filePath="log.txt";
                 FindTheBone.logFile=new PrintWriter(filePath);
               
            
               
              //create start program view and start run program
              StartProgramView startProgramView = new StartProgramView();
              startProgramView.display();
              
              
        } catch (Throwable e) {
                System.out.println("Exception: " + e.toString()+
                                   "\nCause: " + e.getCause()+
                                   "\nMessage: " + e.getMessage() );
                e.printStackTrace();
                
        }
        
       //L12 TA
       finally{ 
            try {
                if (FindTheBone.inFile != null)
                       FindTheBone.inFile.close();
                if (FindTheBone.outFile != null)
                       FindTheBone.outFile.close();
                if (FindTheBone.logFile != null)
                       FindTheBone.logFile.close();
            } catch (IOException ex) {
               System.out.println("Error closing the file");
               //return;
            }
            
            
        }
        
    }

   
        
    
    

    

    
    
}
