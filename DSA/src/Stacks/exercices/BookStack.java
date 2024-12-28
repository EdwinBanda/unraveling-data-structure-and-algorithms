package Stacks.exercices;

import Stacks.stack.Stack;

import java.util.Scanner;

public class BookStack {
    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
        Stack<Book> books = new Stack<>(20);

        Book bk1 = new Book();
        bk1.setName("Learning Javascript");
        bk1.setAuthor("Banda");
        bk1.setReleaseYear("2004");
        bk1.setIsbn("fa5v4864v5");

        Book bk2 = new Book();
        bk2.setName("Learning Javascript");
        bk2.setAuthor("Banda");
        bk2.setReleaseYear("2004");
        bk2.setIsbn("fa5v4864v5");

        Book bk3 = new Book();
        bk3.setName("Learning Javascript");
        bk3.setAuthor("Banda");
        bk3.setReleaseYear("2004");
        bk3.setIsbn("fa5v4864v5");

        Book bk4 = new Book();
        bk4.setName("Learning Javascript");
        bk4.setAuthor("Banda");
        bk4.setReleaseYear("2004");
        bk4.setIsbn("fa5v4864v5");

        Book bk5 = new Book();
        bk5.setName("Learning Javascript");
        bk5.setAuthor("Banda");
        bk5.setReleaseYear("2004");
        bk5.setIsbn("fa5v4864v5");

        Book bk6 = new Book();
        bk6.setName("Learning Javascript");
        bk6.setAuthor("Banda");
        bk6.setReleaseYear("2004");
        bk6.setIsbn("fa5v4864v5");

        books.empilha(bk1);
        books.empilha(bk2);
        books.empilha(bk3);
        books.empilha(bk4);
        books.empilha(bk5);
        books.empilha(bk6);

        System.out.println(books.arrsize());

        while (!books.isEmpty()){
            System.out.println("Unstacking books!");
            books.unStack();
        }
        System.out.println("Stack is empty!");

    }
}
