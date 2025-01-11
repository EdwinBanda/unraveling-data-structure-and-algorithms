package CircularLinkedList.Test;

import CircularLinkedList.CircularLinkedList;

public class CicleTest<T> {
    public static void main(String[] args) {

        CircularLinkedList<Integer> cycle = new CircularLinkedList<Integer>();

        cycle.addFirst(2);
        cycle.addFirst(2);
        System.out.println(cycle);
    }
}
