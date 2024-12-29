package Stacks.exercices;

import Stacks.stack.Stack;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) throws Exception{

        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number to convert from decimal to binary: ");
        int n = scan.nextInt();
        decToBin(n);

    }
    public static String decToBin(int num)throws Exception{

        Stack<Integer> stack =  new Stack<>();
        String bin = "";
        int r;
        while (num > 0){
            r = num % 2;
            num/=2;
            stack.empilha(r);
        }
        while (!stack.isEmpty()){
            bin += stack.unStack();
        }
        System.out.println(bin);
        return bin;
    }
}
