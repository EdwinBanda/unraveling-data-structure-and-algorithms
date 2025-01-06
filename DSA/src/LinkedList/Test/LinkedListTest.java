package LinkedList.Test;

import LinkedList.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(20);
        System.out.println("Linkedlist size: "+ list.getSize());
    }
}
