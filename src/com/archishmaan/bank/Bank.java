package com.archishmaan.bank;

public class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.email = "uarchishmaan@yahoo.com";
        account1.setPassword("123456");
        System.out.println( account1.email + " is protected and being used in same package");
        System.out.println("Accessed password: " + account1.getPassword());
    }
}
