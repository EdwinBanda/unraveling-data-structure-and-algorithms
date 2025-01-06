package Queue.exercices;

import Queue.queue.Queue;

public class CustomersQueue {


    public static void main(String[] args) throws Exception{

        Queue<String> regular = new Queue<>();
        Queue<String> priority = new Queue<>();

        final int MAX_PRIORITY = 3;

        regular.enqueue("Person 1");
        regular.enqueue("Person 2");
        regular.enqueue("Person 3");
        regular.enqueue("Person 4");

        priority.enqueue("Person 1P");
        priority.enqueue("Person 2P");
        priority.enqueue("Person 3P");
        priority.enqueue("Person 4P");
        priority.enqueue("Person 5P");

        regular.enqueue("Person 5");
        regular.enqueue("Person 6");
        regular.enqueue("Person 7");

        while (!regular.isEmpty() || !priority.isEmpty()){
            int counter = 0;

            while (!priority.isEmpty() && counter < MAX_PRIORITY){
                attendP(priority);
                counter++;
            }
            if(!regular.isEmpty()){
                attendP(regular);
            }
            if(priority.isEmpty()){
                while (!regular.isEmpty()){
                    attendP(regular);
                }
            }
        }
    }

    public static void attendP(Queue<String> Queue)throws Exception{
        String currCustomer = Queue.unqueue();
        System.out.println(currCustomer+" Already attended!");
    }



}
