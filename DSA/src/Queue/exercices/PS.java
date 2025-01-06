package Queue.exercices;

import Queue.queue.QueueWithPriority;

import java.util.Random;

public class PS implements Runnable{
    private QueueWithPriority<Person> queue;
    private int counter = 7;
    private Random priority = new Random();
    public PS(QueueWithPriority<Person> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run(){
        for(int i = 0; i < 4; i++){
            try {
                Thread.sleep(2000);
                Person p = new Person(" "+counter, priority.nextInt(3));
//                queue.enqueue(p);
                counter++;
                System.out.println(p+" was added!");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
