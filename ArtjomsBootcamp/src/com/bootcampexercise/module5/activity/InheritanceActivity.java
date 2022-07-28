package com.bootcampexcercise.module5.activity;

public class InheritanceActivity {
    public static void main(String[] args) {


        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);

        System.out.println("-----------------------------");

        Employee_I e = new Employee_I();
        e.setSalary(7000.00);
        e.setTitle("Developer");
        e.setAge(32);
        e.setName("Shawn Cun");

        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + e.getName());
        System.out.println("Employee's Age is   : " + e.getAge());
        System.out.println("Employee's Salary is   : " + e.getSalary());
        System.out.println("Employee's Title is   : " + e.getTitle());

        System.out.println("-----------------------------");
        System.out.println("Person's Name is   : " + p.getName());
        System.out.println("Person's Age is   : " + p.getAge());
    }
}