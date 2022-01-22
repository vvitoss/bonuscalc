package ru.netology.calc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusCalcTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv",delimiter = '|')
     void test(long expected, long amount, boolean registred) {

        assertEquals(expected, BonusCalc.calculate(amount, registred));
    }

}