package com.example.exercises.removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class RemoveDuplicatesFromSortedArrayTest extends RemoveDuplicatesFromSortedArrayBased{

    @Autowired
    RemoveDuplicatesFromSortedArrayTest(RemoveDuplicatesFromSortedArray sortedArray) {
        super(sortedArray);
    }

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = new int[]{0, 1, 2, 3, 4}; // The expected answer with correct length

        validateRootCase(nums, expectedNums);
    }

    @Test
    void removeDuplicatesFromEmptyArray() {
        int[] nums = new int[]{}; // Input array
        int[] expectedNums = new int[]{}; // The expected answer with correct length

        validateRootCase(nums, expectedNums);
    }
}