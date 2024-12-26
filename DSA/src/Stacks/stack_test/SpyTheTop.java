package Stacks.stack_test;

import Stacks.stack.Stack;

public class SpyTheTop {
    public static void main(String[] args) throws Exception{
        Stack<Integer> stack = new Stack<>();

        stack.empilha(2);
        stack.empilha(3);

        System.out.println(stack.top());
    }
}
