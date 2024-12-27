package Stacks.stack_test;

//import Stacks.stack.Stack;
import java.util.Stack;

public class StackAPI {

    public static void main(String[] args) {
//        Stack<Integer> pilha = new Stack<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
