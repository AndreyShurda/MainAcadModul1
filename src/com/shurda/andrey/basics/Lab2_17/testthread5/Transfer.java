package com.shurda.andrey.basics.Lab2_17.testthread5;

public class Transfer extends Thread {
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }

    @Override
    public void run() {
        synchronized (bank) {
            int to = (int) (Math.random() * BankTest.N_ACCOUNTS);
            bank.transfer(from, to, max);
        }
    }
}