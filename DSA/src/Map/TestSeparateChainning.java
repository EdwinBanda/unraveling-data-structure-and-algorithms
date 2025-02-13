package Map;


public class TestSeparateChainning {
    public static void main(String[] args) {
        HashTableSeparateChainning mapper = new HashTableSeparateChainning();
//        System.out.println(mapper.size());
        mapper.put("One", 1);
        mapper.put("Two", 2);
        mapper.put("Three", 3);
        mapper.put("Four", 4);
        System.out.println(mapper);
    }
}
