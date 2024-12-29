package Stacks.exercices;

//import Stacks.stack.Stack;

import java.util.Stack;

public class HanoiTower {

    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        original.push(7);
        original.push(6);
        original.push(5);
        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);
        hanoi(original.size(), original, destination, aux);
    }

    public static void hanoi(int n, Stack<Integer> original, Stack<Integer> destination, Stack<Integer> aux){
        if(n > 0){
            hanoi(n-1, original,aux,destination);
            destination.push(original.pop());
            System.out.println("------------");
            System.out.println("Original: "+original);
            System.out.println("Destination: "+destination);
            System.out.println("Aux: "+aux);
            hanoi(n-1,aux,destination,original);
        }
    }


}
