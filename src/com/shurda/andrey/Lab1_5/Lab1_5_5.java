package com.shurda.andrey.Lab1_5;

/**
 * Created by admin on 16.01.2017.
 */
public class Lab1_5_5 {
    public static void main(String[] args) {
        int n = 33;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
            //System.out.println("sum["+i+"]="+sum);
        }
        double avg = sum/n;
        System.out.println("The Sum is: "+sum);
        System.out.println("The Avg is: "+avg);
    }
}
