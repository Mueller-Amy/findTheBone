/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthebone;

import byui.cit260.findTheBone.model.Backpack;
import byui.cit260.findTheBone.model.Clue; // Jean Oliveira
import byui.cit260.findTheBone.model.Game; // Keith Downing
import byui.cit260.findTheBone.model.Item; // Jean Oliveira
import byui.cit260.findTheBone.model.ItemsWithin; // Jean Oliveira
import byui.cit260.findTheBone.model.Location; // Amy Mueller
import byui.cit260.findTheBone.model.Map; // Amy Mueller

import byui.cit260.findTheBone.model.Player; // Amy Mueller
import byui.cit260.findTheBone.model.Scene; // Keith Downing
import byui.cit260.findTheBone.model.TownsPeople;
import byui.cit260.findTheBone.model.Character; 

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
       
      
        Game gameOne = new Game();
        
        Scene descriptionOne = new Scene();
        TownsPeople townsPeopleOne = new TownsPeople();
        Map mapOne = new Map();
        Location locationOne = new Location();
        Backpack backpackOne = new Backpack();
        Character characterOne = new Character();
        
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
        
        // Class Game value test - Keith Downing
        gameOne.setTotalTime("8:59");
        
        //Class TownsPeople value test - Keith Downing
        townsPeopleOne.setTownsPersonName(" Darth Keith ");
        
        
        //Class Scene value test - Keith Downing
        descriptionOne.setDescription("Frozen Planet of Hoff");
        
        //Class TownsPeople value test - Keith Downing
        
        //Class Map Assign value test-Amy Mueller
       
       mapOne.setRowCount(12);
       mapOne.setColumnCount(6);
       mapOne.setCurrentRow(10);
       mapOne.setCurrentColumn(5);
       
      
       //Class Location Assign value test- Amy Mueller
        locationOne.setRow (7);
        locationOne.setColumn(6);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(5);
        
       //Class Backpack Assign value test- Amy Mueller
        backpackOne.setMaxVolume (20);
        backpackOne.setAmountContained(10);
        
       //Class Character Assign value test-Amy Mueller
       characterOne.setName("Freddy Flinstone");
       characterOne.setDescription("Big head");
        
        
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
        
        //Class gameOne print out test - Keith Downing
        String gameOneInfo = gameOne.toString();
        System.out.println(gameOne);
        
        //Class TownsPerson print out test - Keith Downing
        String townsPeopleInfo = townsPeopleOne.toString();
        System.out.println(townsPeopleOne);
                
        
        //Class Scene print out test - Keith Downing
        String descriptionInfo = descriptionOne.toString();
        System.out.println(descriptionOne);
        
        //Class Map print out test-Amy Mueller
       String mapInfo = mapOne.toString();
       System.out.println(mapInfo);
       
       //Class Location print out test- Amy Mueller
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        //Class Backpack print out test- Amy Mueller
        String backpackInfo = backpackOne.toString();
        System.out.println(backpackInfo);
        
        //Class Character print out test- Amy Mueller
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
           
        
             
        
        
    }
    
}
