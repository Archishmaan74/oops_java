package com.archishmaan.bank;

public class Account{
    public String name;
    protected String email; // Only accessible in the same package or in subclass of Account in different package
    private String password; // only accessible to the class
    // For accessing private members of class we use getters and setter
    // getter
    public String getPassword(){
        return this.password;
    }
    // setter
    public void setPassword(String pass){
        this.password = pass;
    }
}
