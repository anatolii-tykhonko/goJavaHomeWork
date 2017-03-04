package com.anatoliy.practice.modul06;

/**
 * Created by anaatolii on 28.02.17.
 */
public class Main {
    public static void main(String[] args) {
        User userPetro = new User(112233, "Petro", "Vakua", 1200, 800);
        User userVasilii = new User(223311, "Vasilii", "Sulema", 2000, 1800);
        User user = new User(223311, "Vasilii", "Sulema", 2000, 1800);
        User userSveta = new User(213422, "Sveta", "Romanova", 1100, 1800);
        User userNull = new User();

        System.out.println(User.getCountUsers());
            long[] arrayUserId = UserUtils.getUsersId(User.getUsers());
        for (int i = 0; i < arrayUserId.length; i++) {
            System.out.println(arrayUserId[i]);
        }
        System.out.println("Количество одинаковых юзеров");
        System.out.println(UserUtils.uniqueUsers(User.getUsers()).length);
        System.out.println("Количество юзеров с балансом 1800");
        System.out.println(UserUtils.usersWithContitionalBalance(User.getUsers(), 1800).length);
        System.out.println("Платим зарплату");
        for (int i = 0; i < User.getUsers().length; i++) {
            System.out.println("Баланс до :" + User.getUsers()[i].getBalance());
        }
        UserUtils.paySalaryToUsers(User.getUsers());
        for (int i = 0; i < User.getUsers().length; i++) {
            System.out.println("Баланс после :" + User.getUsers()[i].getBalance());
        }





        }
}
