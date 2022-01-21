package com.example.exercises.billDivision;

import java.util.List;

public class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int difference = check(bill, k, b);

        if (difference == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(difference);
        }
    }

    private static int check(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (Integer integer : bill) {
            sum += integer;
        }
        int sumOfMoney = (sum - bill.get(k)) / 2;

        return b - sumOfMoney;
    }

}
