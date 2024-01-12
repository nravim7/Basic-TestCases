package org.ravi;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {
    CalculatorApp calculatorApp;

    @BeforeEach
    void beforeEach() {
        calculatorApp = new CalculatorApp();
        System.out.println("Executing @BeforeEach method");
    }

    @DisplayName("Integer Subtraction")
    @RepeatedTest(value=3, name="{displayName}. Repetition {currentRepetition} of " + "{totalRepetitions}")
    void testIntegerDivision_WhenIntegerIsDividedByZero_ShouldThrowError(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        System.out.println("Running "+ testInfo.getTestMethod().get().getName());
        System.out.println("Repetition # "+ repetitionInfo.getCurrentRepetition()+ " of "+ repetitionInfo.getTotalRepetitions());
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

}
