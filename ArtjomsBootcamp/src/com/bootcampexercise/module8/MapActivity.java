package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {
    public static void main(String[] args) {

        Map names = new HashMap();
        names.put("1", "Belle");
        names.put("2", "Adele");
        names.put("3", "Danielle");

        MapActivity obj = new MapActivity();
        obj.print(names);
    }

    void print(Map map)
    {
        Set keySet = map.keySet();

        System.out.println("***************");
        System.out.println("Key\tValue");
        Iterator iterat = keySet.iterator();
        while (iterat.hasNext()){
            String key = (String) iterat.next();
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("****************");

    }
}
