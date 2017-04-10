package com.shurda.andrey.Lab2_17.testthread5;

/**
 * Create new project called  TestThread5. Add package “com.brainacad.oop.testthread5”.
 * Consider a class Bank with a number of accounts. Transactions are randomly generated that move money between these accounts.
 * Several threads simulate the transfer of random amount of money from a given account to another random account. 
 * The class Bank has a method transfer(), which transfers a given amount from one account to another.
 * A template for the class Bank is given in next pages.
 * 1) The first task is to complete the class Transfer that transfers a random amount of money from a given account
 * to another random account in a bank (use an infinite loop); this class will be executed by multiple threads concurrently. 
 * 2) Complete the code in BankTest  to spawn N_ACCOUNTS  Transfer threads with an initial balance: INITIAL_BALANCE. 
 * The output should be similar (but not exactly identical)to:
 * from: 0 to: 2 amount: 410
 * from: 3 to: 0 amount: 105
 * from: 1 to: 1 amount: 77
 * from: 2 to: 2 amount: 713
 * from: 4 to: 3 amount: 524
 * Total balance: 3581
 * from: 0 to: 4 amount: 927
 * from: 0 to: 4 amount: 768
 * from: 0 to: 1 amount: 647
 * from: 0 to: 0 amount: 539
 * Total balance: 3147
 * from: 3 to: 1 amount: 457
 * Total balance: 3403
 * ...
 * from: 0 to: 4 amount: 633
 * Total balance: 2941
 * from: 2 to: 3 amount: 662
 * Total balance: 3353
 * from: 3 to: 0 amount: 855
 * Total balance: 2739
 */
public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);

        for (int i = 0; i < 2000; i++) {
            Transfer transfer = new Transfer(bank, (int) (Math.random() * 5), (int) (Math.random() * 1000));
            transfer.start();
        }
    }
}
