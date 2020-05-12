package exercise3;

public class TestRunnable implements Runnable {
    @Override
    public void run() {

        try {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ": " + "start of first section");
                Thread.currentThread().sleep(100);
                System.out.println(Thread.currentThread().getName() + ": " + "end of first section");
            }

            Thread.currentThread().sleep(100);

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ": " + "start of second section");
                Thread.currentThread().sleep(100);
                System.out.println(Thread.currentThread().getName() + ": " + "end of second section");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
