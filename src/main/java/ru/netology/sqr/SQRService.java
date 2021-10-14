package ru.netology.sqr;
import static org.junit.jupiter.api.Assertions.*;

public class SQRService {
    public static void main(String[] args) {

        SQRcalculate service = new SQRcalculate();

        int min = 200;
        int max = 300;
        long expected = 3;
        long sum = service.calculate(min, max);

        assertEquals(expected, sum);

        System.out.println(sum);
    }
}