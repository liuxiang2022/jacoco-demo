package com.example;

public class Demo {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return a / b;
    }

    public int square  (int a) {
        return a * a;
    }
}