package dinos;

import java.util.UUID;

/**
 * Class representing a dinosaur from DinoPark
 */
public class Dino {
    private String species;
    private String name;
    private int age;
    private String diet;
    private int weight;
    private final String id = UUID.randomUUID().toString();

    /**
     * Default constructor
     */
    public Dino() {
        this.species = "Unknown";
        this.name = "Unknown";
        this.age = 0;
        this.diet = "Unknown";
        this.weight = 0;
    }

    /**
     * Constructs a new Dino object with the specified attributes.
     *
     * @param species the species of the dinosaur
     * @param diet the dietary type of the dinosaur (e.g., Carnivore, Herbivore)
     * @param name the name of the dinosaur
     * @param age the age of the dinosaur in years
     * @param weight the weight of the dinosaur in kilograms
     */
    public Dino(String species, String diet, String name, int age, int weight){
        this.species = species;
        this.diet = diet;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Generates a new instance of a Dino object with the specified attributes.
     *
     * @param species the species of the dinosaur
     * @param diet the dietary type of the dinosaur (e.g., Carnivore, Herbivore)
     * @param name the name of the dinosaur
     * @param age the age of the dinosaur in years
     * @param weight the weight of the dinosaur in kilograms
     * @return a new Dino object initialized with the provided attributes
     */
    public static Dino generateDino(String species, String diet, String name, int age, int weight) {
        return new Dino(species, diet, name, age, weight);
    }

    /**
     * Generates a daily meal plan for the dinosaur based on its weight and the specified number of feedings.
     *
     * @param servingsNumber the number of feedings per day
     * @return a String detailing the daily food requirement in kilograms and the per-feeding amount
     */
    public String mealPlan(int servingsNumber) {
        double x = weight * 0.05;
        int y = (int) ( weight * 0.05  / servingsNumber );
        return name + " with " + weight + " kg needs to eat " + x + " kg daily, which means that we need to serve " + y + " kg per feeding.";
    }

    @Override
    public String toString() {
        return "Hi! Meet " + name + ", a" + age + " year old " + species +
                ". As a " + diet + ", it has a robust weight of " + weight + " kilograms.";
    }

    double getWeight() { return weight; }
    double getAge() { return age; }
    String getID() { return id; }
    String getName() { return name; }
}
