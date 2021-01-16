package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    private Product product = new Product(1,"Lord Of The Rings", 600);

    @Test
    void shouldMatchWithRightName() {
        boolean actual = product.matches("Lord Of The Rings");
        assertEquals (true, actual);
    }
    @Test
    void shouldNotMatchWithWrongName() {
        boolean actual = product.matches("Mein Kampf");
        assertEquals (false,actual);
    }


}
