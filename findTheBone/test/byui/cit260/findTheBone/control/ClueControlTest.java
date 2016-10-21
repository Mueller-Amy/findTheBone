/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Home
 */
public class ClueControlTest {
    
    public ClueControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcVolumeOfBox method, of class ClueControl.
     */
    @Test
    public void testCalcVolumeOfBox() {
        System.out.println("calcVolumeOfBox");
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;
        ClueControl instance = new ClueControl();
        double expResult = 0.0;
        double result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
