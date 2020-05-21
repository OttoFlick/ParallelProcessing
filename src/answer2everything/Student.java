package answer2everything;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Runnable {
    private Teacher teacher;

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void run() {
        String question = "asdasdasd";
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms").format(new Date()) + " Student " + Thread.currentThread().getName()
                + " send question to teacher: " + question);
        String answer = teacher.answerQuestion(question);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms").format(new Date()) + " " + Thread.currentThread().getName()
                + " got the answer: " + answer);
    }
}
