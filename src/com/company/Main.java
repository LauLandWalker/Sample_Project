package com.company;

public class Main {

    public static void main(String[] args) {

        BookService bs = new BookService(new IsbnGenerator());
        System.out.println(bs.createBook("LOTR", 10.00, "Fantasy"));
        /*
        * removed item
        * */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }



    }
}
