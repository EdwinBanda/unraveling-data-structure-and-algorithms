package Queue.queue;

import DSAbase.StaticDSA;

public class Queue<T> extends StaticDSA<T> {

    public Queue(){
        super();
    }

    public Queue(int capacity){
        super(10);
    }

    public void enqueue(T element)throws Exception{
        super.adding(element);
    }

    public T firstElement(){
        if(this.isEmpty()){
            return null;
        }
        return this.elementos[0];
    }

}
