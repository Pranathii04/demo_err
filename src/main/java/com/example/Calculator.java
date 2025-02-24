package com.example;

public class Calculator {
    // Deliberate error 1: Missing semicolon
    public int add(int a, int b) {
        return a + b // Error: Missing ';'
    }

    // Deliberate error 2: No handling for division by zero
    public int divide(int a, int b) {
        return a / b;
    }
}