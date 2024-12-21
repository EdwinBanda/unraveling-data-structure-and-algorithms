package Vetor_testes;

import vetor.Vetor;

public class GetElementsFromArray {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        try {
            vetor.adding("Elemento 1");
            vetor.adding("Elemento 2");
            vetor.adding("Elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(vetor.getElement(2));
    }
}

