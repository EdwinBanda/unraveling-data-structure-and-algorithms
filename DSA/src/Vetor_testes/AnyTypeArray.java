package Vetor_testes;

import vetor.ObjectVector;

public class AnyTypeArray {
    public static void main(String[] args) {
        ObjectVector vetor = new ObjectVector(3);
        Contact c1 = new Contact("Edwin", "845978642", "edwinbanda@gmail.com");
        Contact c2 = new Contact("Edwin", "845978642", "edwinbanda@gmail.com");
        Contact c3 = new Contact("Edwin", "845978642", "edwinbanda@gmail.com");

        try {
            vetor.adding(c1);
            vetor.adding(c2);
            vetor.adding(c3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(vetor);
    }
}
