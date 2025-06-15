package com.archishmaan.oops;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // Pen() here is a default constructor which does not require to be defined in class
        Student s1 = new Student("Archishmaan", 24); // Parameterised constructor, values assigned inside class
        String color1 = (pen1.color = "Blue");
        String type1 = (pen1.type = "Gel");
        String s1Name = s1.name;
        int s1Age = s1.age;

        System.out.print(s1Name + " is of " + s1Age +" yrs old and has a pen of " + color1 + " color and its a " + type1 + " pen.");
    }
}