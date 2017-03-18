package com.shurda.andrey.Lab2_13.testenum3;

public class Main {
    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule(new TrainSchedule.Train[2]);
        trainSchedule.addTrain();
        trainSchedule.printTrains();
//        trainSchedule.searchTrain()
    }
}
