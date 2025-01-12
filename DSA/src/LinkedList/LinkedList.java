package LinkedList;

public class LinkedList<T> {

    private Node<T> init;
    private Node<T> last;
    private int size;
    private final int NOT_FOUND = -1;
    private final String NOT_EXIST = "Position does not exist!";

    public void add(T element){
        Node<T> cell = new Node<T>(element);
        if(this.size == 0){
            this.init = cell;
        }else{
            this.last.setNext(cell);
        }
        this.last = cell;
//        System.out.println(last);
        this.size++;
    }

    public void clean(){
        for (Node<T> current = this.init; current != null;){
            Node<T> next = current.getNext();
            current.setElement(null);
            current.setNext(null);
            current = next;
        }
        this.init = null;
        this.last = null;
        this.size = 0;

    }

    private Node<T> searchNode(int position){
        if(!(position >= 0 && position <= this.size)){
            throw new IllegalArgumentException("Position does not exist");
        }
        Node<T> currentNode = this.init;
        for (int i = 0; i < position; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public T searchForPosition(int position){

        return this.searchNode(position).getElement();

    }

    public int search(T element){

        Node<T> currentNode = this.init;
        int pos = 0;

        while(currentNode != null){
            if(currentNode.getElement().equals(element)){
                return pos;
            }
            currentNode = currentNode.getNext();
            pos++;
        }

        return NOT_FOUND;
    }

    public void add(T element, int position){
        if(position < 0 || position > this.size){
            throw new IllegalArgumentException("Invalid Position!");
        }else if(position == this.size){
            this.add(element);
        }
        Node<T> currentNode = this.init;
        Node<T> temp;
        for( int i = 0; i < position-1; i++){
            currentNode = currentNode.getNext();
        }
        Node<T> newNode = new Node<>(element);
        temp = currentNode.getNext();
        currentNode.setNext(newNode);
        newNode.setNext(temp);
        this.size++;
    }

    //Remove first element from the linked list
    public T removeInit(){
        if(this.size == 0){
            throw new RuntimeException("List is empty!");
        }
        T removed = this.init.getElement();
        this.init = this.init.getNext();
        this.size--;
        if(this.size == 0){
            this.last = null;
        }
        return removed;
    }

    //Remove last element from the linked list
    public T removeTail(){
        if(this.size == 0){
            throw new RuntimeException("List is empty!");
        }
        if(this.size == 1){
            return this.removeInit();
        }
        Node<T> penultimate = this.searchNode(this.size-2);
        T removed = penultimate.getNext().getElement();
        penultimate.setNext(null);
        this.last = penultimate;
        this.size--;

        return removed;
    }
    public boolean positionNotExist(int pos){
        return !(pos >= 0 && pos <= this.size);
    }
    //Remove from any position
    public T removeFromAny(int position){

        if(this.positionNotExist(position)){
            throw new IllegalArgumentException(NOT_EXIST);
        }
        if(position == 0){
            return this.removeInit();
        }
        if(position == this.size-1){
            return this.removeTail();
        }
        Node<T> previousNode = this.searchNode(position-1);
        Node<T> currentNode = previousNode.getNext();
        Node<T> nextNode = currentNode.getNext();

        previousNode.setNext(nextNode);
        currentNode.setNext(null);
        this.size--;

        return currentNode.getElement();
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        if(this.size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = this.init;
        for(int i = 0; i < this.size - 1; i++){
            builder.append(current.getElement()).append(",");
            current = current.getNext();
        }
        builder.append(current.getElement()).append("]");
        return builder.toString();
    }
}
