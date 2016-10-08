/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import java.io.Serializable;

/**
 *
 * @author Jean Oliveira
 */
public class ItemsWithin implements Serializable {
     
    //class instance variable
    private double noOfItems;
    
    //default constructor
    public ItemsWithin() {
    }
        
    //Getters and Setters
    public double getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(double noOfItems) {
        this.noOfItems = noOfItems;
    }
    
    //equals(), and hashCode() codes

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noOfItems) ^ (Double.doubleToLongBits(this.noOfItems) >>> 32));
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
        final ItemsWithin other = (ItemsWithin) obj;
        if (Double.doubleToLongBits(this.noOfItems) != Double.doubleToLongBits(other.noOfItems)) {
            return false;
        }
        return true;
    }
    
    //toString() code

    @Override
    public String toString() {
        return "ItemsWithin{" + "noOfItems=" + noOfItems + '}';
    }
    
    
}
