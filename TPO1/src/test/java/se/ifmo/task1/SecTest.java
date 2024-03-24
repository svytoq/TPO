package se.ifmo.task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import se.ifmo.task1.Sec;

import static org.junit.jupiter.api.Assertions.*;

public class SecTest {
    @ParameterizedTest(name = "sec({0})")
    @DisplayName("Check PI dots")
    @ValueSource(doubles = {-2 * Math.PI, -Math.PI,  0, Math.PI,  2 * Math.PI, 2, 3, 4})
    void checkPiDots(double param) {
        assertAll(
                () -> assertEquals(1/Math.cos(param), Sec.calculate(param, 50), 0.0001)
        );
    }

    @ParameterizedTest(name = "sec({0}) = {1}")
    @DisplayName("Check csv elements")
    @CsvFileSource(resources = "/table_values.csv", numLinesToSkip = 1, delimiter = ';')
    void checkBetweenDotsFromCsv(double x, double y) {
        assertAll(
                () -> assertEquals(y, Sec.calculate(x, 15), 0.0001)
        );
    }

    @ParameterizedTest(name = "sec({0}) = {1}")
    @DisplayName("Check csv elements")
    @CsvFileSource(resources = "/table_values_high_accuracy.csv", numLinesToSkip = 1, delimiter = ';')
    void checkBetweenDotsFromCsvHighAccuracy(double x, double y) {
        assertAll(
                () -> assertEquals(y, Sec.calculate(x, 20), 0.0000001)
        );
    }

    @Test
    @DisplayName("Check illegal inputs")
    void checkWrongInputs() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> Sec.calculate(Double.POSITIVE_INFINITY, 50)),
                () -> assertThrows(IllegalArgumentException.class, () -> Sec.calculate(Double.NEGATIVE_INFINITY, 50)),
                () -> assertThrows(IllegalArgumentException.class, () -> Sec.calculate(Double.NaN, 50)),
                () -> assertThrows(IllegalArgumentException.class, () -> Sec.calculate(Math.PI/2, 50)),
                () -> assertThrows(IllegalArgumentException.class, () -> Sec.calculate(-Math.PI/2, 50))
        );

    }
}

