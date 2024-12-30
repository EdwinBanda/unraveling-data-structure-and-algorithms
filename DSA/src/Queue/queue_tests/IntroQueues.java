package Queue.queue_tests;

import Queue.queue.Queue;

public class IntroQueues {
    public static void main(String[] args) {
        Queue<Integer> que = new Queue<>();

        System.out.println(que.isEmpty()); //True
        System.out.println(que.arrsize()); //0
    }
}
