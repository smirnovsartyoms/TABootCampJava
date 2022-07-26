package com.bootcampexercise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {


        //TODO Find largest in an array
        int[] nums = {999, 178, 2, 8, 9};
        int array = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > array) {
                array = nums[i];
            }
        }
        System.out.println("Largest in array is "+array);
    }
}
