/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;

import byui.cit260.findTheBone.enums.SceneType;
import byui.cit260.findTheBone.model.Map;
import byui.cit260.findTheBone.model.Scene;
import byui.cit260.findTheBone.model.BackpackItem;
import byui.cit260.findTheBone.model.Clue;
import byui.cit260.findTheBone.model.Location;
import byui.cit260.findTheBone.model.Player;
import byui.cit260.findTheBone.model.TownsPeople;
import citbyui.cit260.findTheBone.exceptions.GameControlException;
import citbyui.cit260.findTheBone.exceptions.MapControlException;
import findthebone.FindTheBone;

/*
 *
 * @author Jean Oliveira
 */

public class MapControl {

  
    
     
    public static Map createMap() throws MapControlException, GameControlException {
        //create the map
        Map map = new Map (5,5);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
       // gameTime.getTimeRemaining();
        
        GameControl.assignScenesToLocations(map,scenes);
       // map.setLocation(map.getLocations()[2][2]);
  return map;
    }

       
        public static void movePlayerToStartingLocation(Map map) throws MapControlException {
                      
        movePlayer(map, 2, 2);
       
    }

       public static void movePlayer(Map map, Location location) 
        throws MapControlException {
        
        Player player = FindTheBone.getCurrentGame().getPlayer();
        
        try{
            player.setLocation(location);
        
        }
        catch(Exception ex){
                                    
            throw new MapControlException("ERROR: There was a problem with "
                    + "moving the player.");
        }
        }
     
        
    
    public static void movePlayer(Map map, int row, int column) throws MapControlException {
        if (row < 0 || row >= map.getNoOfRows() || 
            column < 0 || column >= map.getNoOfColumns()) {
            throw new MapControlException("You can't move to this location");
        }

       
            map.setCurrentLocation(map.getLocations()[row][column]);
            map.getCurrentLocation().setVisited(true);
            map.setCurrentRow(row);
            map.setCurrentColumn(column);
        //   FindTheBone.getCurrentGame().getPlayer().setLocation(map.getLocation());
            
        }

