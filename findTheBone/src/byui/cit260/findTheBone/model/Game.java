/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Keith Downing
 */
public class Game implements Serializable{

    
    
    private GameTime GameTime;
    //private Location currentLocation;
    private Player player;
    private Character character;
    private Backpack backpack;
    private Map map;
    
public Game() {
    }

    public GameTime getGameTime() {
        return GameTime;
    }

    public void setGameTime(GameTime GameTime) {
        this.GameTime = GameTime;
    }
/*
    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
*/
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.GameTime);
      // hash = 11 * hash + Objects.hashCode(this.currentLocation);
        hash = 11 * hash + Objects.hashCode(this.player);
        hash = 11 * hash + Objects.hashCode(this.character);
        hash = 11 * hash + Objects.hashCode(this.backpack);
        hash = 11 * hash + Objects.hashCode(this.map);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.GameTime, other.GameTime)) {
            return false;
        }
       // if (!Objects.equals(this.currentLocation, other.currentLocation)) {
       //     return false;
     //  }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (this.character != other.character) {
            return false;
        }
        if (!Objects.equals(this.backpack, other.backpack)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    
}