package Queue.queue_tests;

import Queue.queue.QueueWithPriority;

public class PriorityQueue {

    public static void main(String[] args) throws Exception{

        QueueWithPriority<Integer> que = new QueueWithPriority<>();

        que.enqueue(1);
        que.enqueue(3);
        que.enqueue(2);

        System.out.println(que);
    }
}
