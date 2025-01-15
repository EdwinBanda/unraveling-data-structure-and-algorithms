package CircularLinkedList;

public class CircularLinkedList<T> {
    private Node<T> tail;
    private int size;

    public CircularLinkedList(){
        tail = new Node<T>(null, null);
    }

    public int size(){
        return size;
    }
    //add element at first place
    public void addFirst(T element){
        if(size == 0){
            tail = new Node<>(element, null);
            tail.setNext(tail);
        }else {
            Node<T> newest = new Node<T>(element, tail.getNext());
            tail.setNext(newest);
        }
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
        addFirst(element);
        rotate();
    }

    //Remove tail
    public void removeTail(){
        Node<T> currentNode = this.tail.getNext();
        for(int i = 0; i < this.size-2; i++){
            currentNode = currentNode.getNext();
        }
        Node<T> next = currentNode.getNext().getNext();
        currentNode.setNext(next);
        this.tail = currentNode;
        size--;

    }

    public void addInAnyPos(T element, int position){
        Node<T> newest = new Node<>(element);
        Node<T> currentNode = tail.getNext();
        for(int i = 0; i < position-1; i++){
            currentNode = currentNode.getNext();
        }
        newest.setNext(currentNode.getNext());
        currentNode.setNext(newest);
    }

    public T searchByPos(int position){
        Node<T> currentNode = tail.getNext();
        for(int i = 0; i < position; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getElement();
    }

    //Rotate
    public void rotate(){
        if(tail != null){
            this.tail = tail.getNext();

        }
    }

    public String toString() {
        if(this.size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = this.tail.getNext();
        for(int i = 0; i < this.size-1; i++){
            builder.append(current.getElement()).append(",");
            current = current.getNext();
        }
        builder.append(current.getElement()).append("]");
        return builder.toString();
    }
}
