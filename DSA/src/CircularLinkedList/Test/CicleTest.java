package CircularLinkedList.Test;

import CircularLinkedList.CircularLinkedList;

public class CicleTest<T> {
    public static void main(String[] args) {

        CircularLinkedList<Integer> cycle = new CircularLinkedList<Integer>();

        cycle.addFirst(2);
        cycle.addFirst(3);
        cycle.addFirst(3);
        cycle.addFirst(1);
        cycle.addFirst(0);
////        cycle.clear();
////        cycle.removeFirst();
////        cycle.removeFirst();
//
        cycle.addTail(5);
//        cycle.addTail(8);
//        cycle.addTail(11);
//
        cycle.removeTail();
//        cycle.removeTail();
//        cycle.rotate();
//        cycle.rotate();

        System.out.println(cycle);
    }
}
