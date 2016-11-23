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
        FindTheBone.setCurrentGame(game); // save in FindTheBone
        
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
        Item[] inventory = 
            new Item[17];
        Item twig = new Item();
        twig.setDescription("Twig");
        twig.setQuantityInStock(0);
        twig.setRequiredAmount(0);
        inventory[twig.ordinal()] = twig;
        
        Item pebble = new Item();
        pebble.setDescription("Pebble");
        pebble.setQuantityInStock(0);
        pebble.setRequiredAmount(0);
        inventory[pebble.ordinal()] = pebble;
        
        Item box = new Item();
        box.setDescription("Box");
        box.setQuantityInStock(0);
        box.setRequiredAmount(0);
        inventory[box.ordinal()] = box;
        
        Item cylinder = new Item();
        cylinder.setDescription("Cylinder");
        cylinder.setQuantityInStock(0);
        cylinder.setRequiredAmount(0);
        inventory[cylinder.ordinal()] = cylinder;
        
        Item paper = new Item();
        paper.setDescription("Paper");
        paper.setQuantityInStock(0);
        paper.setRequiredAmount(0);
        inventory[paper.ordinal()] = paper;
        
        Item ball = new Item();
        ball.setDescription("Ball");
        ball.setQuantityInStock(0);
        ball.setRequiredAmount(0);
        inventory[ball.ordinal()] = ball;
        
        Item fish = new Item();
        fish.setDescription("Fish");
        fish.setQuantityInStock(0);
        fish.setRequiredAmount(0);
        inventory[fish.ordinal()] = fish;
        
        Item cathair = new Item();
        cathair.setDescription("Cat Hair");
        cathair.setQuantityInStock(0);
        cathair.setRequiredAmount(0);
        inventory[cathair.ordinal()] = cathair;
        
        Item catbell = new Item();
        catbell.setDescription("Cat Bell");
        catbell.setQuantityInStock(0);
        catbell.setRequiredAmount(0);
        inventory[catbell.ordinal()] = catbell;
        
        Item lostcatbell = new Item();
        lostcatbell.setDescription("Lost Cat Bell");
        lostcatbell.setQuantityInStock(0);
        lostcatbell.setRequiredAmount(0);
        inventory[lostcatbell.ordinal()] = lostcatbell;
        
        Item catcollar = new Item();
        catcollar.setDescription("Cat Collar");
        catcollar.setQuantityInStock(0);
        catcollar.setRequiredAmount(0);
        inventory[catcollar.ordinal()] = catcollar;
        
        Item nametag = new Item();
        nametag.setDescription("Cat Name Tag");
        nametag.setQuantityInStock(0);
        nametag.setRequiredAmount(0);
        inventory[nametag.ordinal()] = nametag;
        
        Item businesscard = new Item();
        businesscard.setDescription("Business Card");
        businesscard.setQuantityInStock(0);
        businesscard.setRequiredAmount(0);
        inventory[businesscard.ordinal()] = businesscard;
        
        Item treat = new Item();
        treat.setDescription("Twig");
        treat.setQuantityInStock(0);
        treat.setRequiredAmount(0);
        inventory[treat.ordinal()] = treat;
        
        Item duckfeather = new Item();
        duckfeather.setDescription("Duck Feather");
        duckfeather.setQuantityInStock(0);
        duckfeather.setRequiredAmount(0);
        inventory[duckfeather.ordinal()] = duckfeather;
        
        Item peanuts = new Item();
        peanuts.setDescription("Peanuts");
        peanuts.setQuantityInStock(0);
        peanuts.setRequiredAmount(0);
        inventory[peanuts.ordinal()] = peanuts;
        
        
        return inventory;
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
    

