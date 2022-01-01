package com.example.exercises.fizzBuzz;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            strings.add(getItemString(i));
        }
        return strings;
    }

    private String getItemString(int item) {
        if (item % 3 == 0) {
            if (item % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (item % 5 == 0) {
            return "Buzz";
        } else
            return Integer.toString(item);
    }
}
