package com.archishmaan.oops.abstraction;

interface Animals{
    int IQ = 2;
    void walk();
}

interface Herbivore{
    void veg();
}

class Horses implements Animals,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs and has an IQ of " + IQ);
    }
    public void veg(){
        System.out.println("It's a Herbivore!");
    }
}
public class PureAbstraction {
    public static void main(String[] args){
        Horses poloRunner = new Horses();
        poloRunner.walk();
        poloRunner.veg();
    }
}
