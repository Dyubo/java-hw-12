package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {

    Smartphone smartphone = new Smartphone(3,"Iphone", 90000,"USA");

    @Test
    public void shouldMatchWithRightName () {
        boolean actual = smartphone.matches("Iphone");
        assertEquals (true,actual);
    }

    @Test

    public void shouldMatchWithWrongName () {
        boolean actual = smartphone.matches("Samsung");
        assertEquals (false,actual);
    }

    @Test

    public void shouldMatchWithRightManufacture () {
        boolean actual = smartphone.matches("USA");
        assertEquals (true,actual);
    }

    public void shouldMatchWithWrongManufacture () {
        boolean actual = smartphone.matches("Japan");
        assertEquals (false,actual);
    }

}
