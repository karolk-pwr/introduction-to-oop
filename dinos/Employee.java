package dinos;

import java.util.UUID;

public class Employee {
    private String name;
    private String position;
    private int experience;
    private final String id = UUID.randomUUID().toString();

    /**
     * Default constructor
     */
    public Employee() {
        this.name = "Unknown";
        this.position = "Unknown";
        this.experience = 0;
    }

    /**
     * Constructs a new DinoPark employee object with the specified attributes.
     *
     * @param name the name of the employee
     * @param position the position/job title of the employee
     * @param experience the number of years of work experience the employee has
     */
    public Employee(String name, String position, int experience) {
        this.name = name;
        this.position = position;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Hi! My name is " + name + ", I am a " + position + " and I have " + experience + " years of experience.";
    }

    String getName() { return name; }
    String getPosition() { return position; }
    int getExperience() { return experience; }
    String getID() { return id; }
}
