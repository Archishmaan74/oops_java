package com.archishmaan.oops;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
