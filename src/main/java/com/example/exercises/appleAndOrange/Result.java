package com.example.exercises.appleAndOrange;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        countFruits(s, t, a, apples);
        countFruits(s, t, b, oranges);
    }

    private static void countFruits(int startPoint, int endPoint, int positionTree, List<Integer> fruits) {
        int count = 0;
        for (Integer fruit : fruits) {
            if (isInside(startPoint, endPoint, positionTree + fruit)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isInside(int startPoint, int endPoint, int position) {
        return startPoint <= position && position <= endPoint;
    }

}
