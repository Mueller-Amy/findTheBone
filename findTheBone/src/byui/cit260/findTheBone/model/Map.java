/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import findthebone.FindTheBone;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author Amy Mueller
 */
public class Map implements Serializable{
    
    //class instance variables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    private Location currentLocation;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
    
    if (noOfRows<1 || noOfColumns<1) {
       // L12 System.out.println("The number of rows and columns must be > zero");
       ErrorView.display(this.getClass().getName),
                "The number of rows and columns must be > zero");
        return;
    }
    this.noOfRows=noOfRows;
    this.noOfColumns=noOfColumns;
    
    //create 2-D array for Locations objects
    this.locations=new Location[noOfRows][noOfColumns];
    
    for (int row=0;row < noOfRows; row++) {
        for (int column=0;column < noOfColumns; column++) {
            //create and initialize new Location object instance
            Location location=new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            //assign the Location object to the current position in  array
            locations[row][column]=location;
        }
    }
    
}

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    //begin getter and setter functions
    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }
    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
   
}
