package SkipList;

public class SkipListNode<T> {
    public int key;
    public T value;
    public SkipListNode<T>[] next;

    public SkipListNode(int key, T value, int upLevels) {
        this.key = key;
        this.value = value;
        this.next = new  SkipListNode[upLevels + 1];
    }
}
