package com.archishmaan.oops.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        System.out.println("Does dog have a high IQ: "+ d1.IQ());
    }
}
