package com.archishmaan.oops.abstraction;

abstract class Animal{
    abstract void walk();
    public boolean canPrepareFood(){
        return false;
    }
    Animal(){
        System.out.println("Animal constructor called!");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on four legs!");
    }
}

class Bird extends Animal{
    public void walk(){
        System.out.println("Walks on two legs!");
    }
    Bird(){
        System.out.println("Bird constructor called!");
    }
}

public class Abstraction {
    public static void main(String[] args){
        // Constructor chaining
        Bird sparrow = new Bird();
        sparrow.walk();
        System.out.println("Can prepare their own food? " + sparrow.canPrepareFood());
    }
}
