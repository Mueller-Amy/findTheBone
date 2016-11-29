/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import byui.cit260.findTheBone.control.LocationControl.Locations;
import java.io.Serializable;

/**
 *
 * @author Amy Mueller
 */
public class Map implements Serializable{
/*
    public static void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    //class instance variables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    
    //constructor function

    /**
     *
     * @param noOfRows
     * @param noOfColumns
     */
    public Map(int noOfRows, int noOfColumns) {
    
    if (noOfRows<1 || noOfColumns<1) {
        System.out.println("The number of rows and columns must be > zero");
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
    
 
    
     //begin getter and setter functions

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.rowCount;
        hash = 47 * hash + this.columnCount;
        hash = 47 * hash + this.currentRow;
        hash = 47 * hash + this.currentColumn;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        return true;
    }
/*
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }
    
    public  Location[][] getLocations() {
        
        
        
    } 
    

    public Location getCurrentLocation() {
        
        
    
                }
    public Map getMap() {
        
        
                }
 

}   
*/

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}