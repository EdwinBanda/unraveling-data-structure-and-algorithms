package CircularLinkedList;

public class CircularLinkedList<T> {
    private Node<T> tail = null;
    private int size;

    public int size(){
        return size;
    }
    //add element at first place
    public void addFirst(T element){
        Node<T> newest = new Node<>(element);
        if(this.size == 0){
            newest.setNext(newest);
            this.tail = newest;
        }else{
            this.tail.setNext(newest);
        }
        Node<T> head = tail.getNext();
        tail.setNext(newest);
        newest.setNext(head);
        size++;

    }

    public String toString() {
        if(this.size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = this.tail.getNext();
        for(int i = 0; i < this.size - 1; i++){
            builder.append(current.getElement()).append(",");
            current = current.getNext();
        }
        builder.append(current.getElement()).append("]");
        return builder.toString();
    }
}
