package Stacks.stack_test;

import Stacks.stack.Stack;

public class stackElement {
    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<>(5);

        for(int i = 1; i <= 10; i++){
            stack.empilha(i);
        }
        System.out.println(stack);
        System.out.println(stack.arrsize());

    }
}
