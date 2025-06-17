package com.archishmaan.oops.abstraction;

interface Animals{
    int IQ = 2;
    void walk();
}

class Horses implements Animals{
    public void walk(){
        System.out.println("Walks on 4 legs and has an IQ of " + IQ);
    }
}
public class PureAbstraction {
    public static void main(String[] args){
        Horses poloRunner = new Horses();
        poloRunner.walk();
    }
}
