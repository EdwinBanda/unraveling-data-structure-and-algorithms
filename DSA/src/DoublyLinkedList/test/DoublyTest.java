package DoublyLinkedList.test;

import DoublyLinkedList.DoublyLinkedList;

public class DoublyTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.addFirst(4);
        doubly.addFirst(4);
        System.out.println(doubly);
    }
}
