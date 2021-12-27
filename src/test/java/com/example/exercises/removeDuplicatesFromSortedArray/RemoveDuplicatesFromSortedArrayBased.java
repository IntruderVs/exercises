package com.example.exercises.removeDuplicatesFromSortedArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class RemoveDuplicatesFromSortedArrayBased {

    protected final RemoveDuplicatesFromSortedArray sortedArray;

    @Autowired
    RemoveDuplicatesFromSortedArrayBased(RemoveDuplicatesFromSortedArray sortedArray) {
        this.sortedArray = sortedArray;
    }

    protected void validateRootCase(int[] nums, int[] expectedNums) {
        int k = sortedArray.removeDuplicates(nums); // Calls your implementation

        assertEquals(expectedNums.length, k);//This condition from the problem

        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}