package com.company;

public class Main {

    public static void main(String[] args) {
        MyBankAccount myAccount = new MyBankAccount();

        myAccount.deposit(20000);

        while (true) {
            myAccount.withDraw(6000);
        }
    }
}
