/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.model.Location;

/**
 *
 * @author Home
 */
public class LocationControl {

    public static Location[][] currentLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public LocationControl(int noOfColumns, int noOfRows) {
       
             
            int[][] Locations={
                {11,12,13,14,15},
                {21,22,23,24,25},
                {31,32,33,34,35},
                {41,42,43,44,45},
                {51,52,53,54,55}


        };
        
    }

    public static class Locations {

        public Locations(int noOfRows, int noOfColumns) {
                 Locations[][] currentLocation = new Locations[noOfRows][noOfColumns];
                 
        }
        public long getTotalLocations(int [][] currentLocation, Iterable<int[]> Locations) {
            long total=0; // initializa total to zero
            
            //navigating a two dimentioal array using for-each
            for (int[] row:Locations) {
                for (int column:row) {
                    total += column;
                }
            }
            return total;
        }
    }
    
    
}
