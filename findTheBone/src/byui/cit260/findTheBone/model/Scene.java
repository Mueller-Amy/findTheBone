/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;
import byui.cit260.findTheBone.enums.SceneType;
import citbyui.cit260.findTheBone.exceptions.GameControlException;
import findthebone.FindTheBone;
import java.io.BufferedReader;
import java.io.Serializable;
import java.util.Objects;
import java.io.PrintWriter;
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
    private Clue clue; 
    private String mapSymbol;
    private String dialog;
    private Character character;
    private TownsPeople townspeople;
    private BackpackItem item;
    public int minute;

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
    public Scene() {
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

    public TownsPeople getTownspeople() {
        return townspeople;
    }

    public void setTownspeople(TownsPeople townspeople) {
        this.townspeople = townspeople;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }
    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDialog() {
        return dialog;
    }
    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public Character getCharacter() {
        return character;
    }
    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public TownsPeople getTownsPeople() {
        return townspeople;
    }
    
     public void setTownsPeople(TownsPeople townspeople) {
        this.townspeople = townspeople;
    }

    public Clue getClue() {
        return clue;
    }
    public void setClue(Clue clue) {
        this.clue = clue;
    }

    public BackpackItem getItem() {
        return item;
    }
    public void setItem(BackpackItem item) {
        this.item = item;
    }
    public void setBackpack(BackpackItem backpackItem) {
        this.item = item;
    }    

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
   
    @Override
     public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.mapSymbol);
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + Objects.hashCode(this.dialog);
        hash = 19 * hash + Objects.hashCode(this.character);
        hash = 19 * hash + Objects.hashCode(this.clue);
        hash = 19 * hash + Objects.hashCode(this.item);
        hash = 19 * hash + Objects.hashCode(this.minute);
        return hash;
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.dialog, other.dialog)) {
            return false;
        }
        if (this.character != other.character) {
            return false;
        }
        if (this.clue != other.clue) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        if (!Objects.equals(this.minute, other.minute)) {
            return false;
        }
        return true;
	
    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", mapSymbol=" + mapSymbol + ", description=" + description + ", dialog=" + dialog + ", character=" + character + ", clue=" + clue + ", item=" + item + ", minute=" + minute + '}';
    
    
}
