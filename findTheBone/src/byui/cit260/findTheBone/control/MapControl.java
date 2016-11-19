/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.model.Map;
import byui.cit260.findTheBone.model.Player;
import byui.cit260.findTheBone.model.Scene;
import byui.cit260.findTheBone.model.Scene.SceneType;

/**
 *
 * @author Home
 */
public class MapControl {
    public static Map createMap() {
        //create the map
        Map map = new Map (5,5);
        
        //create the scenes for the game
        Scene[] scenes= createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map,scenes);
        
        System.out.println("*** called createMap() called ***");
        
        return map;
        
        /*
        
        if (name == null){
            return null;
        }
    
        Map map = new Map();
        map.setName(name);
        
        FindTheBone.setMap(map); // save the map
        
        return map;

        */
    }

    public static void createNewGame(Player player) {
        System.out.println("*** New Game Function displayed. ***");
    }

    static void moveCharacterToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Map createMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        Scene[] scenes=new Scene[SceneType.values().length];
        
        Scene startScene = new Scene();
        startScene.setDescription(
                      "You are at Ben and Nancy house. This is your house too."
                     +"Here is where your investigation start"
                     +"What do you want to do now?"
        );
        startScene.setMapSymbol(" ST ");
        startScene.setBlocked(false);
        startScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()]=startScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("\n***************************************************"
                           + "\n*      Congratulations !!! You found the bone.    *"  
                           + "\n                    GAME OVER                     *"
                           + "\n***************************************************"
        );
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.start.ordinal()]=finishScene;
        
        Scene zooScene = new Scene();
        zooScene.setDescription(
                "The zoo is a good place to ask about the bone.");
       
        zooScene.setMapSymbol(" ZS ");
        zooScene.setBlocked(false);
        zooScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.start.ordinal()]=zooScene;
        
        
       
        
        
        return scenes;
        
        
    }
    
}
