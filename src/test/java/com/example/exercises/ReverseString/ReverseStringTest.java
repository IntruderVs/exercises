package com.example.exercises.ReverseString;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest()
class ReverseStringTest {

    @Autowired
    private ReverseString reverseString;

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