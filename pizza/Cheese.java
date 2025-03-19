package pizza;

public class Cheese extends Topping {

    /**
     * Constructor with one argument
     * @param weight Meat weight in grams
     */
    public Cheese(String name, int weight) {
        super(name, weight, 1.1);
    }
}
