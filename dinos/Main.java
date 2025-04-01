package dinos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dino> dinos = new ArrayList<>();
        dinos.add(new Dino("Tyrannosaurus rex", "Carnivore", "Rex", 12, 7_000));
        dinos.add(new Dino("Triceratops", "Herbivore", "Spike", 8, 6_000));
        dinos.add(new Dino("Velociraptor", "Carnivore", "Blue", 6, 90));
        dinos.add(new Dino("Stegosaurus", "Herbivore", "Charlie", 14, 5_000));
        dinos.add(new Dino("Brachiosaurus", "Herbivore", "Daisy", 35, 35_000));
        dinos.add(Dino.generateDino("Allosaurus", "Carnivore", "Chomper", 9, 2_200));
        dinos.add(new Carnivore("Spinosaurus", "Fang", 18, 10_000));
        dinos.add(new Carnivore("Velociraptor", "Echo", 7, 95));
        dinos.add(new Herbivore("Apatosaurus", "Bronto", 22, 23_000));
        dinos.add(new Herbivore("Iguanodon", "Thunder", 10, 4_500));
        dinos.add(new Omnivore("Gallimimus",  "Nibbles", 5, 440));
        dinos.add(new Omnivore("Microraptor", "Glider", 4, 3 ));

        System.out.println("#################### Dinosaurs in our park ####################");
        for (Dino d: dinos)
            System.out.println(d);

        System.out.println("\n#################### Meal plans ####################");
        System.out.println(dinos.get(0).mealPlan(3));
        System.out.println(dinos.get(3).mealPlan(2));
        System.out.println(dinos.get(4).mealPlan(5));


        double averageWeight = dinos.stream().mapToDouble(Dino::getWeight).average().orElse(0);
        double averageAge = dinos.stream().mapToDouble(Dino::getAge).average().orElse(0);
        System.out.println("\n#################### Average weight and age ####################");
        System.out.println("Average dinos weight: " + averageWeight + " kg");
        System.out.println("Average dinos age: " + averageAge + " years");

        DinoPark park = new DinoPark(5, 5);

        System.out.println("\n#################### Adding employees and dinos ####################");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", "Janitor", 0));
        employees.add(new Employee("Jane Doe", "Chef", 2));
        employees.add(new Manager("Miranda Priestly", 5));
        employees.add(new Security("Rick Sanchez", 10));
        employees.add(new Veterinarian("Holy Price", 10));
        for (Employee e: employees)
            park.addEmployee(e);
        park.removeEmployee(employees.get(0).getID());
        park.removeEmployee(employees.get(0).getID());
        park.addEmployee(employees.get(0));

        park.addDino(2, 1, dinos.get(0));
        park.addDino(1, 3, dinos.get(3));
        park.removeDino(2, 1, dinos.get(0).getID());
        park.removeDino(2, 2, dinos.get(2).getID());

    }
}
