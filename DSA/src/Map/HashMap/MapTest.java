package Map.HashMap;

import Map.MyMap;

public class MapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> numbers = new MyMap<>();
        numbers.put("Primeiro", 1);
        numbers.put("Segundo", 2);
        numbers.put("Terceiro", 3);
        System.out.println(numbers);
        numbers.remove("Segundo");
        System.out.println(numbers);
    }
}
