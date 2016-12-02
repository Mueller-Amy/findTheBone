/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import findthebone.FindTheBone;
import java.io.PrintWriter;

/**
 *
 * @author Jean Oliveira
 * Created in L12 TA
 */
public class ErrorView {
    
    private static final PrintWriter errorFile=FindTheBone.getOutFile();
    
    public static void display(String className, String errorMessage) {
         errorFile.println(
                           "---------------------------------------"
                         + "\n ERROR - " + errorMessage
                         + "\n-------------------------------------");
    }
    
     
    
}
