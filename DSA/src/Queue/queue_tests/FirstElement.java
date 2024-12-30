package Queue.queue_tests;

import Queue.queue.Queue;

public class FirstElement {
    public static void main(String[] args) throws Exception{

        Queue<Integer> que = new Queue<>();

        que.enqueue(2);
        que.enqueue(31);
        que.enqueue(36);
        que.enqueue(5);

        System.out.println(que.firstElement());
    }
}
