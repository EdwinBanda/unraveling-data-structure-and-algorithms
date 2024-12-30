package Queue.queue_tests;

import Queue.queue.Queue;

public class Enqueue {
    public static void main(String[] args) throws Exception{
        Queue<Integer> que = new Queue<>();

        que.enqueue(5);
        que.enqueue(1);

        System.out.println(que);
        System.out.println(que.isEmpty());
        System.out.println(que.toString());
    }
}
