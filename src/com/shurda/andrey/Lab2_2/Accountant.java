package com.shurda.andrey.Lab2_2;

/**
 * Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 * This method should calculate total salary of employee and print his name and total salary.
 */
public class Accountant {
    public static void main(String[] args) {
        Employee.calcSalary("Ivanov", 12.5, 100.0, 1);
        Employee.calcSalary("Shurda", 125, 12.5, 225.2);
        Employee.calcSalary("Dyzkov", 125, 12.5, 225.2);
    }
}
