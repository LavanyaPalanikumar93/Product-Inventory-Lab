
package services;
import models.Sneaker;
import models.Whiskey;

import java.util.ArrayList;
import java.util.List;
public class WhiskeyService {
    private static int nextId = 1;

    private static List<Whiskey> inventory = new ArrayList<>();  // (2)


    public static Whiskey create( String brand,float price) {
       Whiskey createdWhiskey = new Whiskey(brand, nextId++,price);
        inventory.add(createdWhiskey);
        return createdWhiskey;
    }


    public Whiskey findWhiskey(int id) {
        for  (Whiskey whiskey : inventory) {
            if(whiskey.getId() == id) {
                return whiskey;
            }
        }
        return null;
    }



    public Whiskey[] findAll() {

        Whiskey[] array = new Whiskey[inventory.size()];
        return inventory.toArray(array);


    }
    public boolean delete(int id) {
        for  (Whiskey whiskey : inventory) {
            if(whiskey.getId() == id) {
                inventory.remove(id);

            }
        }return true;

    }




}