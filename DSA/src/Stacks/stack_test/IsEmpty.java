package Stacks.stack_test;

import Stacks.stack.Stack;

public class IsEmpty {
    public static void main(String[] args) throws Exception{

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.empilha(2);

        System.out.println(stack.isEmpty());
    }
}
