package exercise2;

public class NumberCounter implements Runnable {

    private int[] numbers;
    private int i;

    public NumberCounter(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": START");

        for (; i < numbers.length; i++) {
            synchronized (this) {
                if (i < numbers.length) {
                    System.out.println(Thread.currentThread().getName() + ": " + "Add 1 to " + Main.sum);
                    Main.sum += numbers[i];
                    System.out.println(Thread.currentThread().getName() + ": " + "Actual sum is " + Main.sum);
                }

            }
        }

        System.out.println(Thread.currentThread().getName() + ": END");
    }
}
