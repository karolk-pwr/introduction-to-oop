package pizza;
import java.util.ArrayList;

public class PizzaTester {
    public static void main(String[] args) {
        ArrayList<Topping> toppings = new ArrayList<>();
        toppings.add(new Sauce("Tomato sauce", 20));
        toppings.add(new Cheese("Mozzarella", 10));
        toppings.add(new Meat("Pepperoni", 30));
        toppings.add(new Veggies("Onion", 10));
        toppings.add(new Topping("Mushrooms", 15, 1.1));
        Pizza pizza = new Pizza("My first pizza", "White", 100, toppings);
        System.out.println(pizza);
        System.out.println("Pizza contains " + pizza.calculateCalories() + " cal");
    }
}
