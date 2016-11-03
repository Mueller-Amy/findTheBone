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
    public static Map createMap(String name) {
        
        if (name == null){
            return null;
        }
    
        Map map = new Map();
        map.setName(name);
        
        FindTheBone.setMap(map); // save the map
        
        return map;
    }

    public static void createNewGame(Player player) {
        System.out.println("*** New Game Function displayed. ***");
    }
    
}
