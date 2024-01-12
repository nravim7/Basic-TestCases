package org.ravi;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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

    @DisplayName("Test for Integer Subtraction")
    @ParameterizedTest
    //@MethodSource("sourceMethodForSubtraction")
//    @CsvSource({
//            "32,1,31",
//            "45,2,43",
//            "65,1,64"
//    })
    @CsvFileSource(resources = "/integerSubtraction.csv")
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        System.out.println("Running test for "+minuend+"-"+subtrahend+"="+expectedResult);
        assertEquals(expectedResult, calculatorApp.integerSubtraction(minuend, subtrahend), "Subtraction Method failed");
    }

  /*  private static Stream<Arguments> sourceMethodForSubtraction() {
        return Stream.of(
                Arguments.of(31,1,30),
                Arguments.of(41,1,40),
                Arguments.of(51,1,50)

        );
    }*/

    @ParameterizedTest
    @ValueSource(strings={"Ravi","Alice"," "})
    void testValueSourceMethod(String FirstName) {
        System.out.println(FirstName);
        assertNotNull(FirstName);
    }
}