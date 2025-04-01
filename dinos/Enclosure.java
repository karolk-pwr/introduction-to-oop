package dinos;

import java.util.HashMap;

public class Enclosure {
    private int maxCapacity;
    private HashMap<String, Dino> dinos = new HashMap<>();

    public Enclosure() {
        this.maxCapacity = 10;
    }

    public Enclosure(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addDino(Dino dino) {
        if (dinos.size() == maxCapacity) {
            System.out.println("Enclosure is full!");
        } if (dinos.containsKey(dino.getID())) {
            System.out.println("Dino with ID " + dino.getID() + " already exists!");
        } else {
            dinos.put(dino.getID(), dino);
            System.out.println("Dino ID " + dino.getID() + " added successfully!");
        }
    }

    public void removeDino(String id) {
        if (dinos.containsKey(id)) {
            dinos.remove(id);
            System.out.println("Dino with ID " + id + " removed successfully!");
        } else System.out.println("Dino with ID " + id + " does not exist!");
    }
}
