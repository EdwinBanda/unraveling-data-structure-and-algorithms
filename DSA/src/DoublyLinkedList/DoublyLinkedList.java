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

    

    public void addFirst(T element){
        Node<T> newest = new Node<>(element);
        if(this.isEmpty()){
            header.setNext(newest);
            trailer.setPrevious(newest);
        }
        Node<T> nextToHeader = header.getNext();
        header.setNext(newest);
        newest.setNext(nextToHeader);
        this.size++;
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
