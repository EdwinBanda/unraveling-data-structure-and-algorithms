package Queue.exercices;

import Queue.queue.QueueWithPriority;

public class PSAttendments implements Runnable{
    private QueueWithPriority<Person> queue;

    public PSAttendments(QueueWithPriority<Person> queue){
        super();
        this.queue = queue;
    }

    @Override
    public void run(){
        while (!queue.isEmpty()){
            try {
                System.out.println(queue.unqueue()+" Attended!");
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Attendment concluded!");
    }
}
