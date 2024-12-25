package Vetor_testes;

import vetor.List;
import vetor.ObjectVector;

public class dinamicTypes {
    public static void main(String[] args) {
        List<String> vetor = new List<String>(5);

        try{
            vetor.adding("E");
            vetor.adding("J");
            vetor.adding("B");
            vetor.adding("L");
            vetor.adding("E");
            vetor.adding("A");
            vetor.removeElement("J");
//            vetor.adding(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(vetor);
//        boolean exist = vetor.containsElement("Element");
//        System.out.println(exist);
//        int Indexof = vetor.lastIndex("B");
//        System.out.println(vetor);
    }
}
