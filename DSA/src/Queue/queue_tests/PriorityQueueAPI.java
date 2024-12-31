package Queue.queue_tests;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAPI {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(2);
        priorityQueue.add(1);

        System.out.println(priorityQueue);
    }
}
 