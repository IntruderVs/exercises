package com.example.exercises.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray sortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{0,0,1,1,1,1,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = new int[]{0,1,2,3,4}; // The expected answer with correct length

        int k = sortedArray.removeDuplicates(nums); // Calls your implementation

        //This condition from the problem
        assertEquals(expectedNums.length, k);

        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void removeDuplicatesFromEmptyArray() {
        int[] nums = new int[]{}; // Input array
        int[] expectedNums = new int[]{}; // The expected answer with correct length

        int k = sortedArray.removeDuplicates(new int[0]); // Calls your implementation

        assertEquals(expectedNums.length, k);

        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}