package services;
import models.Sneaker;
import java.util.ArrayList;
import java.util.List;
public class SneakerService {
    private static int nextId = 1;

    private static List<Sneaker> inventory = new ArrayList<>();  // (2)


    public static Sneaker create(String name, String brand, String sport, float size, int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }


    public Sneaker findSneaker(int id) {
        for  (Sneaker sneaker : inventory) {
            if(sneaker.getId() == id) {
                return sneaker;
            }
        }
        return null;
    }



    public Sneaker[] findAll() {

        Sneaker[] array = new Sneaker[inventory.size()];
        return inventory.toArray(array);


    }
    public boolean delete(int id) {
        for  (Sneaker sneaker : inventory) {
            if(sneaker.getId() == id) {
                inventory.remove(id);

            }
        }return true;

    }




}