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
public class TownsPeople {
    
    //class instance variables.
    private String townsPersonName;
    private double script;

    public TownsPeople() {
    }

    
    
    public String getTownsPersonName() {
        return townsPersonName;
    }

    public void setTownsPersonName(String townsPersonName) {
        this.townsPersonName = townsPersonName;
    }

    public double getScript() {
        return script;
    }

    public void setScript(double script) {
        this.script = script;
    }

    @Override
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
    
    
    
}
