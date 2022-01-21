package com.example.exercises.compareTheTriplets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ResultTest {

    @Test
    void compareTriplets() {
        List<Integer> integers = Result.compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        assertArrayEquals(new List[]{Arrays.asList(1, 1)}, new List[]{integers});
    }
}