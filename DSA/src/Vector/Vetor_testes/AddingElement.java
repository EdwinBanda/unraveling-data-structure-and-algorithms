package Vetor_testes;

import vetor.Vetor;

public class AddingElement {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
    try {
        vetor.adding("Elemento 1");
        vetor.adding("Elemento 2");
        vetor.adding("Elemento 3");
    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
