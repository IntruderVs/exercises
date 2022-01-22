package com.example.exercises.findDigits;

public class FindDigits {
    public static int findDigits(int n) {
        int counter = 0;
        int remainder = n;
        while (remainder > 0) {
            int lastDigit = getLastDigit(remainder);
            if (lastDigit != 0 && n % lastDigit == 0) {
                counter++;
            }
            remainder /= 10;
        }

        return counter;
    }

    private static int getLastDigit(int number) {
        return number % 10;
    }
}
