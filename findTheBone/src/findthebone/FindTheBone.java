/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthebone;

import byui.cit260.findTheBone.control.LocationControl.Locations;
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
import citbyui.cit260.findTheBone.view.StartProgramView;

/**
 *
 * @author Home
 */
public class FindTheBone {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static Map currentMap= null;
    private static Locations currentLocations = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FindTheBone.currentGame = currentGame;
    }
    public static Map getCurrentMap(Map currentMap) {
        return currentMap;
    }

    public static void setCurrentMap(Map currentMap) {
        FindTheBone.currentMap = currentMap;
    }
    public static Game getCurrentLocations() {
        return currentGame;
    }

    public static void setCurrentLocations(Locations currentLocations) {
        FindTheBone.currentLocations = currentLocations;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FindTheBone.player = player;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
           
        
             
        
        
    }

   
        
    
    

    

    
    
}
