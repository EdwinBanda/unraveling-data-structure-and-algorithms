package LinkedList;

public class LinkedList<T> {

    private Node<T> init;
    private Node<T> last;
    private int size;
    private final int NOT_FOUND = -1;

    public void add(T element){
        Node<T> cell = new Node<T>(element);
        if(this.size == 0){
            this.init = cell;
        }else{
            this.last.setNext(cell);
        }
        this.last = cell;
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
