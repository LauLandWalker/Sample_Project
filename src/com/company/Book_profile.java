package com.company;

/**
 * Created by laulandwalker on 10/13/15.
 */
public class Book_profile {

    private final String title;
    private final double price;
    private final String description;
    private int isbn;

    public Book_profile(String title, double price, String description) {

        this.title = title;
        this.price = price;
        this.description = description;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
