package Queue.exercices;

import Queue.queue.Queue;

import java.util.Random;

public class HotPotatoe {

    public static void main(String[] args) throws Exception{

        Queue<Integer> que = new Queue<>();

        for(int i = 0; i < 10; i++){
            que.enqueue(i);
        }

        Random rand = new Random();
        int num = 0;
        while (num == 0){
            num = rand.nextInt(10);
        }
        System.out.println("Numero: "+num);

        while (que.arrsize() > 1){
            for (int i = 0; i < num; i++){
                que.enqueue(que.unqueue());
            }
            System.out.println("Eliminated: "+que.unqueue());
        }
        System.out.println("Winner: "+que.unqueue());
    }
}
