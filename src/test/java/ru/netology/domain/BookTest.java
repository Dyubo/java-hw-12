package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    Book book = new Book(2,"Harry Potter", 800,"J.Rowling");

    @Test
    void shouldMatchWithRightName() {
        boolean actual = book.matches("Harry Potter");
        assertEquals (true,actual);
    }

    @Test
    void shouldMatchWithWrongName() {

        boolean actual = book.matches("Pinokio");
        assertEquals(false, actual);
    }

    @Test
    void shouldMatchWithRightAuthor() {

        boolean actual = book.matches("J.Rowling");
        assertEquals (true,actual);

    }

    @Test

    void shouldMatchWithWrongAuthor() {

        boolean actual = book.matches("Tolstoy");
        assertEquals(false, actual);
    }



}
