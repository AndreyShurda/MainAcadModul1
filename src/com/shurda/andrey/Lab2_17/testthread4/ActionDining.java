package com.shurda.andrey.Lab2_17.testthread4;

/**
 * Created by admin on 10.04.2017.
 */
public class ActionDining extends Thread {
    DiningHall diningHall = new DiningHall();

    public ActionDining(DiningHall diningHall) {
        this.diningHall = diningHall;
    }

    @Override
    public void run() {
        synchronized (diningHall) {
            diningHall.servePizza();
        }
    }
}
