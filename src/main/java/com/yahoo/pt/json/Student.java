package com.yahoo.pt.json;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name + ",age:" + age;
    }
}
