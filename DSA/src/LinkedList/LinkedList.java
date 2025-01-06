package LinkedList;

public class LinkedList<T> {

    private Node<T> init;
    private int size;

    public void add(T element){
        Node<T> cell = new Node<T>(element);
        this.init = cell;
        this.size++;
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "init=" + init +
                '}';
    }
}
