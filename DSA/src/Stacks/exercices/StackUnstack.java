package Stacks.exercices;

import Stacks.stack.Stack;

import java.util.Scanner;

public class StackUnstack<T> {
    private T[] Object;


    public static void main(String[] args) throws Exception{

        Stack<Integer> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);
        int n = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Insert a number: ");
            n = scan.nextInt();

            if(n % 2 == 0){
                stack.empilha(n);
            }else {
                if(stack.isEmpty()){
                    System.out.println("Stack is empty!");
                }else{
                    stack.unStack();

                }
            }
        }
        if(!(stack.isEmpty())){
            System.out.println("Unstack everybody");
            for (int i = 0; i < stack.arrsize(); i++ ){
                System.out.println(stack.top());
                stack.unStack();
            }
        }
    }
}
