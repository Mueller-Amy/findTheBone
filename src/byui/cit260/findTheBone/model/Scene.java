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
 * @author Keith Downing
 */
public class Scene implements Serializable{
    
    private String description;
    private double travelTime;
    private double displaySymbol;
    private double blockedLocation;

    public  Scene() {
        
    }

    public void setMapSymbol(String _st_) {
       System.out.println("\n setMapSymbol function called. ");
    }

    public void setBlocked(boolean b) {
        System.out.println("\n setBlocked function called. ");
    }

    
    
    public enum SceneType {
        start,
        house,
        yard,
        zoo,
        school,
        others_scenes,
        instructions,
        finish;

        
        
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(double displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.displaySymbol) ^ (Double.doubleToLongBits(this.displaySymbol) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.blockedLocation) ^ (Double.doubleToLongBits(this.blockedLocation) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", displaySymbol=" + displaySymbol + ", blockedLocation=" + blockedLocation + '}';
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.displaySymbol) != Double.doubleToLongBits(other.displaySymbol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.blockedLocation) != Double.doubleToLongBits(other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
