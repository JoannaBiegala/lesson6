package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void shouldAddTwoCorrectNumbers() {
        // given
        int optionAdd = 1;
        int nr1Add = 2;
        int nr2Add = 3;

        // when
        String resultAdd= Main.runCalculator(optionAdd, nr1Add, nr2Add);

        // then
        Assertions.assertEquals(resultAdd, "5");
    }

    @Test
    void shouldSubtractTwoCorrectNumbers() {
        // given
        int optionSubtract = 2;
        int nr1Subtract = 20;
        int nr2Subtract = 13;

        // when
        String resultSubtract = Main.runCalculator(optionSubtract, nr1Subtract, nr2Subtract);

        // then
        Assertions.assertEquals(resultSubtract, "7");
    }

    @Test
    void shouldMultiplyTwoCorrectNumbers() {
        // given
        int optionMultiply = 3;
        int nr1Multiply = 7;
        int nr2Multiply = -5;

        // when
        String resultMultiplication = Main.runCalculator(optionMultiply, nr1Multiply, nr2Multiply);

        // then
        Assertions.assertEquals(resultMultiplication, "-35");

    }
    @Test
    void shouldDivideTwoCorrectNumbers() {
        // given
        int optionDivide = 4;
        int nr1Divide = 9;
        int nr2Divide = 3;

        // when
        String resultDivision = Main.runCalculator(optionDivide, nr1Divide, nr2Divide);

        // then
        Assertions.assertEquals(resultDivision, "3");

    }
    @Test
    void shouldPrintDivideByZeroError() {

        // given
        int optionDivide = 4;
        int nr1Divide = 9;
        int nr2Divide0 = 0;

        // when
        String resultDivision0 = Main.runCalculator(optionDivide, nr1Divide, nr2Divide0);

        // then

        Assertions.assertEquals(resultDivision0, "Dzielenie przez zero jest niewykonalne");

    }
    @Test
    void shouldGiveWrongOptionError() {
        // given
        int optionError = 7;
        int nr1 = 9;
        int nr2 = 3;

        // when
        String resultError = Main.runCalculator(optionError, nr1, nr2);

        // then
        Assertions.assertEquals(resultError, "Błędnie podana opcja");

    }


}