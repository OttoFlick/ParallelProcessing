package bank;

import java.util.Date;

public class Bank {
    private final double[] accounts;

    public Bank(int n, double initialBalance) {

        accounts = new double[n];
        for (int i = 0; i < accounts.length; i++)
            accounts[i] = initialBalance;
    }

    public synchronized void transfer(int from, int to, double amount)
            throws InterruptedException {

        while (accounts[from] < amount) {
            System.out.println(getTimeAndThreadName() + " WAIT");
            wait();
        }

        System.out.print(Thread.currentThread());
        accounts[from] -= amount;

        System.out.printf(getTimeAndThreadName() + " %10.2f from %d to %d", amount, from, to);

        Thread.sleep((int) (1000 * Math.random()));

        accounts[to] += amount;

        System.out.printf(" balance %d: %10.2f balance %d: %10.2f Total balance: %10.2f%n", from, accounts[from], to, accounts[to], getTotalBalance());

        notifyAll();
    }

    public synchronized double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }

    private static String getTimeAndThreadName() {
        return "Time: " + new Date().toString() + "; " + Thread.currentThread().getName();
    }
}