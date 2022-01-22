package com.example.exercises.billDivision;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void bonAppetit_minus() {
        Result.bonAppetit(Arrays.asList(3,10,2,9),1,6);
        assertEquals("-1", output.toString().trim());
    }

    @Test
    void bonAppetit_BonAppetit() {
        Result.bonAppetit(Arrays.asList(3,10,2,9),1,7);
        assertEquals("Bon Appetit", output.toString().trim());
    }

    @Test
    void bonAppetit_plus() {
        Result.bonAppetit(Arrays.asList(3,10,2,9),1,12);
        assertEquals("5", output.toString().trim());
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }
}