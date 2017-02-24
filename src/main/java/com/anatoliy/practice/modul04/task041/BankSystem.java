package com.anatoliy.practice.modul04.task041;

public  interface BankSystem {
    boolean withdrawOfUser(User user, int amount);
    boolean fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
