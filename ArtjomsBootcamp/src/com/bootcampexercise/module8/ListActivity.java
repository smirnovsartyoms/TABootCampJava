package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {

        List List = new ArrayList();
        List.add("Nick");
        List.add("Rick");
        List.add("Vick");
        List.add("Mick");


        ListActivity obj = new ListActivity();
        obj.print(list);
    }

    void print(List list) {
        Iterator<Object> nameOfIterator = list.iterator();
        {
            System.out.println("*** Work of iterator ***");
            while (nameOfIterator.hasNext()) {
                System.out.println(nameOfIterator.next());
            }
        }
    }
}
