/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import citbyui.cit260.findTheBone.view.ErrorView;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Amy Mueller
 */
public class Map implements Serializable{
    
    //class instance variables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    private Location location;
    private Boolean visited;  
    private Location currentLocation;
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
    
    if (noOfRows<1 || noOfColumns<1) {
       // L12 System.out.println("The number of rows and columns must be > zero");
       ErrorView.display(this.getClass().getName(),"The number of rows and columns must be > zero");
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
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

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.noOfRows;
        hash = 83 * hash + this.noOfColumns;
        hash = 83 * hash + Arrays.deepHashCode(this.locations);
        hash = 83 * hash + this.rowCount;
        hash = 83 * hash + this.columnCount;
        hash = 83 * hash + this.currentRow;
        hash = 83 * hash + this.currentColumn;
        hash = 83 * hash + Objects.hashCode(this.location);
        hash = 83 * hash + Objects.hashCode(this.visited);
        hash = 83 * hash + Objects.hashCode(this.currentLocation);
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
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
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
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", locations=" + locations + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", location=" + location + ", visited=" + visited + ", currentLocation=" + currentLocation + '}';
    }

}
