package com.bootcampexercise.module2.activity;

public class AddWholeNum {

    public static void main(String args[] ) {
        int sum = 0;
        for (int a = 50; a<= 100; a++) {
            sum = sum + a;
        }
        System.out.println("Sum of numbers from 50 to 100 is " + sum);
    }
}
