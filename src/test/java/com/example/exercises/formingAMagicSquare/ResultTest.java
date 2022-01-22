package com.example.exercises.formingAMagicSquare;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void formingMagicSquare() {
        List<List<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(Arrays.asList(4,8,2));
        arrayLists.add(Arrays.asList(4,5,7));
        arrayLists.add(Arrays.asList(6,1,6));

        assertEquals(4, Result.formingMagicSquare(arrayLists));
    }
}