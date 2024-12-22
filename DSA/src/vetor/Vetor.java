package vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int arrSize;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.arrSize = 0;
    }
    //Adding elements inside a vector
//    public void adding(String element){
//        for(int i =0; i < elementos.length; i++){
//            if(elementos[i] == null){
//                this.elementos[i] = element;
//                break;
//            }
//        }
//    }
    public void adding(String element) throws Exception{
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
    public String getElement(int position){
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
    public void addInAnyPos(String elem, int position){
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
            String [] newElements = new String[this.elementos.length * 2];
            for(int i = 0; i < this.arrSize; i++){
                newElements[i] = this.elementos[i];
            }
            this.elementos = newElements;
        }
    }

}