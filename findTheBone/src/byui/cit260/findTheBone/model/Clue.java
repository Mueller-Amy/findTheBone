/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import java.io.Serializable;

/**
 *
 * @author Jean Oliveira
 */
public enum Clue implements Serializable {
    
    Clue1("Dog at C2 says he saw DeVil in your yard, then DeVil went north"),
    Clue2("Officer Pete says he thought he saw DeVil come from the vacant house, but didn’t see a bone. "),
    Clue3("Miss Ellie says he thought he saw DeVil heading for the zoo"),
    Clue4("Mr. Jones (bakery) didn’t see DeVil, but gives you a treat."),
    Clue5("Mr. Nono suggests Fishmongers.  After all, every cat likes fish."),
    Clue6("Fishmongers hasn’t seen DeVil. But gives you a fish."),
    Clue7("Elephants say they thought they saw DeVil by the giraffes."),
    Clue8("Giraffes suggest the tigers.  Cats stick together."),
    Clue9("Tigers have seen him but wants something for the information." 
	    + "You give the tigers the fish. They tell you DeVil is hiding in a box."
		+ "You find the box and calculate Box Volume. If DeVil can fit in it. "),
    Clue10("Mr. Sneed suggests the warehouse.  He saw Mr. Sam chasing him, but he didn’t catch him.."),
    Clue11("DeVils Gang runs you out of the alley.  And you head to the restaurant."),
    Clue12("Restaurant Owner, see you and gives you a new bone in your backpack."),
    Clue13("Tommy suggests the pond."),
    Clue14("Do you remember anything about the east side of the yard?.");
    
    private final String description;
    
    Clue(String description) {
        this.description = description;

    }
    public String getDescription() {
        return description;
    }    
}

