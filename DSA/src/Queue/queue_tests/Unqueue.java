package Queue.queue_tests;

import Queue.queue.Queue;

public class Unqueue {
    public static void main(String[] args) throws Exception{

        Queue<Integer> que = new Queue<>(10);

        que.enqueue(2);
        que.enqueue(6);
        que.enqueue(0);
        que.enqueue(1);
        que.enqueue(7);

        System.out.println(que);
        que.unqueue();
        que.unqueue();
        System.out.println(que);
        System.out.println(que.arrsize());
    }
}
