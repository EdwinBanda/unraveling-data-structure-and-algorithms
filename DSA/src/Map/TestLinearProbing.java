package Map;

public class TestLinearProbing {
    public static void main(String[] args) {
        LinearProbing mapper = new LinearProbing();
//        mapper.put("15", 15);
//        mapper.put("3", 3);
//        mapper.put("6", 6);
        mapper.put("18", 18);
        mapper.put("22", 22);
        mapper.put("5", 5);
        mapper.put("13", 13);
        mapper.put("99", 99);
        mapper.put("31", 31);
        mapper.put("5.2", 5);
//        mapper.put("25", 25);
//        System.out.println(mapper.getBucketIndex("15"));
//        System.out.println(mapper.getBucketIndex("3"));
//        System.out.println(mapper.getBucketIndex("6"));
        System.out.println(mapper.getBucketIndex("18"));
        System.out.println(mapper.getBucketIndex("22"));
        System.out.println(mapper.getBucketIndex("5"));
        System.out.println(mapper.getBucketIndex("13"));
        System.out.println(mapper.getBucketIndex("99"));
        System.out.println(mapper.getBucketIndex("31"));
        System.out.println(mapper.getBucketIndex("5"));
        System.out.println(mapper);
//        System.out.println("15".hashCode());
//        System.out.println("3".hashCode());
//        System.out.println("6".hashCode());
        System.out.println("18".hashCode());
        System.out.println("22".hashCode());
        System.out.println("5".hashCode());
        System.out.println("13".hashCode());
        System.out.println("99".hashCode());
        System.out.println("31".hashCode());
        System.out.println("5".hashCode());
//        System.out.println("15".hashCode());
//        int index = mapper.getBucketIndex("25");
    }
}
