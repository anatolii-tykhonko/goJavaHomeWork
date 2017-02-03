package com.anatoliy.practice.modul02.task022;


public class Commision {
    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 10;
        double commisionByPercent = 5.0;
        Commision commision = new Commision();
        commision.withdraw(balance, withdrawal, commisionByPercent);
    }

    public void withdraw(int balance, int withdrawal, double commisionByPercent) {
        double commisionByMoney = withdrawal * commisionByPercent / 100;
        if ((commisionByMoney + withdrawal) < balance)
            System.out.println("OK " + commisionByMoney + " " + (balance - commisionByMoney));
        else System.out.println("NO");
    }
}
