package com.example.exercises.ReverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    void reverseStringEven() {
        char[] s = {'h', 'e', 'l', 'l', 'o', 'o'};
        char[] expected = {'o', 'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    void reverseStringOne() {
        char[] s = {'h'};
        char[] expected = {'h'};
        reverseString.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    void reverseStringEmpty() {
        char[] s = {};
        char[] expected = {};
        reverseString.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    void reverseStringUneven() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(s);
        assertArrayEquals(expected, s);
    }
}