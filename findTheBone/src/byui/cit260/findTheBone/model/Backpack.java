/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import java.io.Serializable;

/**
 *
 * @author Amy Mueller
 */
public class Backpack implements Serializable{
    
    //class instance variables
    private int maxVolume;
    private int amountContained;
    
    //constructor functions

    public Backpack() {
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getAmountContained() {
        return amountContained;
    }

    public void setAmountContained(int amountContained) {
        this.amountContained = amountContained;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.maxVolume;
        hash = 83 * hash + this.amountContained;
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
        final Backpack other = (Backpack) obj;
        if (this.maxVolume != other.maxVolume) {
            return false;
        }
        if (this.amountContained != other.amountContained) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Backpack{" + "maxVolume=" + maxVolume + ", amountContained=" + amountContained + '}';
    }
    
    
}