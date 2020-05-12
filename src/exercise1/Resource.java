package exercise1;

public class Resource {
    public synchronized void use(){
        System.out.println(Thread.currentThread().getName() + ": " + "beginning of critical section");
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": " + "end of critical section");
    }
}
