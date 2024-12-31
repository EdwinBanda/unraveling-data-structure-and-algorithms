package Queue.queue;

public class QueueWithPriority<T> extends Queue<T> {

    @Override
    public void enqueue(T element) throws Exception {

        Comparable<T> key = (Comparable<T>) element;

        int i;
        for(i=0; i<this.arrSize; i++){
            if(key.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.addInAnyPos(element, i);
    }
}