    private static Scene[] createScenes() throws MapControlException{
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
       
        try{
            
            Scene currentScene = null;
            
            //location 0,0
            currentScene = new Scene();
            currentScene.setName("Parkland");
            currentScene.setMapSymbol("PK");      
            currentScene.setDescription("A beautiful city park with mature oak trees, grass, and picnic tables.");
            currentScene.setDialog("I saw Cat DeVil and he went that way.");
            currentScene.setTownsPeople(TownsPeople.Tommy);
            currentScene.setClue(Clue.Clue1);
            currentScene.setBackpackItem(BackpackItem.CatHairballs);
            currentScene.setMinute(5);

            scenes[SceneType.Parkland.ordinal()] = currentScene;

            //location 0,1
            currentScene = new Scene();
            currentScene.setName("VacantHouse");
            currentScene.setMapSymbol("VH");      
            currentScene.setDescription("An old abandon house, very creepy.");
            currentScene.setDialog("My bone must be hear. I can smell it.");
            currentScene.setTownsPeople(TownsPeople.Loren);
            currentScene.setClue(Clue.Clue9);
            currentScene.setBackpackItem(BackpackItem.FishBones);
            currentScene.setMinute(5);

            scenes[SceneType.VacantHouse.ordinal()] = currentScene;

            //location 0,2
            currentScene = new Scene();
            currentScene.setName("Police");
            currentScene.setMapSymbol("PL");      
            currentScene.setDescription("Police Headquarters and Training Center.");
            currentScene.setDialog("Hi Buddy how you doing? On the hunt for Cat DeVil?");
            currentScene.setTownsPeople(TownsPeople.Pete);
            currentScene.setClue(Clue.Clue10);
            currentScene.setBackpackItem(BackpackItem.Badge);
            currentScene.setMinute(5);

            scenes[SceneType.Police.ordinal()] = currentScene;

            //location 0,3
            currentScene = new Scene();
            currentScene.setName("AnimalHospital");
            currentScene.setMapSymbol("AH");      
            currentScene.setDescription("The only animal emergency hospital in the city.");
            currentScene.setDialog("Hello there? Looking for that darn cat?");
            currentScene.setTownsPeople(TownsPeople.Mice);
            currentScene.setClue(Clue.Clue5);
            currentScene.setBackpackItem(BackpackItem.Bell);
            currentScene.setMinute(5);

            scenes[SceneType.AnimalHospital.ordinal()] = currentScene;

            //location 0,4
            currentScene = new Scene();
            currentScene.setName("Pound");
            currentScene.setMapSymbol("PD");      
            currentScene.setDescription("This is the pound where stray animals are kept.");
            currentScene.setDialog("I saw Cat DeVil. He was looking for his gang and left.");
            currentScene.setTownsPeople(TownsPeople.Sam);
            currentScene.setClue(Clue.Clue13);
            currentScene.setMinute(5);

            scenes[SceneType.Pound.ordinal()] = currentScene;

            //location 1, 0
            currentScene = new Scene();
            currentScene.setName("Bakery");
            currentScene.setMapSymbol("BK");      
            currentScene.setDescription("Fresh baked goods and your favorite plase for bacon donuts.");
            currentScene.setDialog("Would you like some bacon?");
            currentScene.setTownsPeople(TownsPeople.Jones);
            currentScene.setClue(Clue.Clue4);
            currentScene.setBackpackItem(BackpackItem.Bacon);
            currentScene.setMinute(5);

            scenes[SceneType.Bakery.ordinal()] = currentScene;

            //location 1, 1
            currentScene = new Scene();
            currentScene.setName("Restaurant");
            currentScene.setMapSymbol("RT");      
            currentScene.setDescription("A seafood resturant and Cat Devils favorite place to dine.");
            currentScene.setDialog("If that cat was here, I would tell you. I never saw him.");
            currentScene.setTownsPeople(TownsPeople.Steele);
            currentScene.setClue(Clue.Clue11);
            currentScene.setBackpackItem(BackpackItem.FishBones);
            currentScene.setMinute(5);

            scenes[SceneType.Restaurant.ordinal()] = currentScene;

            //location 1, 2
            currentScene = new Scene();
            currentScene.setName("DriveInn");
            currentScene.setMapSymbol("DI");      
            currentScene.setDescription("A fast food establishment and a good source for snacks.");
            currentScene.setDialog("Yes, Cat DeVil and his gang was here and went that way.");
            currentScene.setTownsPeople(TownsPeople.Coco);
            currentScene.setClue(Clue.Clue3);
            currentScene.setBackpackItem(BackpackItem.CatHairballs);
            currentScene.setMinute(5);

            scenes[SceneType.DriveInn.ordinal()] = currentScene;

            //location 1, 3
            currentScene = new Scene();
            currentScene.setName("Lake");
            currentScene.setMapSymbol("LK");      
            currentScene.setDescription("Ducks and fishes love the pond at Parkland.");
            currentScene.setDialog("Quack, Quack, I saw that cat.");
            currentScene.setTownsPeople(TownsPeople.Duck);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpackItem(BackpackItem.CatHairballs);
            currentScene.setMinute(5);

            scenes[SceneType.Lake.ordinal()] = currentScene;

            //location 1, 4
            currentScene = new Scene();
            currentScene.setName("CatAlley");
            currentScene.setMapSymbol("CA");      
            currentScene.setDescription("This is Cat DeVil's and the bad cats hangout.");
            currentScene.setDialog("You came alone...the boss is not here.");
            currentScene.setTownsPeople(TownsPeople.Gang);
            currentScene.setClue(Clue.Clue5);
            currentScene.setBackpackItem(BackpackItem.CatColar);
            currentScene.setMinute(5);

            scenes[SceneType.CatAlley.ordinal()] = currentScene;

            //location 2, 0
            currentScene = new Scene();
            currentScene.setName("CareHome");
            currentScene.setMapSymbol("CH");      
            currentScene.setDescription("Care Home, the best in town.");
            currentScene.setDialog("Hi there Officer, would like some water?");
            currentScene.setTownsPeople(TownsPeople.Ellie);
            currentScene.setClue(Clue.Clue9);
            currentScene.setBackpackItem(BackpackItem.CatHair);
            currentScene.setMinute(5);

            scenes[SceneType.CareHome.ordinal()] = currentScene;

            //location 2, 1
            currentScene = new Scene();
            currentScene.setName("NeighborsHouse");
            currentScene.setMapSymbol("NH");      
            currentScene.setDescription("The Smiths live here, very nice family.");
            currentScene.setDialog("Hi, there off to catch her I see? Good Luck Officer.");
            currentScene.setTownsPeople(TownsPeople.Smiths);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpackItem(BackpackItem.CatHairballs);
            currentScene.setMinute(5);

            scenes[SceneType.NeighborsHouse.ordinal()] = currentScene;

            //location 2, 2
            currentScene = new Scene();
            currentScene.setName("YourHouse");
            currentScene.setMapSymbol("YH");      
            currentScene.setDescription("Ben and Nancy provides you with all the comforts of home.");
            currentScene.setDialog("Lets go buddy, off to find your bone.");
            currentScene.setTownsPeople(TownsPeople.Ben);
            currentScene.setClue(Clue.Clue1);
            currentScene.setBackpackItem(BackpackItem.Bone);
            currentScene.setMinute(5);

            scenes[SceneType.YourHouse.ordinal()] = currentScene;

            //location 2, 3
            currentScene = new Scene();
            currentScene.setName("CatDeVilHouse");
            currentScene.setMapSymbol("CD");      
            currentScene.setDescription("Cat DeVil lives here just two houses away.");
            currentScene.setDialog("Ruff, Ruff, Where are you? What are you doing here?");
            currentScene.setTownsPeople(TownsPeople.DeVil);
            currentScene.setClue(Clue.Clue3);
            currentScene.setBackpackItem(BackpackItem.CatHairballs);
            currentScene.setMinute(5);

            scenes[SceneType.CatDeVilHouse.ordinal()] = currentScene;

            //location 2, 4
            currentScene = new Scene();
            currentScene.setName("GroceryStore");
            currentScene.setMapSymbol("GS");      
            currentScene.setDescription("Local grocery store where you find evidence that Cat DeVil was there.");
            currentScene.setDialog("I saw Cat DeVil and she went that way.");
            currentScene.setTownsPeople(TownsPeople.Tob);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpackItem(BackpackItem.CatHair);
            currentScene.setMinute(5);

            scenes[SceneType.GroceryStore.ordinal()] = currentScene;

            //location 3, 0
            currentScene = new Scene();
            currentScene.setName("Zoo");
            currentScene.setMapSymbol("ZO");   
            currentScene.setDescription("This is the local zoo, Mr. Nono is a zookeeper.");
            currentScene.setDialog("I saw Cat DeVil and she around here and has a bone.");
            currentScene.setTownsPeople(TownsPeople.Nono);
            currentScene.setClue(Clue.Clue11);
            currentScene.setBackpackItem(BackpackItem.FishBones);
            currentScene.setMinute(5);

            scenes[SceneType.Zoo.ordinal()] = currentScene;

            //location 3, 1
            currentScene = new Scene();
            currentScene.setName("Fishmonger");
            currentScene.setMapSymbol("FM");    
            currentScene.setDescription("Cat DeVil's favorite dining place and the largest in the city.");
            currentScene.setDialog("She was here, bones and hairballs all over the place.");
            currentScene.setTownsPeople(TownsPeople.Catch);
            currentScene.setClue(Clue.Clue7);
            currentScene.setBackpackItem(BackpackItem.CatHair);
            currentScene.setMinute(5);

            scenes[SceneType.Fishmonger.ordinal()] = currentScene;

            //location 3, 2
            currentScene = new Scene();
            currentScene.setName("ZooElephants");
            currentScene.setMapSymbol("ZE");      
            currentScene.setDescription("There are three afircan elephants at Zooland.");
            currentScene.setDialog("I see a box over there, maybe shes hiding in it.");
            currentScene.setTownsPeople(TownsPeople.Elephants);
            currentScene.setClue(Clue.Clue6);
            currentScene.setBackpackItem(BackpackItem.Box);
            currentScene.setMinute(5);

            scenes[SceneType.ZooElephants.ordinal()] = currentScene;

            //location 3, 3
            currentScene = new Scene();
            currentScene.setName("ZooKangaroos");
            currentScene.setMapSymbol("ZK");      
            currentScene.setDescription("The autralians kangaroos at Zooland.");
            currentScene.setDialog("I saw Cat DeVil. Quickly, she's in the pipe.");
            currentScene.setTownsPeople(TownsPeople.Kangaroos);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpackItem(BackpackItem.CatHair);
            currentScene.setMinute(5);

            scenes[SceneType.ZooKangaroos.ordinal()] = currentScene;

            //location 3, 4
            currentScene = new Scene();
            currentScene.setName("ZooGiraffes");
            currentScene.setMapSymbol("ZG");    
            currentScene.setDescription("The girrafes are so tall with long legs at Zooland.");
            currentScene.setDialog("I saw Cat DeVil. Quickly, she's in the pipe.");
            currentScene.setTownsPeople(TownsPeople.Giraffes);
            currentScene.setClue(Clue.Clue9);
            currentScene.setBackpackItem(BackpackItem.Pipe);
            currentScene.setMinute(5);

            scenes[SceneType.ZooGiraffes.ordinal()] = currentScene;

            //location 4, 0
            currentScene = new Scene();
            currentScene.setName("SchoolEntrance");
            currentScene.setMapSymbol("SE");      
            currentScene.setDescription("School Entrance.");
            currentScene.setDialog("Good mornig Childrens. Have a nice school day.");
            currentScene.setTownsPeople(TownsPeople.Brad);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpackItem(BackpackItem.CatHair);
            currentScene.setMinute(5);

            scenes[SceneType.SchoolEntrance.ordinal()] = currentScene;

            //location 4, 1
            currentScene = new Scene();
            currentScene.setName("SchoolCafeteria");
            currentScene.setMapSymbol("SC");      
            currentScene.setDescription("The children loves to feed Cat DeVil and his gang. You too!");
            currentScene.setDialog("You are are my Hero.");
            currentScene.setTownsPeople(TownsPeople.Jane);
            currentScene.setClue(Clue.Clue13);
            currentScene.setBackpackItem(BackpackItem.CatHair);
            currentScene.setMinute(5);

            scenes[SceneType.SchoolCafeteria.ordinal()] = currentScene;

            //location 4, 2
            currentScene = new Scene();
            currentScene.setName("SchoolPlayGround");
            currentScene.setMapSymbol("SG");      
            currentScene.setDescription("Police Office Pete love the attention the children gives them.");
            currentScene.setDialog("Come here to play.");
            currentScene.setTownsPeople(TownsPeople.Sebastian);
            currentScene.setClue(Clue.Clue3);
            currentScene.setBackpackItem(BackpackItem.CatHairballs);
            currentScene.setMinute(5);

            scenes[SceneType.SchoolPlayGround.ordinal()] = currentScene;

            //location 4, 3
            currentScene = new Scene();
            currentScene.setName("SchoolParking");
            currentScene.setMapSymbol("SP");   
            currentScene.setDescription("This is where you meet MrSneed.");
            currentScene.setDialog("How are you today? Ready to work? Do need a drink of water?");
            currentScene.setTownsPeople(TownsPeople.Sneed);
            currentScene.setClue(Clue.Clue8);
            currentScene.setBackpackItem(BackpackItem.CatColar);
            currentScene.setMinute(5);

            scenes[SceneType.SchoolParking.ordinal()] = currentScene;

            //location 4, 4
            currentScene = new Scene();
            currentScene.setName("ZooTigers");
            currentScene.setMapSymbol("ZT"); 
            currentScene.setDescription("The Bengal tigers hangout in Zooland and can roar so loud.");
            currentScene.setDialog("Umm, you look good to eat. If she was here she would of made a tasty treat.");
            currentScene.setTownsPeople(TownsPeople.Tigers);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpackItem(BackpackItem.Bone);
            currentScene.setMinute(5);

            scenes[SceneType.ZooTigers.ordinal()] = currentScene;
        }
        catch(Exception ex){
                        
            
            throw new MapControlException("ERROR: There was a problem with "
                    + "creating scenes.");
        }
    
        return scenes;
    }


      
    
}
