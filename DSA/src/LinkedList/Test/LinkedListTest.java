package LinkedList.Test;

import LinkedList.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("Linkedlist size: "+ list.getSize());
//        list.clean();
        System.out.println(list.getSize());
        //Search for element
//        System.out.println(list.search(0));
//        System.out.println(list.search(1));
//        System.out.println(list.search(2));
//
//        System.out.println("----------------------");

        //Search for position
//        System.out.println(list.searchForPosition(2));
//        System.out.println(list.searchForPosition(0));
//        System.out.println(list.searchForPosition(1));

        list.add(6,1);
        list.add(9,5);
        System.out.println(list);
        list.removeInit();
        System.out.println(list);
        list.removeTail();
        System.out.println(list);


    }
}
