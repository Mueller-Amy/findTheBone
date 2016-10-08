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
public class Item implements Serializable{
    
    //class instance variable
    private String inventory;
    private String itemsRemaining;
        
    //default constructor
    public Item() {
    }
             
    //Getters and Setters
    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getItemsRemaining() {
        return itemsRemaining;
    }

    public void setItemsRemaining(String itemsRemaining) {
        this.itemsRemaining = itemsRemaining;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.inventory);
        hash = 41 * hash + Objects.hashCode(this.itemsRemaining);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.itemsRemaining, other.itemsRemaining)) {
            return false;
        }
        return true;
    }

    //toString() code
    @Override
    public String toString() {
        return "Item{" + "inventory=" + inventory + ", itemsRemaining=" + itemsRemaining + '}';
    }
    
}
