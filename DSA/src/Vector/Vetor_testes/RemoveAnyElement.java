package Vetor_testes;

import vetor.Vetor;

public class RemoveAnyElement {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adding("B");
            vetor.adding("C");
            vetor.adding("D");
            vetor.adding("E");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(vetor);
        vetor.removeAnyElement(1);
//        System.out.println(vetor.toString());
//        System.out.println(vetor.arrsize());
        System.out.println(vetor);
    }
}
