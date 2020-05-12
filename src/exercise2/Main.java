package exercise2;

public class Main {

    public static int sum = 0;

    public static void main(String[] args) {
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1;
        }

        NumberCounter n = new NumberCounter(numbers);
        Thread t1 = new Thread(n, "t1");
        Thread t2 = new Thread(n, "t2");
        Thread t3 = new Thread(n, "t3");
        Thread t4 = new Thread(n, "t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum: " + sum);
    }
}
