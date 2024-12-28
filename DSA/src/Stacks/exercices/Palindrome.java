package Stacks.exercices;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a word: ");
        String word = scan.nextLine();
        String drow = "";
        for(int i = word.length() - 1; i >= 0; i--){
            drow += word.charAt(i);
        }
        System.out.println(word);
        System.out.println(drow);
        if(word.equals(drow)){
            System.out.println("Is Palindrome!");
        }else{
            System.out.println("Is not Palindrome!");
        }
    }
}
