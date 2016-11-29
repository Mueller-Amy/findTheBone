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
public class Clue implements Serializable{
    
    //class instance variable
    private String attribute;
        
    //default constructor
    public Clue() {
    }
        
    //Getter

    public String getAttribute() {
        return attribute;
    }
    
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    //equals(), and hashCode() codes

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.attribute);
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
        final Clue other = (Clue) obj;
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    //toString() code

    @Override
    public String toString() {
        return "Clue{" + "attribute=" + attribute + '}';
    }
    
}
