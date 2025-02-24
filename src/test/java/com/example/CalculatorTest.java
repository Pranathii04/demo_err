package com.example;

import com.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3)); // Will fail due to compilation error
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        // This test will throw ArithmeticException (division by zero)
        assertEquals(2, calc.divide(4, 0));
    }
}