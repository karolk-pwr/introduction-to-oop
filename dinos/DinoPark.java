package dinos;

import java.util.HashMap;

public class DinoPark {
    private HashMap<String, Employee> employees = new HashMap<>();
    private Enclosure[][] park;

    public DinoPark() {
        this.park = new Enclosure[10][10];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                park[i][j] = new Enclosure();
            }
        }
    }

    public DinoPark(int rows, int columns) {
        this.park = new Enclosure[rows][columns];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                park[i][j] = new Enclosure();
            }
        }
    }

    public void addEmployee(Employee employee) {
        if (employees.containsKey(employee.getID())) {
            System.out.println("Employee with ID " + employee.getID() + " already exists!");
        } else {
            employees.put(employee.getID(), employee);
            System.out.println("Employee ID " + employee.getID() + " added successfully!");
        }
    }

    public void removeEmployee(String id) {
        if (employees.containsKey(id)) {
            employees.remove(id);
            System.out.println("Employee with ID " + id + " removed successfully!");
        } else System.out.println("Employee with ID " + id + " does not exist!");
    }

    public void addDino(int row, int column, Dino dino) {
        if (row < 0 || row >= park.length || column < 0 || column >= park[row].length) {
            System.out.println("Invalid coordinates!");
        } else {
            park[row][column].addDino(dino);
        }
    }

    public void removeDino(int row, int column, String id) {
         park[row][column].removeDino(id);
    }
}
