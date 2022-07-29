package com.bootcampexcercise.module10;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {

    public static void main(String[] args) {

        Map <String, Double> itemHashMap = new HashMap();
        itemHashMap.put("TV", 970.9) ;
        itemHashMap.put("Refrigerator", 1500.9);
        itemHashMap.put("Washing Machine", 730.9);
        itemHashMap.put("Laptop", 899.9);
        ElectronicItemDetails obj = new ElectronicItemDetails();
        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap, "TV"));
    }
    public Double returnPriceOfItem(Map<String, Double> map, String name){
        return map.get(name);
    }
}
