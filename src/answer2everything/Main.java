package answer2everything;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Collection<Thread> threads = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            String name = "student" + i;
            threads.add(new Thread(new Student(teacher), name));
        }

        for(Thread t : threads){
            t.start();
        }
    }
}
