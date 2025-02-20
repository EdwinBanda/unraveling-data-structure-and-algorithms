package SkipList;

import javax.tools.Diagnostic;
import java.util.Random;

public class SkipList<T extends Comparable<T>> {
    private static final int MAX_LEVEL = 16;
    private final SkipListNode<T> head;
    private static final double prob50 = 0.5;
    private int level;
    private Random rand;
//    private SkipListNode<T>[] path;

    public SkipList(){
        this.level = 0;
        this.head = new SkipListNode<T>(Integer.MIN_VALUE, null, MAX_LEVEL);
        rand = new Random();
    }

    public int randomLevel(){
        int lvl = 0;
//        boolean randLevel = rand.nextDouble() < prob50;
        while (rand.nextDouble() < prob50 && lvl < MAX_LEVEL){
            lvl++;
        }
        return lvl;
    }

    public SkipListNode<T> search(int key){
        SkipListNode<T>[] path = new SkipListNode[MAX_LEVEL+1];
        SkipListNode<T> current = head;
        for(int i = level; i >= 0; i--){
            while (current.next[i] != null && current.next[i].key < key){
                current = current.next[i];
            }
            path[i] = current;
        }
        return current;
    }

//    public void insertBeforAfter(int key){
//    }

    public void insert(int key, T value){
        //Where to insert?
        SkipListNode<T> before = search(key);
        SkipListNode<T> after = search(key).next[0];
        //Call the random level method
        int newLevel = randomLevel();
        //Creates new Node
        SkipListNode<T> newNode = new SkipListNode<>(key,value, newLevel);
        newNode.next[0] = after;
        before.next[0] = newNode;
    }

//    public String printList(){
//        StringBuilder builder = new StringBuilder();
//        SkipListNode<T> current = head;
//        for(int i = level; i >= 0; i++){
//            builder.append("Level: ").append(i).append(": ");
//            while (current != null){
//                builder.append(current.key).append(", ");
//                current = current.next[i];
//            }
//        }
//        return builder.toString();
//    }

    public void display() {

        for (int i = level; i >= 0; i--) {
            SkipListNode<T> current = head;
            System.out.print("Level " + i + ": ");
            while (current.next[i] != null) {
                System.out.print(current.next[i].key + " ");
                current = current.next[i];
            }
            System.out.println();
        }
    }

//    @Override
//    public String toString() {
//        return "SkipList{" +
//                "head=" + head +
//                ", level=" + level +
//                ", rand=" + rand +
//                '}';
//    }
}
