/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Home
 */
public class CalculationsControlTest {
    
    public CalculationsControlTest() {
    }

    /**
     * Test of calcVolumeOfBox method, of class CalculationsControl.
     */
    @Test
    public void testCalcVolumeOfBox() {
        System.out.println("calcVolumeOfBox");
        double length = 6.0;
        double width = 6.0;
        double height = 3.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 108.0;
        double result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
    }

    /**
     * Test of calcAreaOfBox method, of class CalculationsControl.
     */
    @Test
    public void testCalcAreaOfBox() {
        System.out.println("calcAreaOfBox");
        double length = 3.0;
        double width = 2.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 6.0;
        double result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
