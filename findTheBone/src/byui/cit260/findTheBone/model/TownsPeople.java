/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import java.io.Serializable;
/**
 *
 * @author Keith Downing
 */
public enum TownsPeople implements Serializable{
    Tommy("He is at the park."),
    Loren("Ms Loren works at Vacant House"),
    Pete("Officer Pete is a police officer."),
    Mice("Works at the Animal Hospital"),
    Sam("Mr. Sam works at the animal pound."),
    Jones("The bakery is where he works."),
    Steele("He works at the restaurant."),
    Coco("She works at the drive inn."),
    Duck("Works sales drink at lake"),
    Gang("Tom, Rex, and Kit hangout in Cat Alley."),
    Ellie("Works at the Care Home."),
    Smiths("Neighbor's to you."),
    Ben("Mr Ben. "),
    DeVil("The DeVil lives here"),
    Tob("Works at Grocery Store Warehouse"),
    Nono("Zookeeper at the zoo."),
    Catch("Fishmonger, works down at the docks."),
    Elephants("Animals at the zoo."),
    Kangaroos("Animals at the zoo."),
    Giraffes("Animals at the zoo."),
    Brad("He is at the school."),
    Jane("She works at the School Cafeteria."),
    Sebastian("Boy at the School Playground."),
    Sneed("He is at his car in the School Parking Lot."),
    Tigers("Animals at the Zoo.");
    
    //class instance variables.
    private final String description;
    //private double script;
    TownsPeople(String description){
        this.description = description;
//        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    
}
}   