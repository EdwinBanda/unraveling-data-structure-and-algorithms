package vetor;

import java.lang.reflect.Array;

public class List<T> {
    private T[] elementos;
    private int arrSize;

    public List(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.arrSize = 0;
    }

    public List(int capacidade, Class<T> classType){
        this.elementos =(T[]) Array.newInstance(classType, capacidade);
        this.arrSize = 0;
    }
    //Adding elements inside a vector
//    public void adding(Object element){
//        for(int i =0; i < elementos.length; i++){
//            if(elementos[i] == null){
//                this.elementos[i] = element;
//                break;
//            }
//        }
//    }
    public void adding(T element) throws Exception{
        this.addCapacity();
        if(this.arrSize < this.elementos.length){
            this.elementos[this.arrSize] = element;
            this.arrSize++;
        }else{
            throw new Exception("Vetor is full!");
        }
    }

    public int arrsize(){
        return this.arrSize;
    }
    //Print the elements inside the vector without the blank spaces (Recreate the .toString() method)
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
    //Get element by position
    public T getElement(int position){
        if(!(position >= 0 && position < arrSize)){
            throw new IllegalArgumentException("Invalid position!");
        }
        return this.elementos[position];
    }

    //Verify if element exists in array
    public int doExist(String element){
        for(int i = 0; i < this.arrSize; i++){
            if(this.elementos[i].equals(element)){
                return i; //Returns the position of the element
            }
        }
        return -1; //Position does not exist
    }

    //Add Element in any position of the array
    public void addInAnyPos(T elem, int position){
        if(!(position >= 0 && position < arrSize)){
            throw new IllegalArgumentException("Invalid position!");

        }
        //Move elements
        this.addCapacity();
        for(int i = this.arrSize-1; i >= position; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[position] = elem;
        this.arrSize++;
    }

    //Add capacity of array
    private void addCapacity(){
        if(this.arrSize == this.elementos.length){
            T [] newElements =(T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.arrSize; i++){
                newElements[i] = this.elementos[i];
            }
            this.elementos = newElements;
        }
    }

    //Remove element of any position
    public void removeAnyElement(int position) throws Exception{
        if(!(position >= 0 && position < arrSize)){
            throw new Exception("Position out of range");
        }

        for(int i = position; i < this.arrSize-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.arrSize--;
    }

    //Contains Method
    public boolean containsElement(T element){
        for(int i = 0; i < arrSize; i++){
            if(!(this.elementos[i].equals(element))){
                return false;
            }
        }
            return true;
    }

    //Last index of arrayLists
    public int lastIndex(T element){

        for(int i = this.arrSize-1; i >= 0; i--){
            if(this.elementos[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    //Remove Element
    public void removeElement(T element) throws Exception{
//        int pos = this.getElement(element);
        for(int i = 0; i < arrSize; i ++){
            if(this.elementos[i].equals(element)){
                this.removeAnyElement(i);
            }
        }
    }

    //Get element
    public T get(int pos){
        return this.getElement(pos);
    }

    //Clear all elements
    public void clear(){
        this.elementos = (T[]) new Object[this.elementos.length];
    }
}
