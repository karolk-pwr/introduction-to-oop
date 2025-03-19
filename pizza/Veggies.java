package pizza;

public class Veggies extends Topping {

    /**
     * Constructor with one argument
     * @param weight Meat weight in grams
     */
    public Veggies(String name, int weight) { super(name, weight, 0.8); }

    public Veggies() { super("Veggies", 10, 0.8); }
}

