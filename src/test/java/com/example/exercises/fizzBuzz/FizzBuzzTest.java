package com.example.exercises.fizzBuzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest()
class FizzBuzzTest {

    @Autowired
    FizzBuzz fizzBuzz;

    @Test
    void fizzBuzz3() {
        List<String> expected = Arrays.asList("1", "2", "Fizz");
        assertArrayEquals(new List[]{expected}, new List[]{fizzBuzz.fizzBuzz(3)});
    }

    @Test
    void fizzBuzz15() {
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertThat(expected, is(fizzBuzz.fizzBuzz(15)));
    }
}