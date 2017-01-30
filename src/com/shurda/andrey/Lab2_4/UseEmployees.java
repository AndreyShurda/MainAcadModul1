package com.shurda.andrey.Lab2_4;

/**
 * Create multiple instances of Employee class
 * and the output numberOfEmployees field to the console
 */
public class UseEmployees {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Ivanov", "football", 95_94_95_900);
        Employee employee2 = new Employee("Oleg", "Parovoy", "volleyball", 99_94_95_910);
        Employee employee3 = new Employee("Olga", "Popova", "balet", 93_94_95_910);

        System.out.println("Count of Employees "+Employee.getNumberOfEmployees());
    }
}
