package com.archishmaan.oops;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        String color1 = (pen1.color = "Blue");
        String type1 = (pen1.type = "Gel");

        System.out.print("Pen 1 is of " + color1 + " color and its a " + type1 + " pen");
    }
}