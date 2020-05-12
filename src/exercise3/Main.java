package exercise3;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Runnable r = new TestRunnable();
        Collection<Thread> threads = new ArrayList<>();

        for(int i = 0; i < 50; i++){
            String name = "t" + i;
            threads.add(new Thread(r, name));
        }

        for(Thread t : threads){
            t.start();
        }

        /*Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        Thread t3 = new Thread(r, "t3");
        Thread t4 = new Thread(r, "t4");
        Thread t5 = new Thread(r, "t5");
        Thread t6 = new Thread(r, "t6");
        Thread t7 = new Thread(r, "t7");
        Thread t8 = new Thread(r, "t8");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();*/
    }
}
