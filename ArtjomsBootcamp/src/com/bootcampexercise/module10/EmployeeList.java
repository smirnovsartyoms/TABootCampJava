package com.bootcampexcersise.module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        Employee employee1 = new Employee("guitarist", "The Rolling Stones", 12100);
        Employee employee2 = new Employee("drummer", "The Beatles", 8000);
        Employee employee3 = new Employee("singer", "The Doors", 4500);
        Employee employee4 = new Employee("bassist", "Queen", 6050);
        Employee employee5 = new Employee("keyboardist", "Led Zeppelin", 7300);

        employee1.setName("Keith");
        employee2.setName("Ringo");
        employee3.setName("Jim");
        employee4.setName("John");
        employee5.setName("Richard");
        
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

    }
}