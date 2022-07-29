package com.bootcampexcercise.module10;

public abstract class Person {
    private String name;

    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    abstract void introducePerson();
}