package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void runCalculator() {

        // given

        int optionAdd = 1;
        int nr1Add = 2;
        int nr2Add = 3;

        int optionSubtract = 2;
        int nr1Subtract = 20;
        int nr2Subtract = 13;

        int optionMultiplication = 3;
        int nr1Multiplication = 7;
        int nr2Multiplication = -5;

        int optionDivision = 4;
        int nr1Division = 9;
        int nr2Division = 3;
        int nr2Division0 = 0;

        int optionError = 7;


        // when

        String resultAdd= Main.runCalculator(optionAdd, nr1Add, nr2Add);
        String resultSubtract = Main.runCalculator(optionSubtract, nr1Subtract, nr2Subtract);
        String resultMultiplication = Main.runCalculator(optionMultiplication, nr1Multiplication, nr2Multiplication);
        String resultDivision = Main.runCalculator(optionDivision, nr1Division, nr2Division);
        String resultDivision0 = Main.runCalculator(optionDivision, nr1Division, nr2Division0);
        String resultError = Main.runCalculator(optionError, nr1Add, nr2Add);


        // then

        Assertions.assertEquals(resultAdd, "5");
        Assertions.assertEquals(resultSubtract, "7");
        Assertions.assertEquals(resultMultiplication, "-35");
        Assertions.assertEquals(resultDivision, "3");
        Assertions.assertEquals(resultDivision0, "Dzielenie przez zero jest niewykonalne");
        Assertions.assertEquals(resultError, "Błędnie podana opcja");

    }
}