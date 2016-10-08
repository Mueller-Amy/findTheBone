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
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
             
        
        
    }
    
}
