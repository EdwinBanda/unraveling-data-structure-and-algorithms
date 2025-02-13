package Map;

public class HashtableNode {
    private String Key;
    private int Value;
    private HashtableNode next;



    public HashtableNode(String key, int value) {
        Key = key;
        Value = value;

//        this.next = next;
    }

    public HashtableNode(String key, int value, HashtableNode next) {
        Key = key;
        Value = value;
        this.next = next;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public HashtableNode getNext() {
        return next;
    }

    public void setNext(HashtableNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HashtableNode{" +
                "Key='" + Key + '\'' +
                ", Value=" + Value +
                ", next=" + next +
                '}';
    }
}
