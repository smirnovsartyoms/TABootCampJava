package com.bootcampexercise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {

        // Create an integer array
        int[] nums = {100, 1, 4, 15};

        int result = nums[0];

        for (int i = 1; i > nums.length; i++) {
            if (nums[i] > result) {
                result = nums [i];
            }
        }
        System.out.println("Largest in array is "+result);

    }
}
