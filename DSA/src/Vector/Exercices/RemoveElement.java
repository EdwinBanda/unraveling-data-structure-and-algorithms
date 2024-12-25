package Exercices;

import vetor.List;

public class RemoveElement {
    public static void main(String[] args) throws Exception{
        List<String> lst = new List<String>(5);
        lst.adding("A");
        lst.adding("B");
        lst.adding("C");
        lst.adding("D");
        lst.adding("E");

        lst.removeElement("D");

        System.out.println(lst);
    }
}
