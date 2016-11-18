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
 * @author Keith College
 */
public enum TownsPeople implements Serializable{
    Tommy("He is at the park."),
    Pete("Officer Pete is a police officer."),
    Mice("Works at the Animal Hospital"),
    Sam("Mr. Sam works at the animal pound."),
    Jones("The bakery is where he works."),
    Steele("He works at the restaurant."),
    Coco("She works at the drive inn."),
    Gang("Tom, Rex, and Kit hangout in Cat Alley."),
    Ellie("Works at the Care Home."),
    Smiths("Neighbor's to you."),
    DeVil("The DeVil lives here"),
    Nono("Zookeeper at the zoo."),
    Catch("Fishmonger, works down at the docks."),
    Elephants("Animals at the zoo."),
    Kangaroos("Animals at the zoo."),
    Giraffes("Animals at the zoo."),
    Brad("He is at the school."),
    Jane("She works at the School Cafeteria."),
    Sebastian("Boy at the School Playground."),
    Sneed("He is at his car in the School Parking Lot."),
    Tigers("Animals at the Zoo.");
    
    //class instance variables.
    private final String description;
    private final Point coordinates;
    //private double script;
    TownsPeople(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    /*public TownsPeople() {
    }
    */
    
    public String getDescription() {
        return description;
    }
    public Point getCoordinates() {
        return coordinates;
    }

    private static class Point {

        public Point() {
        }

        private Point(int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
    //public double getScript() {
      //  return script;
    //}

    //public void setScript(double script) {
      //  this.script = script;
    //}

   /* @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.townsPersonName);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.script) ^ (Double.doubleToLongBits(this.script) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "TownsPeople{" + "townsPersonName=" + townsPersonName + ", script=" + script + '}';
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
        final TownsPeople other = (TownsPeople) obj;
        if (Double.doubleToLongBits(this.script) != Double.doubleToLongBits(other.script)) {
            return false;
        }
        if (!Objects.equals(this.townsPersonName, other.townsPersonName)) {
            return false;
        }
        return true;
    }
    
    
  */  
