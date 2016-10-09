    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthebone;

import byui.cit260.findTheBone.model.Clue; // Jean Oliveira

import byui.cit260.findTheBone.model.Item; // Jean Oliveira
import byui.cit260.findTheBone.model.ItemsWithin; // Jean Oliveira
import byui.cit260.findTheBone.model.Location; // 
import byui.cit260.findTheBone.model.Map; // 
import byui.cit260.findTheBone.model.Player; // Amy Mueller




/**
 *
 * @author Home
 */
public class FindTheBone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        ItemsWithin itemsWithinOne = new ItemsWithin();
        Clue clueOne = new Clue();
        Item itemOne = new Item();
        Map mapOne = new Map();
        Location locationOne = new Location();
        
        // ==============Class Assign Values tests ==========
         
        //Class Player Assign value test
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        //Class Clue Assign value test - by Jean Oliveira
        clueOne.setAttribute("Giraffes suggest the tigers. Cats stick together.");
         
        //Class Item Assign value test - by Jean Oliveira
        itemOne.setInventory("Fish");
        itemOne.setItemsRemaining("10");
        
        //Class ItemsWithin Assign value test - by Jean Oliveira
        itemsWithinOne.setNoOfItems(40);          
        
        
        //=============== Class print out Tests ============
        
        //Class Player print out test
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);     
                       
        //Class Clue print out test - by Jean Oliveira
        String clueDesc = clueOne.toString();
        System.out.println(clueDesc);
        
        //Class Item  print out test - by Jean Oliveira
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        //Class ItemsWithin print out test - by Jean Oliveira
        String itemsWithinInfo = itemsWithinOne.toString();
        System.out.println(itemsWithinInfo);
        
        
        
        
        
             
        
        
    }
    
}
