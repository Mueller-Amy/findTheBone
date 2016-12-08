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
import java.util.ArrayList;

/**
 *
 * @author Amy Mueller
 */
public class Location implements Serializable{
    
    protected final BufferedReader keyboard =FindTheBone.getInFile();
    protected final PrintWriter console =FindTheBone.getOutFile();
    
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Character> Characters;
       
    //constructor function
    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

   
    public ArrayList<Character> getCharacters() {
        return Characters;
    }

    public void setCharacters(ArrayList<Character> Characters) {
        this.Characters = Characters;
    }
     public void setScene(Scene scene) {
        this.scene = scene;
    }

     public Scene getScene() {
        return scene;
    
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.row;
        hash = 23 * hash + this.column;
        hash = 23 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }
 
}
