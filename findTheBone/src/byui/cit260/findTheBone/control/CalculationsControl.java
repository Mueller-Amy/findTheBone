/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import citbyui.cit260.findTheBone.exceptions.CalculationsControlException;

/**
 *
 * @author Home
 */
public class CalculationsControl {
    
        //Group work for volume of a box

        public double calcVolumeOfBox(double length, double width, double height)
                throws CalculationsControlException 
                        {
    
           /*if (length<=0 OR length>6) THEN
               RETURN -1
           if (width<=0 OR width>6) THEN
                   RETURN -1
           if (height<=0 OR height>6) THEN
                   RETURN -1
           volume = legth*width*height
           RETURN area; */
                
           if (length <= 0 || length > 6 ){//length out of range??
               //return -1;
               throw new CalculationsControlException ("Length out of range"
                       + "Please enter a number between 0 and 6.");
           }
           if (width <= 0 || width > 6 ) {//width out of range??
              // return -1;
               throw new CalculationsControlException ("Width out of range"
                       + "Please enter a number between 0 and 6.");
           }
           if (height <= 0 || height >6){//height out of range??
               //return -1;
                throw new CalculationsControlException ("Height out of range"
                       + "Please enter a number between 0 and 6.");
           }
           
           double volume = (length * width * height);
           
           return volume; 
           }
           
           //Amy Mueller Calculate Area of Box
        public double calcAreaOfBox(double length, double width)
                    throws CalculationsControlException {
        if (length < 0 || length > 6 ){//length out of range??
               //return -1; deleted week 11 team assign.
               throw new CalculationsControlException("Length must be between 0-6 "
               + "please reenter the length");
           }
           if (width < 0 || width > 6 ) {//width out of range??
               //return -1;
               throw new CalculationsControlException("Width must be between 0-6 "
               + "please reenter the width");
            }
           double area = (length * width);
           
           return area;
           }
    
           // Jean Oliveira - Rectangle Diagonal Calculation
        public double calcDiagonalRectangle(double length,double width)
                    throws CalculationsControlException {
        if (length < 0 || width <0) { // if length or width is negative					
           //return -1;
           throw new CalculationsControlException("Length and width cannot be "
               + "negative. Please reenter number. ");	
        }
        if (length == width) {   //if lenght=width it's not a rectangle				
           //return -1;
            throw new CalculationsControlException("Length and width cannot "
               + "be the same number. Please reenter number. ");
            }
        if (width < 3 || width > 7) { // width out of range??					
           //return -1;
           throw new CalculationsControlException("Width is out of range."
               + " Please reenter number between 3 and 7. ");
            }
        if (length <5 || length > 12) { // length out of range??
           //return -1;	
           throw new CalculationsControlException("Length is out of range."
               + " Please reenter number between 5 and 12. ");
            }					
            double diagonal =Math.sqrt(Math.pow(length,2)+ Math.pow(width,2));
            
            return diagonal;	
    }
            // Keith Downing - Volume of a Cylinder Calculation.

    
    public double calcVolumeOfCylinder (double diameter, double height)
                    throws CalculationsControlException {
            if (diameter < 0 || diameter > 3){
                  throw new CalculationsControlException("Diameter is out of range."
               + " Please reenter number between 0 and 3. ");
            }
                //return -1;
                
            if (height < 0 || height > 8){
                //return -1;
                     throw new CalculationsControlException("Diameter is out of range."
               + " Please reenter number between 0 and 8. ");
            }
            
            double volume =(diameter * Math.PI * height);
            return volume;
        }
}			

    

