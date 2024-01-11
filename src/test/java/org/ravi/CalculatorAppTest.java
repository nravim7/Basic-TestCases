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

    @Test
    void testIntegerDivision_WhenIntegerIsDividedByZero_ShouldThrowError() {
        //Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        //Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, ()->
                calculatorApp.integerDivision(dividend,divisor), "Division by Zero should have Thrown Exception");


        //Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(), "Unexpected exception");
    }

    @DisplayName("Test 4-2 =2")
    @Test
    void integerSubtraction() {
        assertEquals(2, calculatorApp.integerSubtraction(4,2), "Subtraction Method failed");
    }
}