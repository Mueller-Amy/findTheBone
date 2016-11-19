/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.model.Game;
import byui.cit260.findTheBone.model.Item;
import byui.cit260.findTheBone.model.Location;
import byui.cit260.findTheBone.model.Map;
import byui.cit260.findTheBone.model.Player;
import byui.cit260.findTheBone.model.Scene;
import byui.cit260.findTheBone.model.Scene.SceneType;
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
        
        Game game = new Game(); // create new game
        FindTheBone.setCurrentgame(game); // save in FindTheBone
        
        game.setPlayer(player); // save player in game
        
        
        /*
        //create the inventory list and save in the game
        Item[] item = GameControl.createItemList();
        game.setInventory(itemList);
        */


        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // Save map in game
        
        // Move character to starting position in the map
        MapControl.moveCharacterToStartingLocation(map);
        
        
        
        
        
        
        
    }

    public static Item[] createItemList() {
        System.out.println("*** called createItemList() in GameControl ***");
        return null;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] location=map.getLocations();
        
        //start point
        location[0][0].setScene(scenes[SceneType.start.ordinal()]);
        location[0][1].setScene(scenes[SceneType.finish.ordinal()]);
        location[0][2].setScene(scenes[SceneType.zoo.ordinal()]);
        location[0][3].setScene(scenes[SceneType.house.ordinal()]);
        //.....
        
        
    }
    
}
    

