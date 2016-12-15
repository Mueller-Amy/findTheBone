/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;
import byui.cit260.findTheBone.enums.SceneType;
import byui.cit260.findTheBone.model.BackpackItem;
import byui.cit260.findTheBone.model.Clue;
import byui.cit260.findTheBone.model.Game;
import byui.cit260.findTheBone.model.GameTime;
import byui.cit260.findTheBone.model.Location;
import byui.cit260.findTheBone.model.Map;
import byui.cit260.findTheBone.model.Player;

import byui.cit260.findTheBone.model.Scene;
import citbyui.cit260.findTheBone.exceptions.GameControlException;
import citbyui.cit260.findTheBone.exceptions.MapControlException;
import citbyui.cit260.findTheBone.view.GameMenuView;
import findthebone.FindTheBone;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    private static BackpackItem[] createItemList() {
        return null;
    }

    private static Clue[] createClueList() {
        return null;
    }

    public static void createNewGame(Player player) throws MapControlException, GameControlException {
        
        
        Game game = new Game(); // create new game
       
            game.setPlayer(player); // save player in game
            
            Map map = MapControl.createMap(); //create and initialize new map
            game.setMap(map); // Save map in game
            
            //game.getPlayer().setLocation(map.getLocation());  
            
            GameTime gameTime = new GameTime();
            gameTime.setTimeRemaining(24.0);
              
            // Move character to starting position in the map
            MapControl.movePlayerToStartingLocation(map);
            
            FindTheBone.setCurrentGame(game); // save in FindTheBone
             
    }    
      
    //L12 TA
    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
                
        try(FileOutputStream fops=new FileOutputStream(filePath)) {
            ObjectOutputStream output=new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);//write the game object out to file
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
public static void getSavedGame(String filePath) 
        throws GameControlException {
        System.out.println("\n\nEnter the file path where load the saved game :");
        //filePath=this.getInput();
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();//read the game object from file

            
        }
        catch(Exception ex){
            
            throw new GameControlException("Loading game fail...There is a error reading saved game");
        }
        
        //close the output file
        FindTheBone.setCurrentGame(game);
        System.out.println("\n Game sucessfuly loaded.");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }
    
   static void assignScenesToLocations(Map map, Scene[] scenes) throws GameControlException {
        Location[][] locations = map.getLocations();
        
        try{

            locations[0][0].setScene(scenes[SceneType.Parkland.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.VacantHouse.ordinal()]);
            locations[0][2].setScene(scenes[SceneType.Police.ordinal()]);
            locations[0][3].setScene(scenes[SceneType.AnimalHospital.ordinal()]);
            locations[0][4].setScene(scenes[SceneType.Pound.ordinal()]);
            
            locations[1][0].setScene(scenes[SceneType.Bakery.ordinal()]);
            locations[1][1].setScene(scenes[SceneType.Restaurant.ordinal()]);
            locations[1][2].setScene(scenes[SceneType.DriveInn.ordinal()]);
            locations[1][3].setScene(scenes[SceneType.Lake.ordinal()]);
            locations[1][4].setScene(scenes[SceneType.CatAlley.ordinal()]);
           
            locations[2][0].setScene(scenes[SceneType.CareHome.ordinal()]);
            locations[2][1].setScene(scenes[SceneType.NeighborsHouse.ordinal()]);
            locations[2][2].setScene(scenes[SceneType.YourHouse.ordinal()]);
            locations[2][3].setScene(scenes[SceneType.CatDeVilHouse.ordinal()]);
            locations[2][4].setScene(scenes[SceneType.GroceryStore.ordinal()]);
            
            locations[3][0].setScene(scenes[SceneType.Zoo.ordinal()]);
            locations[3][1].setScene(scenes[SceneType.Fishmonger.ordinal()]);
            locations[3][2].setScene(scenes[SceneType.ZooElephants.ordinal()]);
            locations[3][3].setScene(scenes[SceneType.ZooKangaroos.ordinal()]);
            locations[3][4].setScene(scenes[SceneType.ZooGiraffes.ordinal()]);
           
            locations[4][0].setScene(scenes[SceneType.SchoolEntrance.ordinal()]);
            locations[4][1].setScene(scenes[SceneType.SchoolCafeteria.ordinal()]);
            locations[4][2].setScene(scenes[SceneType.SchoolPlayGround.ordinal()]);
            locations[4][3].setScene(scenes[SceneType.SchoolParking.ordinal()]);
            locations[4][4].setScene(scenes[SceneType.ZooTigers.ordinal()]);
         }            
        catch(Exception ex){
            
            throw new GameControlException("ERROR: THere was a problem with " + 
                    "assigning scenes to lcoation");
        }
    }
    
}
    
