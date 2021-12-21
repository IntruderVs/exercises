package com.example.exercises.Fibonacci;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {

    /**
     * Find the last fibonacci number
     */
    public long getFibonacciNumber(int n) {
        if (n < 0)
            return 0;

        if (n <= 1)
            return n;

        long a1 = 1;
        long a2 = 1;
        long fib = 1;

        for (int j = 3; j <= n; j++) {
            fib = a2 + a1;
            a1 = a2;
            a2 = fib;
        }

        return fib;
    }

    /**
     * Find complete sequence
     */
    public long[] getCompleteFibonacciSequence(int n) {
        if (n < 0)
            return new long[1];

        long[] lo = new long[n + 1];

        if (n < 1)
            return lo;

        lo[1] = 1;
        if (n == 1)
            return lo;

        lo[2] = 1;
        for (int j = 3; j <= n; j++) {
            lo[j] = lo[j - 1] + lo[j - 2];
        }
        return lo;
    }
}
