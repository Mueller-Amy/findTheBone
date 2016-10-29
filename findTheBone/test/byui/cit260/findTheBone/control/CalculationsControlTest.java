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
 * @author findTheBone Team
 */
public class CalculationsControlTest {
    
    public CalculationsControlTest() {
    }

    /*
     * Team Assignment - Calculate volume of a box tests
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
    
        /***********************
         *   Test Case # 2
         **********************/
        System.out.println("\tTest Case #2");
        length = -2.0;
        width = 3.0;
        height = 6.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 3
         **********************/
        System.out.println("\tTest Case #3");
        length = 6.0;
        width = 3.0;
        height = -2.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 4
         **********************/
        System.out.println("\tTest Case #4");
        length = 6.0;
        width = -3.0;
        height = 6.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 5
         **********************/
        System.out.println("\tTest Case #5");
        length = 0;
        width = 3.0;
        height = 6.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 6
         **********************/
        System.out.println("\tTest Case #6");
        length = 6.0;
        width = 3.0;
        height = 0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 7
         **********************/
        System.out.println("\tTest Case #7");
        length = 6.0;
        width = 0;
        height = 6.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 8
         **********************/
        System.out.println("\tTest Case #8");
        length = 5.0;
        width = 3.0;
        height = 7.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 9
         **********************/
        System.out.println("\tTest Case #9");
        length = 5.0;
        width = 7.0;
        height = 2.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 10
         **********************/
        System.out.println("\tTest Case #10");
        length = 7.0;
        width = 2.0;
        height = 5.0;
        expResult = -1;
        result = instance.calcVolumeOfBox(length, width, height);
        assertEquals(expResult, result, 0.0001);
    }

    /*
     * Amy Mueller - Individual Assignment - Calculate Àrea of the Box
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
        
        /***********************
         *   Test case # 2
         **********************/
         System.out.println("Test Case 2");
        length = -2.0;
        width = 4.0;
        expResult = -1.0;
        result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
        
         /***********************
         *   Test case # 3
         **********************/
         System.out.println("Test Case 3");
        length = 6.0;
        width = -2.0;
        expResult = -1.0;
        result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
        
         /***********************
         *   Test case # 4
         **********************/
         System.out.println("Test Case 4");
        length = 0.0;
        width = 6.0;
        expResult = 0.0;
        result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
        
         /***********************
         *   Test case # 5
         **********************/
         System.out.println("Test Case 5");
        length = 6.0;
        width = 0.0;
        expResult = 0.0;
        result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
        
         /***********************
         *   Test case # 6
         **********************/
         System.out.println("Test Case 6");
        length = 5.0;
        width = 7.0;
        expResult = -1.0;
        result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
        
        /***********************
         *   Test case # 7
         **********************/
         System.out.println("Test Case 7");
        length = 8.0;
        width = 2.0;
        expResult = -1.0;
        result = instance.calcAreaOfBox(length, width);
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Jean Oliveira - Individual Assignment - Calculate Diagonal of the Rectangle
     * Test of calcDiagonalRectangle method, of class CalculationsControl.
     */
    @Test
    public void testCalcDiagonalRectangle() {
        System.out.println("calcDiagonalRectangle");
        /***********************
         *   Test case # 1
         **********************/
        System.out.println("\tTest case #1");
        double length = 9.0;
        double width = 3.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 9.49;
        double result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 2
         **********************/
        System.out.println("\tTest case #2");
        length = -1.0;
        width = 3.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 3
         **********************/
        System.out.println("\tTest case #3");
        length = 9.0;
        width = -1.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 4
         **********************/
        System.out.println("\tTest case #4");
        length = 6.0;
        width = 6.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 5
         **********************/
        System.out.println("\tTest case #5");
        length = 5.0;
        width = 9.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 6
         **********************/
        System.out.println("\tTest case #6");
        length = 9.0;
        width = 8.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 7
         **********************/
        System.out.println("\tTest case #7");
        length = 4.0;
        width = 3.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        /***********************
         *   Test case # 8
         **********************/
        System.out.println("\tTest case #8");
        length = 13.0;
        width = 3.0;
        expResult = -1.0;
        result = instance.calcDiagonalRectangle(length, width);
        assertEquals(expResult, result, 0.01);
        
        
        
    }
    
    /*
     * Keith Downing - Individual Assignment - Calculate Volume of a Cylinder
     * Test of calcVolumeOfCylinder.
     */
    @Test
    public void testCalcVolumeOfCylinder() {
        System.out.println("calcVolumeOfCylinder");
        /***********************
         *   Test Case # 1
         **********************/
        System.out.println("\tTest Case #1");
        double diameter = 3.0;
        double height = 8.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 75.3982;
        double result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 2
         **********************/
        System.out.println("\tTest Case #2");
        diameter = 1.0;
        height = 2.0;
        expResult = 6.2832;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 3
         **********************/
        System.out.println("\tTest Case #3");
        diameter = -3.0;
        height = 8.0;
        expResult = -1;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 4
         **********************/
        System.out.println("\tTest Case #4");
        diameter = 3.0;
        height = -8.0;
        expResult = -1;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
                
        /***********************
         *   Test Case # 5
         **********************/
        System.out.println("\tTest Case #5");
        diameter = 3.0;
        height = 9.0;
        expResult = -1;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 6
         **********************/
        System.out.println("\tTest Case #6");
        diameter = 3.0;
        height = 36.0;
        expResult = -1;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 7
         **********************/
        System.out.println("\tTest Case #7");
        diameter = 3.0;
        height = 0;
        expResult = 0;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         *   Test Case # 8
         **********************/
        System.out.println("\tTest Case #8");
        diameter = 0;
        height = 8.0;
        expResult = 0.0;
        result = instance.calcVolumeOfCylinder(diameter, height);
        assertEquals(expResult, result, 0.0001);
        
}

}