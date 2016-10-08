/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthebone;

import byui.cit260.findTheBone.model.Clue; // Jean Oliveira
import byui.cit260.findTheBone.model.Game; // Keith Downing
import byui.cit260.findTheBone.model.Item; // Jean Oliveira
import byui.cit260.findTheBone.model.ItemsWithin; // Jean Oliveira
import byui.cit260.findTheBone.model.Location; // Jean Oliveira
import byui.cit260.findTheBone.model.Map; // Jean Oliveira
import byui.cit260.findTheBone.model.Player; // Amy Mueller
import byui.cit260.findTheBone.model.TownsPeople; // Keith Downing



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
        Game gameOne = new Game();
        TownsPeople townsPeopleOne = new TownsPeople();
        ItemsWithin itemsWithinOne = new ItemsWithin();
        Clue clueOne = new Clue();
        Item itemOne = new Item();
        Map mapOne = new Map();
        Location locationOne = new Location();
        
        
        //Class Player set test
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
               
        
        //Class Player print out test
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
             
        
        
    }
    
}
