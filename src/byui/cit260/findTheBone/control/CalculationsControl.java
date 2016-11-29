/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

/**
 *
 * @author Home
 */
public class CalculationsControl {
    
        //Group work for volume of a box

        public double calcVolumeOfBox(double length, double width, double height){
    
           /*if (length<=0 OR length>6) THEN
               RETURN -1
           if (width<=0 OR width>6) THEN
                   RETURN -1
           if (height<=0 OR height>6) THEN
                   RETURN -1
           volume = legth*width*height
           RETURN area; */
                
           if (length <= 0 || length > 6 ){//length out of range??
               return -1;
           }
           if (width <= 0 || width > 6 ) {//width out of range??
               return -1;
           }
           if (height <= 0 || height >6){//height out of range??
               return -1;
           }
           
           double volume = (length * width * height);
           
           return volume; 
           }
           
           //Amy Mueller Calculate Area of Box
        public double calcAreaOfBox(double length, double width){
        if (length < 0 || length > 6 ){//length out of range??
               return -1;
           }
           if (width < 0 || width > 6 ) {//width out of range??
               return -1;
            }
           double area = (length * width);
           
           return area;
           }
    
           // Jean Oliveira - Rectangle Diagonal Calculation
        public double calcDiagonalRectangle(double length,double width) {
        if (length < 0 || width <0) { // if length or width is negative					
           return -1;
            }					
        if (length == width) {	//if lenght=width it's not a rectangle				
           return -1;
            }
        if (width < 3 || width >7) { // width out of range??					
           return -1;
            }
        if (length <5 || length >12) { // length out of range??
           return -1;	
            }					
            double diagonal =Math.sqrt(Math.pow(length,2)+ Math.pow(width,2));					
            return diagonal;	
    }
            // Keith Downing - Volume of a Cylinder Calculation.
        public double calcVolumeOfCylinder(double diameter, double height){
            if (diameter < 0 || diameter > 3)
                return -1;
            if (height < 0 || height > 8)
                return -1;
            
            double volume =(diameter * Math.PI * height);
            return volume;
        }
          				

    }

