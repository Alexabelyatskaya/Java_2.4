package ru.netology.sqr;

public class SQRcalculate {
    public long calculate(int min, int max) {
        int index = 0;
        for (int i = 10; i < 100; i++) {
            int square = i * i;
            if (square >= min && square <= max) {
                index = index + 1;
            }
        }
        return index;
    }
}