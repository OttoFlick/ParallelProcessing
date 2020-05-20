package exercise4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Customer implements Runnable {
    private Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1; i++) {
            Random r = new Random();
            int delay = r.nextInt(3000 - 1000) + 1000;
            try {
                Thread.currentThread().sleep(delay);
                int table = r.nextInt(this.restaurant.getNumberOfTables()) + 1;
                System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                        + "   " + Thread.currentThread().getName() + ": "
                        + "attempt to use table " + table);
                this.restaurant.useTable(table);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
