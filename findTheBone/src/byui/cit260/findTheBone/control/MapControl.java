/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.model.Map;
import byui.cit260.findTheBone.model.Player;
import findthebone.FindTheBone;

/**
 *
 * @author Home
 */
public class MapControl {
    public static Map createMap() {
        Map map = null;
        
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
    
}
