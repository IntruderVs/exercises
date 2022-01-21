package com.example.exercises.appleAndOrange;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class ResultTest {

    @Test
    void countApplesAndOranges() {
        int startPoint = 7;
        int endPoint = 11;
        int treeA = 5;
        int treeB = 15;
        List<Integer> apples = Arrays.asList(-2, 2, 1);
        List<Integer> oranges = Arrays.asList(5, -6);

        Result.countApplesAndOranges(startPoint, endPoint, treeA, treeB, apples, oranges);
    }

    @Test
    void countApplesAndOrangesNotFound() {
        int startPoint = 7;
        int endPoint = 11;
        int treeA = 5;
        int treeB = 15;
        List<Integer> apples = Arrays.asList(1, 7);
        List<Integer> oranges = Arrays.asList(-3, -9);

        Result.countApplesAndOranges(startPoint, endPoint, treeA, treeB, apples, oranges);
    }
}