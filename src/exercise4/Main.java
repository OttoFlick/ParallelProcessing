package exercise4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant(3);
        Collection<Thread> threads = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            String name = "customer" + i;
            threads.add(new Thread(new Customer(r), name));
        }

        for(Thread t : threads){
            t.start();
        }

    }
}
