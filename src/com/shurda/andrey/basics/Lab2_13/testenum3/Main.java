package com.shurda.andrey.basics.Lab2_13.testenum3;

import com.shurda.andrey.basics.Lab2_13.testenum1.MyDayOfWeek;

public class Main {
    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule(new TrainSchedule.Train[1]);
        trainSchedule.addTrain();
//        MyDayOfWeek[] days = {MyDayOfWeek.MONDAY, MyDayOfWeek.SATURDAY, MyDayOfWeek.FRIDAY};
//        trainSchedule.addTrain(1,"Kiev", "Kharkiv","10:00","15:15",days);
//        trainSchedule.addTrain(21,"Kovel", "Kharkiv","12:00","17:00",days);
//        trainSchedule.addTrain(12,"Kharkiv", "Kovel","12:00","17:00",days);
        trainSchedule.printTrains();

//        MyDayOfWeek[] days = new MyDayOfWeek[2];
        System.out.println();
        System.out.println("searchTrain");
        System.out.println(trainSchedule.searchTrain("Kiev", "Kharkiv", MyDayOfWeek.FRIDAY));
    }
}
