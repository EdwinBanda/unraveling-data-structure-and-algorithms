package LinkedList.Test;

import LinkedList.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        System.out.println("Linkedlist size: "+ list.getSize());
        list.add(2);
        list.add(3);
        System.out.println(list.toString());
//        list.walkTru();
//        System.out.println(list.walkTru());

    }
}
