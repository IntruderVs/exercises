package com.example.exercises.removeDuplicatesFromSortedArray;

import org.springframework.stereotype.Component;

@Component
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[length] != nums[i])
                nums[++length] = nums[i];
        }

        return ++length;
    }
}
