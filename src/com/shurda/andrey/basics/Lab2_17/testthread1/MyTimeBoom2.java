package com.shurda.andrey.basics.Lab2_17.testthread1;

/**
 * In this exercise, you will create a simple counting thread by implement the Runnable interface. It will count to 10,
 * pausing one second between each number. Also, in keeping with the counting theme, it will output a string every ten numbers.
 * 1. Rewrite the MyTimeBomb class to implement the Runnable interface.
 * 2. Override the run()  method. This is where the code
 * will go that will output to console the numbers  from 10 to 0 and after that prints �Boom!!!� .
 * 3. Use the static method Thread.sleep()  to pause for one second.  (Remember, the one-arg version of sleep()
 * specifies the amount of time of sleep in milliseconds.)
 * 4. Create a class Main with a main() method. Add to method main()
 * code that declares local variable bomb1 of MyTimeBomb  type, and create instance of  MyTimeBomb. Add code to execute
 * MyTimeBomb in new thread (Using the Thread class).
 * 5. Execute the program. The program output must be like next example:
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * Boom!!!

 */
public class MyTimeBoom2 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Boom!!!");
    }
}
