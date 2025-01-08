package LinkedList;

public class LinkedList<T> {

    private Node<T> init;
    private Node<T> last;
    private int size;

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
