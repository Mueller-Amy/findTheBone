/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;
import byui.cit260.findTheBone.enums.SceneType;
import citbyui.cit260.findTheBone.exceptions.GameControlException;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Keith Downing
 */
public class Scene implements Serializable{
    
    private String description;
    private double travelTime;
    private double displaySymbol;
    private double blockedLocation;
    private String name;
    private String mapSymbol;
    private String dialog;
    private Character character;
    private TownsPeople townspeople;
    private Item item;
    private int minute;

    public  Scene() {
        this.description = "";
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) throws GameControlException {
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

    public void setMapSymbol(String _st_) {
      // L12 System.out.println("\n setMapSymbol function called. ");
      this.console.println("\n setMapSymbol function called.");
    }

    public void setBlocked(boolean b) {
       // L 12 System.out.println("\n setBlocked function called. ");
       this.console.println("\n setBlocked function called.");
    }

      

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(double displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.displaySymbol) ^ (Double.doubleToLongBits(this.displaySymbol) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.blockedLocation) ^ (Double.doubleToLongBits(this.blockedLocation) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", displaySymbol=" + displaySymbol + ", blockedLocation=" + blockedLocation + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.displaySymbol) != Double.doubleToLongBits(other.displaySymbol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.blockedLocation) != Double.doubleToLongBits(other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

        
    
    
}
