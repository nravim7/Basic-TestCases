package org.ravi;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests Calculator App")
class CalculatorAppTest {


    CalculatorApp calculatorApp;
    @BeforeAll
    static void setup() {
        System.out.println("Executing @BeforeAll method.");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Executing @AfterAll method.");
    }

    @BeforeEach
    void beforeEach() {
        calculatorApp = new CalculatorApp();
        System.out.println("Executing @BeforeEach method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Executing @AfterEach method");
    }



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