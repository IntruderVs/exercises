package com.example.exercises.compareTheTriplets;

import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = Arrays.asList(0, 0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                increment(score, 0);
            } else if (a.get(i) < b.get(i)) {
                increment(score, 1);
            }
        }
        return score;
    }

    private static void increment(List<Integer> score, int index) {
        score.set(index, score.get(index) + 1);
    }
}
