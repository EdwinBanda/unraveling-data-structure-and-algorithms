package Vetor_testes;

import vetor.Vetor;

public class AddInAnyPos {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adding("B");
            vetor.adding("C");
            vetor.adding("D");
            vetor.adding("E");
        }catch (Exception e){
            e.printStackTrace();
        }
        vetor.addInAnyPos("A", 0);
        System.out.println(vetor);
    }
}
