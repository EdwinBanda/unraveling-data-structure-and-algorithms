package Vetor_testes;

import java.util.ArrayList;

public class ArrayListApi {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(1, "B");
        System.out.println(arrayList);
        boolean exist = arrayList.contains("B");
        System.out.println(exist);

        int pos = arrayList.indexOf("J");
        if(pos > -1){
            System.out.println("Element exists in arrayList "+pos);
        }else{
            System.out.println("Element does not exist in arrayList "+pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println(arrayList.size());
//        boolean exist2 = arrayList

    }
}
