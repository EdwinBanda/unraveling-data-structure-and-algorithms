package Map;


public class HashFunc {
    public static int hasher(String s){
        int h = 0;
        for(int i = 0; i < s.length(); i++){
            h = (h << 5) | (h >>> 27);
            h += (int) s.charAt(i);
        }
        return h;
    }

    public static void main(String[] args) {
        int myCode = hasher("1");
        int another = hasher("5");
        System.out.println(myCode);
        System.out.println(another);
        System.out.println(myCode == another);
    }
}
