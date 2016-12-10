/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.findTheBone.view;

import byui.cit260.findTheBone.control.MapControl;
import byui.cit260.findTheBone.model.Game;
import byui.cit260.findTheBone.model.Location;
import byui.cit260.findTheBone.model.Map;
import citbyui.cit260.findTheBone.exceptions.MapControlException;
import findthebone.FindTheBone;

/**
 *
 * @author Jean
 */
public class MapView extends View {

//private String promptMessage;

public MapView() {
     super("\n"
     + "\n------------------------------------------"
     + "\n    Enter location you want to move to"
     + "\n------------------------------------------");
}
  @Override
  public boolean doAction(String mapOption) {
     mapOption = mapOption.toUpperCase();
     Game game = FindTheBone.getCurrentGame(); // retreive the game
     Map map = game.getMap(); // retreive the map from game
     Location[][] locations = map.getLocations(); // retreive the locations from map
     for (int row = 0; row < locations.length; row++) {
          for (int column = 0; column < locations[row].length; column++) {
               if (locations[row][column].getScene() != null) {   
                   if (mapOption.equals(locations[row][column].getScene().getMapSymbol())) {
                     try {
                            MapControl.movePlayer(map, row, column);
                        } catch (MapControlException ex) {
                            System.out.println(ex.getMessage());
                        }
                         return true;
                    }
                 }
            }
     }
     System.out.println("\n*** Invalid selection *** Try Again");
     return false;

}
}

