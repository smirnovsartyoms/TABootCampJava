package com.bootcampexercise.module2.activity;

public class NumToWordsWithMethodCalling {
    public static void main(String args[]) {
        NumToWords numToWords = new NumToWords();
        numToWordsLogic(5);
    }
    public static void numToWordsLogic(int x) {
        switch(x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }
}
