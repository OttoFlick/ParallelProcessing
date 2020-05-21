package answer2everything;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher {

    public synchronized String answerQuestion(String question){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms").format(new Date()) + " Teacher got a question from student " + Thread.currentThread().getName()
                + question);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms").format(new Date()) + " Teacher found the answer for question of student " + Thread.currentThread().getName()
                + "42");

        return "42";
    }
}
