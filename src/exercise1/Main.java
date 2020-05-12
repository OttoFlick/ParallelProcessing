package exercise1;

public class Main {
    public static void main(String[] args) {
        Resource r = new Resource();

        Thread t1 = new Thread(new ResourceConsumer(r), "t1");
        Thread t2 = new Thread(new ResourceConsumer(r), "t2");
        Thread t3 = new Thread(new ResourceConsumer(r), "t3");
        Thread t4 = new Thread(new ResourceConsumer(r), "t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
