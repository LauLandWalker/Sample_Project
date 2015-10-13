package com.company;

import java.util.Random;

/**
 * Created by laulandwalker on 10/13/15.
 */
public class IsbnGenerator implements NumberGenerator {
    @Override
    public int generateNumber() {
        Random rand = new Random();
        int generatorNumber = rand.nextInt();
        return generatorNumber;
    }
}
