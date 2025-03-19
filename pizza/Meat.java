package pizza;

public class Meat extends Topping{

    /**
     * Constructor with one argument
     * @param weight Meat weight in grams
     */
    public Meat(String name, int weight) { super(name, weight, 1.2); }

    public Meat() { super("Meat", 10, 1.2); }
}
