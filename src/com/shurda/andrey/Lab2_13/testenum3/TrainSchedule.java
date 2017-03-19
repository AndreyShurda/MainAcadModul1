package com.shurda.andrey.Lab2_13.testenum3;

import com.shurda.andrey.Lab2_13.testenum1.MyDayOfWeek;
import com.shurda.andrey.Util.Labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create new project called  TestEnum3. Add package �com.brainacad.oop.testenum3�.
 * Create a class TrainSchedule which contains inner class Train.
 * 1) Add to class Train six fields: number (of int type), stationDispatch (of String type), stationArrival (of String type),
 * timeDispatch (�f String type), timeArrival (of String type) and days (array of enum type DayOfWeek,
 * containing a list of days of the week), constructor with one parameter (number train) and getters/setter for each class field.
 * Override the toString() method in Train to return all information about train.
 * 2) Add to class TrainSchedule private field trains as array of Train and constructor with one parameter to allocate memory to the schedule.
 * 3) Add to class TrainSchedule public method addTrain() without parameters, which read from console (using System.in and Scanner)
 * all information on train, then to create new Train object and pass it to next available array element.
 * 4) Add to class TrainSchedule  public method printTrains() which iterates over trains array in loop and print all information of each train to console.
 * 5) Add to class TrainSchedule  public method searchTrain(...) with three parameters, of String type (stationDispatch, stationArrival )
 * and of DayOfWeek enum type, which searches and print all trains that go to the destination after a specified day of the week.
 * 6) Create a class Main with a main() method. Add to method main() code that creates TrainSchedule  object and fill fills it the several trains.
 * Add code to invoke printTrains() method, then code to invoke searchTrain() method.
 */
public class TrainSchedule {

    private Train[] trains;

    public TrainSchedule(Train[] trains) {
        this.trains = trains;
    }

    public void addTrain() {
        Scanner scanner = new Scanner(System.in);
        int countOfTrain = 0;
        while (countOfTrain < trains.length) {
            Train train = new Train(Labs.getPositiveInteger(" of train "));

            String stationDispatch = getStringFromScanner("stationDispatch");
            train.setStationDispatch(stationDispatch);

            String stationArrival = getStringFromScanner("stationArrival");
            train.setStationArrival(stationArrival);

            String timeDispatch = getStringFromScanner("timeDispatch");
            train.setTimeDispatch(timeDispatch);

            String timeArrival = getStringFromScanner("timeArrival");
            train.setTimeArrival(timeArrival);

            String days = getStringFromScanner("days");
//            parseDays(days);
            train.setDays(parseDays(days));

            trains[countOfTrain] = train;
            countOfTrain++;
        }
    }

    static int count = 0;

    public void addTrain(int number, String stationDispatch, String stationArrival, String timeDispatch, String timeArrival, MyDayOfWeek[] days) {
        Train train = new Train(number);
        train.setStationDispatch(stationDispatch);
        train.setStationArrival(stationArrival);
        train.setTimeDispatch(timeDispatch);
        train.setTimeArrival(timeArrival);
        train.setDays(days);
        trains[count] = train;
        count++;
    }

    private MyDayOfWeek[] parseDays(String days) {
        String[] daysOfWeek = days.split(",");
        MyDayOfWeek[] myDayOfWeek = new MyDayOfWeek[daysOfWeek.length];
        for (int i = 0; i < daysOfWeek.length; i++) {
            myDayOfWeek[i] = MyDayOfWeek.valueOf(daysOfWeek[i]);
        }
        return myDayOfWeek;
    }

    private String getStringFromScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + msg + " : ");
        return scanner.nextLine();
    }


    public void printTrains() {
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    public Train searchTrain(String stationDispatch, String stationArrival, MyDayOfWeek day) {
//        for (Train train : trains) {
        for (int i = 0; i < trains.length; i++) {
            boolean equalsStationDispatch = trains[i].getStationDispatch().equals(stationDispatch);
            boolean equalsStationArrival = trains[i].getStationArrival().equals(stationArrival);

            if (equalsStationDispatch && equalsStationArrival) {
                for (int j = 0; j < trains[i].getDays().length; j++) {
                    if (trains[i].getDays()[j].equals(day)) {
                        return trains[i];
                    }
                }
            }
        }
        return null;
    }

    class Train {
        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private MyDayOfWeek days[];

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public MyDayOfWeek[] getDays() {
            return days;
        }

        public void setDays(MyDayOfWeek[] days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }


}
