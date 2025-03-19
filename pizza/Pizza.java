package pizza;

import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
    private String name;
    private String dough;
    private ArrayList<Topping> toppings;
    private int doughWeight;
    private final int CALORIES_PER_GRAM = 2;
    private static final HashMap<String, Double> DOUGH_MODIFIER = new HashMap<>();
    static {
        DOUGH_MODIFIER.put("White", 1.5);
        DOUGH_MODIFIER.put("Wholegrain", 1.0);
        DOUGH_MODIFIER.put("Chewy", 1.1);
        DOUGH_MODIFIER.put("Crispy", 0.9);
        DOUGH_MODIFIER.put("Homemade", 1.0);
    }

    public Pizza(String name, String dough, int doughWeight, ArrayList<Topping> toppings) {
        if (name == null || name.length() > 15 || name.length() == 0)
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols");
        else this.name = name;
        if (doughWeight > 200 || doughWeight <= 1)
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        else this.doughWeight = doughWeight;
        if (toppings == null || toppings.size() > 10)
            throw new IllegalArgumentException("The number of toppings should be in range [0..10].");
        else this.toppings = new ArrayList<>(toppings);
        if (dough != null && DOUGH_MODIFIER.containsKey(dough))
            this.dough = dough;
        else throw new IllegalArgumentException("Dough has to be one of following types: " + DOUGH_MODIFIER.keySet());
    }

    public double calculateCalories() {
        double calories = CALORIES_PER_GRAM * doughWeight * DOUGH_MODIFIER.get(dough);
        for (Topping i: toppings)
            calories += i.calculateCalories();
        return calories;
    }

    @Override
    public String toString() {
        return String.format("Pizza \"%s\" from %d g of %s dough and with following toppings: ", name, doughWeight, dough) + toppings.toString();
    }
}
