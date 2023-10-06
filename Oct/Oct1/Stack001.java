package Oct.Oct1;

import java.util.Stack;

public class Stack001 {



    public static void main(String[] args) {


        Stack books = new Stack();


        books.push("Java");

        books.push("Python");

        books.push("C++");

        books.remove(1);



        System.out.println(books.size()); //2

        System.out.println(books.peek());// C++

        System.out.println(books.pop()); // C++

       System.out.println(books.push("C"));

        System.out.println(books);

    }

}