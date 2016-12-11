/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import byui.cit260.findTheBone.enums.SceneType;
import findthebone.FindTheBone;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Amy Mueller
 */
public class Location implements Serializable{
    
    //class instance variables
    private int rowCount;
    private int columnCount;
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Character> character;
    private SceneType sceneType;
    private String name;
    
    public Location() {
        //Default Setting
        //sceneType = SceneType.Home; 
        this.visited = false;
        
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }

    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.rowCount;
        hash = 29 * hash + this.columnCount;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.column;
        hash = 29 * hash + (this.visited ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.scene);
        hash = 29 * hash + Objects.hashCode(this.character);
        hash = 29 * hash + Objects.hashCode(this.sceneType);
        hash = 29 * hash + Objects.hashCode(this.name);
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (this.sceneType != other.sceneType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + ", character=" + character + ", sceneType=" + sceneType + ", name=" + name + '}';
    }


}
