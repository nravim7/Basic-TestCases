package org.ravi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests Calculator App")
class CalculatorAppTest {
    CalculatorApp calculatorApp = new CalculatorApp();

    @DisplayName("Test 8/2 = 4")
    @Test
    void testIntegerDivision_WhenEightIsDividedByTwo_ShouldReturnFour() {
        assertEquals(4, calculatorApp.integerDivision(8,2), "divisionMethod Failed");
    }

    @DisplayName("Test 4-2 =2")
    @Test
    void integerSubtraction() {
        assertEquals(2, calculatorApp.integerSubtraction(4,2), "Subtraction Method failed");
    }
}