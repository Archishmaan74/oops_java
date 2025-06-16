package com.archishmaan.oops;

public class SportCopyConstructor {
    String sportsName;
    int experience;

    SportCopyConstructor(){}

    SportCopyConstructor (SportCopyConstructor sc2){
        this.sportsName = sc2.sportsName;
        this.experience = sc2.experience;
    }
}
