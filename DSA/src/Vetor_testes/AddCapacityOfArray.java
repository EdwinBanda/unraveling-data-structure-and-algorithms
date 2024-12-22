package Vetor_testes;

import vetor.Vetor;

public class AddCapacityOfArray {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        try {
            vetor.adding("B");
            vetor.adding("C");
            vetor.adding("D");
            vetor.adding("E");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(vetor);
    }
}
