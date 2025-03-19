package pizza;

public class Topping {
    private int weight;
    private String name;
    private double modifier = 1;
    static final private double CALORIES_PER_GRAM = 2;

    public Topping(String name, int weight, double modifier) {
        if (weight > 50)
            throw new IllegalArgumentException(name + " weight should be in the range [1..50].");
        this.name = name;
        this.weight = weight;
        this.modifier = modifier;
    }

    public Topping() { this("Generic topping", 10, 1); }

    /**
     * Calculates calories according to equation
     * weight * CALORIES_PER_GRAM * modifier
     * @return Calories number
     */
    public double calculateCalories() {
        return weight * CALORIES_PER_GRAM * modifier;
    }

    @Override
    public String toString() {
        return weight + " g of " + name;
    }
}
