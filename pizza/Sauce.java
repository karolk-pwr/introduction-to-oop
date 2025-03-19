package pizza;

public class Sauce extends Topping {

    /**
     * Constructor with one argument
     * @param weight Meat weight in grams
     */
    public Sauce(String name, int weight) { super(name, weight, 0.9); }

    public Sauce() { super("Sauce", 10, 0.9); }
}
