package Exercices;

import Vetor_testes.Contact;
import vetor.List;
import vetor.Vetor;

public class ManageContact {
    public static void main(String[] args) throws Exception{
        List<Contact> lst = new List<Contact>(20);
        Contact ctt = new Contact("Bruna", "854975685", "brn@gmail.com");
        for(int i = 0; i < 30; i++){
            lst.adding(ctt);
        }
        System.out.println(lst);
        System.out.println(lst.arrsize());
    }
}
