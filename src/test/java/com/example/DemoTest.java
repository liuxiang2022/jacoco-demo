package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    void testAdd() {
        Demo calc = new Demo();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtraction() {
        Demo calc = new Demo();
        assertEquals(8, calc.subtract(10, 2));
    }

    @Test
    void testMultiply() {
        Demo calc = new Demo();
        assertEquals(20, calc.multiply(10, 2));
    }
}