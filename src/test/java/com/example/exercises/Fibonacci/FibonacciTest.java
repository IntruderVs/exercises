package com.example.exercises.Fibonacci;

import org.junit.jupiter.api.Test;

import static com.example.exercises.Fibonacci.FibonacciTestData.getArray;
import static com.example.exercises.Fibonacci.FibonacciTestData.getNumberOfFibonacci;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    void getFibonacciNumber() {
        assertEquals(getNumberOfFibonacci(0), fibonacci.getFibonacciNumber(-200));
        assertEquals(getNumberOfFibonacci(0), fibonacci.getFibonacciNumber(0));
        assertEquals(getNumberOfFibonacci(1), fibonacci.getFibonacciNumber(1));
        assertEquals(getNumberOfFibonacci(2), fibonacci.getFibonacciNumber(2));
        assertEquals(getNumberOfFibonacci(3), fibonacci.getFibonacciNumber(3));
        assertEquals(getNumberOfFibonacci(20), fibonacci.getFibonacciNumber(20));
    }

    @Test
    void getCompleteFibonacciSequence() {
        assertArrayEquals(getArray(20), fibonacci.getCompleteFibonacciSequence(20));
        assertArrayEquals(getArray(0), fibonacci.getCompleteFibonacciSequence(-258));
        assertArrayEquals(getArray(1), fibonacci.getCompleteFibonacciSequence(1));
        assertArrayEquals(getArray(2), fibonacci.getCompleteFibonacciSequence(2));
    }
}