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
        return "LinkedList{" +
                "init=" + init +
                '}';
    }
}
