/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.model;

import java.io.Serializable;

/**
 *
 * @author Jean
 */
public enum BackpackItem implements Serializable{

    Bone("Steak Bone you just got it! And it's Gone!"),
    Badge("Ben puts your police official Pete badge on."),
    Bacon("Bacon, Cat DiVil's favorit snack, too! Keep this."),
    Bell("Its Cat DeVils Bell. She lost it here. Keep this."),
    Box("Lets keep the box for evidence. She was in it."),
    CatColar("Cat DeVil's red cat colar. Major evidence to keep."),
    CatHair("Cat DeVil's Hair. Need that for evidence."),
    FishBones("Fishbones! She was here! Need this for evidence!"),
    Pipe("Found the pipe! It smells like Cat DeVil napped here."),
    CatHairballs("Yuk,Cat Hairballs. She spits out all over the place!!");
    
    private final String name;

    BackpackItem(String description){
        this.name = description;
    }
    public String getName() {
        return name;
    }
    
}