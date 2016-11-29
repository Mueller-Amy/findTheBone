/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amy Mueller
 */

/* WE DON'T HAVE PRIVATE POINT COORDINATES WK 10 STEP 2*/
public enum Character implements Serializable{
    
    Joe("As a Doberman Pinscher, Joes is alert, fearless, and loyal."),
    Sally("Sally, the Basset Hound, is easygoing, laid-back and loves her family."),
    Bernie("As a Newfoundland, Bernie is patient and devoted."),
    Trish("Trish is a beautiful Cavalier King Charles Spaniel and is incredibly graceful."),
    Charlie("This Beagle is happy, excited, and sure can hunt!");
    //class instance variables
   
    private final String description;
    private final Point coordinates;
   
    

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
       
    }

   /* public String getName() {//delete for wk 10 step 2
        return name;
    }

    public void setName(String name) {
        this.name = name;
  */
    public String getDescription() {
        return description;
    }
    
    private Point getCoordinates() {
        return coordinates;
    }

   
    /*public void setDescription(String description) {
        this.description = description;
    }*/
    
    private static class Point {
        
        public Point(){
        }

        private Point(int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

  }

  
  
  

  /*  DELETE FROM WEEK 10 PAGE6 
        @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    */
    /*@Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + '}';
    }*/
    
    

    

