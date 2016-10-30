/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.model.Player;
import findthebone.FindTheBone;

/**
 *
 * @author Keith Downing
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
    
        Player player = new Player();
        player.setName(name);
        
        FindTheBone.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("*** New Game Function displayed. ***");
    }

    
    
}
    

