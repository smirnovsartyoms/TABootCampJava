package com.bootcampexercise.module2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {


        // Table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("*** Table of " + i + " ***");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + " = " + i * j);
            }
        }
        // Table from 11 to 20
        {
            for (int a = 11; a <= 22; a++) {
                System.out.println("*** Table of " + a + " ***");
                for (int b = 11; b <= 22; b++) {
                    System.out.println(a + "X" + b + " = " + a * b);


                }
            }


        }
    }
}

