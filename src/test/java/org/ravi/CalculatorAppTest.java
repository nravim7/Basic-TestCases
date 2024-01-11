package org.ravi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAppTest {
    CalculatorApp calculatorApp = new CalculatorApp();

    @Test
    void integerDivision() {
        assertEquals(4, calculatorApp.integerDivision(8,2), "divisionMethod Failed");
    }

    @Test
    void integerSubtraction() {
        assertEquals(2, calculatorApp.integerSubtraction(4,2), "Subtraction Method failed");
    }
}