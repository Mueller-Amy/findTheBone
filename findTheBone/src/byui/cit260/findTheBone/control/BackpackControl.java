/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.model.BackpackItem;
import java.io.Serializable;
import java.util.ArrayList;




/**
 *
 * @author Home
 */
public class BackpackControl implements Serializable{
    
    private final ArrayList<BackpackItem> items;
           
    BackpackControl(){
        items = new ArrayList<>();
        
    }
    public void addItem(BackpackItem item){
        
        items.add(item);  
    }
    public void removeItem(String name) {
       
        for(BackpackItem item : items){
           
           if(item.getName().contains(name)) {
               items.remove(item);
           }
        }
   }
    //gives you the total no of items in the backpack follow the code on mapcontrol on line 401
    public int TotalNoOfItem(){
        int count = 0;
        
        for(BackpackItem item : items){
            count++;
        }
        return count;
    }
    
    public BackpackItem getItem(int index){
        int count = 0;
        
        for(BackpackItem item : items){
            if(count == index)
                return item;            
            count++;
            
        }
        return null; 
    }
}