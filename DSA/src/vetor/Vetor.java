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

}