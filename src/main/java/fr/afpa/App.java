package fr.afpa;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

        Employee employee1 = new Employee("11ABC22", "Peppa", "Lavoyageuse", 2500, "1920-06-22");
        Employee employee2 = new Employee("11ABC22", "Peppa", "Lavoyageuse", 2500, "1920-06-22");
        Employee employee3 = new Employee("12ABC33", "Super", "Man", 8000, "1980-12-31");
        Employee employee4 = new Employee("13ABC44", "Michel", "Michel", 1200, "2000-01-25");
        Employee employee5 = new Employee("14ABC55", "Crocodile", "Dundes", 2500, "1987-07-25");



        employee1.setRegistrationNumber("111BBB222");

        ArrayList<Employee> listEmployees = new ArrayList<>();
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);


        for (Employee employee : listEmployees) {
            logger.info(employee);
        }

    }
}
