package com.archishmaan.oops;
import com.archishmaan.bank.*;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // Pen() here is a default constructor which does not require to be defined in class
        Student s1 = new Student("Archishmaan", 24); // Parameterised constructor
        SportCopyConstructor sc1 = new SportCopyConstructor();
        sc1.sportsName = "Cricket";
        sc1.experience = 12;
        SportCopyConstructor sc2 = new SportCopyConstructor(sc1); // Copy constructor
        String color1 = (pen1.color = "Blue");
        String type1 = (pen1.type = "Gel");
        String s1Name = s1.name;
        int s1Age = s1.age;

        System.out.println(s1Name + " is of " + s1Age +" yrs old and has a pen of " + color1 + " color and its a " + type1 + " pen.");
        System.out.println(s1Name + " has played " + sc2.sportsName + " for " + sc2.experience +  " years.");

        // There is a destructor in JAVA since we have a garbage collector which automatically deleted unused objects and manages memory leaks.

        // Polymorphism
        Polymorphism p1 = new Polymorphism();
        p1.name = "Archishmaan";
        p1.age = 24;
        int polyAge = p1.printInfo(p1.age);

        System.out.println("Polymorphism example: " + polyAge);;

        // imported package
        Account account1 = new Account();
        account1.name = "customer";
        System.out.println("Hi " + account1.name);
    }
}