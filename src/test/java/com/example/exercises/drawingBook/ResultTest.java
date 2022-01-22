package com.example.exercises.drawingBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    @Test
    void pageCount() {
        assertEquals(0, Result.pageCount(3, 2));
        assertEquals(1, Result.pageCount(8, 7));
        assertEquals(1, Result.pageCount(8, 6));
        assertEquals(3, Result.pageCount(19, 13));
        assertEquals(3, Result.pageCount(19, 12));
    }

    @Test
    void pageCountForStartForEnd() {
        assertEquals(0, Result.pageCount(5, 1));
        assertEquals(0, Result.pageCount(5, 4));
        assertEquals(0, Result.pageCount(5, 5));
        assertEquals(0, Result.pageCount(6, 6));
    }
}