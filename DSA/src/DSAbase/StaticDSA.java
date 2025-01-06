package DSAbase;

public class StaticDSA<T> {
    protected T[] elementos;
    protected int arrSize;

    public StaticDSA(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.arrSize = 0;
    }

    public StaticDSA(){
        this(10);
    }

    protected void adding(T element) throws Exception{
        this.addCapacity();
        if(this.arrSize < this.elementos.length){
            this.elementos[this.arrSize] = element;
            this.arrSize++;
        }else{
            throw new Exception("Vetor is full!");
        }
    }

    public void addInAnyPos(T elem, int position){
//        if(!(position >= 0 && position < arrSize)){
//            throw new IllegalArgumentException("Invalid position!");
//
//        }
        //Move elements
        this.addCapacity();
        for(int i = this.arrSize-1; i >= position; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[position] = elem;
        this.arrSize++;
    }

    protected void addCapacity(){
        if(this.arrSize == this.elementos.length){
            T [] newElements =(T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.arrSize; i++){
                newElements[i] = this.elementos[i];
            }
            this.elementos = newElements;
        }
    }

    public int arrsize(){
        return this.arrSize;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.arrSize-1;i++){
            s.append(this.elementos[i]);
            s.append(',');
        }
        if(this.arrSize > 0){
            s.append(this.elementos[this.arrSize-1]);
        }
        s.append("]");

        return s.toString();
    }

    protected void removeAnyElement(int position){
//        if(!(position >= 0 && position < arrSize)){
//            throw new Exception("Position out of range");
//        }

        for(int i = position; i < this.arrSize-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.arrSize--;
    }

    //isEmpty
    public boolean isEmpty(){
        return this.arrSize == 0;
    }
}
