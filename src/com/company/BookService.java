package com.company;

/**
 * Created by laulandwalker on 10/13/15.
 */
public class BookService {

    private NumberGenerator numberGenerator;


    public BookService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Book_profile createBook(String title, double price, String description) {
        Book_profile bp = new Book_profile(title, price, description);
        bp.setIsbn(numberGenerator.generateNumber());
        return bp;
    }

}
