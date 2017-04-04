/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejavacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Cassandra
 */
public class ExampleJavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList xboxGame;
        xboxGame = new ArrayList();
        
        //Add objects to the ArrayList
        xboxGame.add("Medal of Honor");
        xboxGame.add("Star Wars the Force Unleashed");
        xboxGame.add("Monopoly");
        xboxGame.add("Zoo Tycoon");
        
        //Display ArrayList objects
        System.out.println("These are the xbox games you currently have:"+xboxGame);
        
        //Remove objects from the ArrayList
        xboxGame.remove("Medal of Honor");
        xboxGame.remove("Star Wars the Force Unleashed");
        
        //Display ArrayList objects
        System.out.println("These are the xbox games you currently have:"+xboxGame);
        
        //Create Array List
        ArrayList xboxOneGame;
        xboxOneGame = new ArrayList();
        
        //Add objects to the ArrayList
        xboxOneGame.add("Diablo III");
        xboxOneGame.add("Minecraft");
        xboxOneGame.add("Lego Star Wars Collection");
        xboxOneGame.add("Lego Indiana Jones Collection");
        
        //New ArrayList to combine previous ArrayLists
        ArrayList combineGame;
        combineGame = new ArrayList();
        
        //Add all objects in ArrayLists to new ArrayList
        combineGame.addAll(xboxGame);
        combineGame.addAll(xboxOneGame);
        
        //Display joined ArrayLists
        System.out.println("These are all of the xbox games you currently own"+combineGame);
        
        //Create HashMap
        HashMap babyName;
        babyName = new HashMap();
        
        //Add object to HashMap
        babyName.put(2, "Emma");
        babyName.put(26, "Cassandra");
        babyName.put(28, "Mathew");
        babyName.put(30, "Walter");
        
        //Display object with Iterator
        Set set = babyName.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: " + mentry.getKey() + " and Value is: ");
            System.out.println(mentry.getValue());
        }
        
        //Remove object from HashMap
        babyName.remove(30, "Walter");
        
        System.out.println("Removed object from HashMap.");
        
        //Display object with Iterator
        Set set1 = babyName.entrySet();
        Iterator iterator1 = set.iterator();
        while(iterator1.hasNext()){
            Map.Entry mentry1 = (Map.Entry)iterator1.next();
            System.out.print("key is: " + mentry1.getKey() + " and Value is: ");
            System.out.println(mentry1.getValue());
        }
        
        //Create TreeMap
        TreeMap sandraLy;
        sandraLy = new TreeMap();
        
        //Add objects to TreeMap
        sandraLy.put(1, "homepage");
        sandraLy.put(2, "portfolio");
        sandraLy.put(10, "photo album");
        sandraLy.put(20, "index");
        sandraLy.put(9, "family history");
        
        Set set2 = sandraLy.entrySet();
        Iterator iterator2 = set.iterator();
        while(iterator2.hasNext()){
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("key is: " + mentry2.getKey() + " and Value is: ");
            System.out.println(mentry2.getValue());
        }
    }
    
}
