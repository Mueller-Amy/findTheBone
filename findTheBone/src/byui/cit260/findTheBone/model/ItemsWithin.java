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
 * @author Jean Oliveira
 */
public class ItemsWithin implements Serializable {
     
    //class instance variable
    private int noOfItems;
    
    //default constructor
    public ItemsWithin() {
    }
        
    //Getters and Setters
    
    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }
    
    public enum Item {
        twig,
        pebble,
        box,
        cylinder,
        paper,
        ball,
        fish,
        cathair,
        catbell,
        catcollar,
        nametag,
        businesscard,
        treat,
        duckfeather,
        peanuts;
        
    }
    
    //equals(),hashCode() and toString() codes

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.noOfItems;
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
        if (this.noOfItems != other.noOfItems) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemsWithin{" + "noOfItems=" + noOfItems + '}';
    }
    
    
    
    
}
