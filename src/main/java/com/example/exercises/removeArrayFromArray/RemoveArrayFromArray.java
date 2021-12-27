package com.example.exercises.removeArrayFromArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveArrayFromArray {
    public static void main(String[] args) {
        List<Object> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(5, 1);

        HashSet<Object> set = new HashSet<>(expected);
        LinkedList<Object> list = new LinkedList<>(actual);

        System.out.println(list);
        list.removeIf(set::contains);

        System.out.println(list);
    }
}
