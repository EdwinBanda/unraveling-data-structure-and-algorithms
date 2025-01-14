package DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> header;
    private Node<T> trailer;
    private int size;

    public DoublyLinkedList(){
        header = new Node<T>(null,null,null);
        trailer = new Node<T>(null,header,null);
        header.setNext(trailer);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Node<T> addFirst(T element){
        Node<T> nextToHeader = header.getNext();
        Node<T> newest = new Node<T>(element, header, nextToHeader);
        header.setNext(newest);
        nextToHeader.setPrevious(newest);
        this.size++;
        return newest;
    }

    public void addLast(T element){
        Node<T> previousTrailer = trailer.getPrevious();
        Node<T> newest = new Node<T>(element, previousTrailer, trailer);
        previousTrailer.setNext(newest);
        trailer.setPrevious(newest);
        size++;
    }

    public void removeFirst(){
        if(this.isEmpty()){
            throw new RuntimeException("List is empty!");
        }
        Node<T> toRemove = header.getNext();
        header.setNext(toRemove.getNext());
        toRemove.getNext().setPrevious(header);
        size--;
    }

    public void removeLast(){
        if(this.isEmpty()){
            throw new RuntimeException("List is empty");
        }
        Node<T> toRemove = trailer.getPrevious();
        trailer.setPrevious(toRemove.getPrevious());
        toRemove.getPrevious().setNext(trailer);
        size--;
    }

    public void addInAnyPos(T element, int position){
        if(!(position > 0 && position < this.size)){
            throw new IllegalArgumentException("Position does not exist!");
        }
        Node<T> newest = new Node<>(element);
        Node<T> currentNode = header.getNext();
        for(int i = 0; i < position-1; i++){
            currentNode = currentNode.getNext();
        }
        Node<T> nextToCurrent = currentNode.getNext();
        newest.setNext(nextToCurrent);
        nextToCurrent.setPrevious(newest);
        newest.setPrevious(currentNode);
        currentNode.setNext(newest);
        size++;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        if(this.size == 0){
            return "[]";
        }
        builder.append("[");
        Node<T> currentNode = this.header.getNext();
        for (int i = 0; i < this.size - 1; i++){
            builder.append(currentNode.getElement()).append(", ");
            currentNode = currentNode.getNext();
        }
        builder.append(currentNode.getElement()).append("]");

        return builder.toString();
    }
}
