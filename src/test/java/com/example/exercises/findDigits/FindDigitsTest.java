package com.example.exercises.findDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @Test
    void findDigits() {
        assertEquals(3, FindDigits.findDigits(1024));
        assertEquals(3, FindDigits.findDigits(124));
        assertEquals(3, FindDigits.findDigits(111));
        assertEquals(2, FindDigits.findDigits(113));
    }
}