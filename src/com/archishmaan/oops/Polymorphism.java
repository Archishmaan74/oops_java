package com.archishmaan.oops;

public class Polymorphism {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public int printInfo(int age){
        System.out.println(age);
        return age;
    }
    public void printInfo(String name, int age){
        System.out.println("Name: " + name + " and age: " +age);
    }
}
