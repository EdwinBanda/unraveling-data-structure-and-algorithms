package CircularLinkedList;

public class CircularLinkedList<T> {
    private Node<T> tail;
    private int size;

    public int size(){
        return size;
    }
    //add element at first place
    public void addFirst(T element){
        Node<T> newest = new Node<>(element, null);
        Node<T> temp;
        if(this.size == 0){
            this.tail = newest;
            newest.setNext(tail);
        }
        temp = this.tail.getNext();
        this.tail.setNext(newest);
        newest.setNext(temp);
        size++;
    }

    //Clean Cycle LinkedList
    public void clear(){
        if(this.size == 0){
            throw new RuntimeException("List is empty!");
        }
        Node<T> currentNode = tail.getNext();
        while (size > 0){
            Node<T> next = currentNode.getNext();
            currentNode.setNext(null);
            currentNode = next;
            size--;
        }
        tail = null;
    }
    //Remove First Node
    public Node<T> removeFirst(){
        Node<T> removed = tail.getNext();
        tail.setNext(removed.getNext());
        removed.setNext(null);
        size--;
        return removed;
    }

    //Add Node in tail position
    public void addTail(T element){
        Node<T> newest = new Node<>(element, null);
        Node<T> temp;
        if(this.size == 0){
            this.tail = newest;
            newest.setNext(tail);
        }
        temp = this.tail.getNext();
        this.tail.setNext(newest);
        newest.setNext(temp);
        this.tail = newest;
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
