package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class Test {

    @ParameterizedTest
    @CsvFileSource(files= "src/test/resources/Tests.csv")
    public void shouldCalc(int income, int expense, int threshold, int expected) {
        FrelanceCalc calcMyLife = new FrelanceCalc();
        int actual = calcMyLife.isWorkOrRelax(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }


}
