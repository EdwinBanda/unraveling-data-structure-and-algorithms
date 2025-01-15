package DoublyLinkedList.test;

import DoublyLinkedList.DoublyLinkedList;

public class DoublyTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.addFirst(3);
        doubly.addFirst(4);
        doubly.addLast(5);
        doubly.addLast(6);
//        doubly.removeFirst();
//        doubly.removeLast();
        doubly.addInAnyPos(9, 3);
        System.out.println(doubly.searchElementByPos(2));
    }
}
