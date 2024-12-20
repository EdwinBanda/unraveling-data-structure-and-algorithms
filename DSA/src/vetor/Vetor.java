package vetor;

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
}