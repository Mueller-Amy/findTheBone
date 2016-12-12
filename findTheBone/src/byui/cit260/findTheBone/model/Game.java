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
   // private Location[][] location;
  // private Location currentLocation;
    private Player player;
    //private Character character;
   // private Backpack backpack;
    private Map map;
    
public Game() {
    }

    public GameTime getGameTime() {
        return GameTime;
    }

    public void setGameTime(GameTime GameTime) {
        this.GameTime = GameTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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
        hash = 53 * hash + Objects.hashCode(this.GameTime);
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.map);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "GameTime=" + GameTime + ", player=" + player + ", map=" + map + '}';
    }

}