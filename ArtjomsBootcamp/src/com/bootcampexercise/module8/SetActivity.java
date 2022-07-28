package com.bootcampexcercise.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {

        HashSet names = new HashSet();

        names.add("Rick");
        names.add("Nick");
        names.add("Mick");
        names.add("Mick");


        SetActivity obj = new SetActivity();
        obj.print(names);
    }
    void print(Set set) {
        for (Object mySet : set) {
            System.out.println(mySet.toString());
        }
    }
}