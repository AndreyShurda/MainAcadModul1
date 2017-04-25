package com.shurda.andrey.basics.Lab2_17.testthread4;

public class DiningHall {
    static int pizzaNum;
    static int studentID = 1;

    public void makePizza() {
        pizzaNum++;
    }

    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else
            result = "Starved ";

        System.out.println(result + studentID);
        studentID++;

    }

    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) {
            d.makePizza();
        }
        for (int i = 1; i <= 20; i++) {
            ActionDining actionDining = new ActionDining(d);
            actionDining.start();
        }
    }
}
