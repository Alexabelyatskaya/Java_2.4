package ru.netology.sqr;
import static org.junit.jupiter.api.Assertions.*;

public class SQRService {
    public static void main(String[] args) {

        SQRcalculate service = new SQRcalculate();

        int min = 200;
        int max = 300;
        long sum = service.calculate(min, max);

        System.out.println(sum);
    }
}
