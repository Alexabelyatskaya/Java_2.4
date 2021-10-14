package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class SQRcalculateTest {

    @ParameterizedTest
    @CsvSource(value = {
            "positiveTest,200,300,3",
            "testOverMin,100,300,8",
            "testUnderMin,50,300,8",
            "testUnderMax,200,250,1",
            "testOverMax,200,350,4"
    })
    void shoulCalculate(
            String name,
            int min,
            int max,
            int result
    ) {
        SQRcalculate service = new SQRcalculate();
        long actual = service.calculate(min, max);

        assertEquals(result, actual);
    }
}