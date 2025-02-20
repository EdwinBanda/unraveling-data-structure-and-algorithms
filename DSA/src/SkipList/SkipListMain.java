package SkipList;

public class SkipListMain {
    public static void main(String[] args) {
        SkipList skip = new SkipList<>();
        skip.insert(5,"Five");
        skip.insert(8,"Five");
        skip.insert(11,"Five");
        skip.insert(3,"Five");
        skip.insert(1,"Five");
//        System.out.println(skip);
//        String result = skip.printList();
//        System.out.println(result);
        skip.display();
    }
}
