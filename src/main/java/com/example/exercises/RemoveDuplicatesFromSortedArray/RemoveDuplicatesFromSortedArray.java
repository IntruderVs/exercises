package com.example.exercises.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[length] != nums[i])
                nums[++length] = nums[i];
        }
        return ++length;
    }
}
