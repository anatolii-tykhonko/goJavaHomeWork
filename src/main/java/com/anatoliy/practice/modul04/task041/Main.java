package com.anatoliy.practice.modul04.task041;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(111111, "Vova", 4300, 22, "Kogle", 1800, new EUBank(1111, "Poland", Currency.EUR, 20, 1100, 22, 123000));
        User user2 = new User(222222, "Kolya", 2200, 10, "Pompey", 800, new EUBank(2222, "France", Currency.USD, 29, 2200, 12, 1230000) );
        User user3 = new User(333333, "Sasha", 2541, 12, "Tahta", 1240, new USBank(3333, "England", Currency.EUR, 35, 4500, 7, 1000000));
        User user4 = new User(444444, "Sveta", 300, 4, "Cosmetic", 1000, new USBank(4444, "USA", Currency.USD, 80, 7400, 5, 2500000));
        User user5 = new User(555555, "Kate", 9999, 42, "Medicine", 250000, new USBank(5555, "China", Currency.EUR, 180, 800, 43, 780000));
        User user6 = new User(666666, "Bob", 0, 1, "Stage", 300, new USBank(6666, "Korea", Currency.USD, 10, 900, 88, 90000));

        BankSystemImp transaction = new BankSystemImp();
        transaction.transferMoney(user6, user1, 400);
        System.out.println();
        //System.out.println(user1);
        transaction.paySalary(user5);
        System.out.println();
        transaction.fundUser(user2, user2.getSalary() * user2.getMonthsOfEmployment());
        System.out.println();
        transaction.withdrawOfUser(user3, (int)user3.getBalance());
        System.out.println();
        transaction.transferMoney(user4, user6, (int) user4.getBalance() / 2);
    }
}
