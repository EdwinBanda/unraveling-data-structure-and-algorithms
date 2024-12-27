package Stacks.exercices;

import Stacks.stack.Stack;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) throws Exception{
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int n = 0;

        for(int i = 0; i< 5; i++){
            System.out.println("Insert a number: ");
            n = scan.nextInt();
            if(n == 0){

                Integer unstacked = even.unStack();
                if(unstacked == null){
                    System.out.println("Even is empty");
                }

                unstacked = odd.unStack();
                if(unstacked == null){
                    System.out.println("Odd is empty");
                }

            }else if(n % 2 == 0){
                even.empilha(n);
            } else{
                odd.empilha(n);
            }
        }
        System.out.println(even);
        while (!even.isEmpty()){
            even.unStack();
        }

        System.out.println(odd);
        while (!odd.isEmpty()){
            even.unStack();
        }
    }
}
