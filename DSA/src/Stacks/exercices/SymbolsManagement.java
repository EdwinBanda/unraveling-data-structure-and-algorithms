package Stacks.exercices;

import Stacks.stack.Stack;

public class SymbolsManagement {
    public static void main(String[] args) throws Exception{

        printResult("A + B");
        printResult("A + B + (C - D)");
        printResult("A + B + (C - D}");

        printResult("{[()]}[](){()}");

    }

    final static String OPEN = "([{";
    final static String CLOSE = ")]}";

    public static void printResult(String expresstion) throws Exception{
        System.out.println(expresstion+ " is balanced? " + checkSymbols(expresstion));
    }


    public static boolean checkSymbols(String expression) throws Exception{
        boolean balanced = true;

        Stack<Character> stack = new Stack<>();
        int index = 0;
        char symbol, top;

        while (index < expression.length() && balanced){
            symbol = expression.charAt(index);
            if(OPEN.indexOf(symbol) > -1){
                stack.empilha(symbol);
            }else if(CLOSE.indexOf(symbol) > -1){
                if(stack.isEmpty()){
                    balanced = false;
                }else{
                    top = stack.unStack();
                    if(OPEN.indexOf(top) != CLOSE.indexOf(symbol)){
                        balanced = false;
                    }
                }
            }
            index++;
        }

        return balanced;
    }
}
