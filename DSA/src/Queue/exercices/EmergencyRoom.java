package Queue.exercices;

import Queue.queue.Queue;
import Queue.queue.QueueWithPriority;

public class EmergencyRoom {
    public static final int GREEN = 2;
    public static final int YELLOW = 1;
    public static final int RED = 0;


    public static void main(String[] args) throws Exception{

        QueueWithPriority<Person> que = new QueueWithPriority<>();

        que.enqueue(new Person("1", GREEN));
        que.enqueue(new Person("2", YELLOW));
        que.enqueue(new Person("3", RED));
        que.enqueue(new Person("4", GREEN));
        que.enqueue(new Person("5", GREEN));
        que.enqueue(new Person("6", RED));

        PSAttendments attendments = new PSAttendments(que);
        PS patients = new PS(que);

        Thread t1 = new Thread(attendments);
        Thread t2 = new Thread(patients);

        t1.start();
        t2.start();

    }
}
