package com.anatoliy.practice.modul06;

public class UserUtils {

    public static final User[] uniqueUsers(User[] users) {
        User[] arrayUser = new User[users.length];
        int countUniqueUser = 0;
        for (int i = 0; i < users.length; i++) {
            if (chekRepeat(users[i], users)) {
                arrayUser[countUniqueUser] = users[i];
                countUniqueUser++;
            }
        }
        User[] arrayUniqueUsers = new User[countUniqueUser];
        System.arraycopy(arrayUser, 0, arrayUniqueUsers, 0, countUniqueUser);
        return arrayUniqueUsers;
    }

    private static boolean chekRepeat(User chekUser, User[] arrayChek) {
        System.out.println("Проверяем количество повторений юзера в масиве,если одно повторение значит это даный юзер уникальный ");
        int countRepeat = 0;
        for (User user : arrayChek) {
            if (chekUser.equals(user)) {
                countRepeat++;
            }
        }
        if (countRepeat > 1) {
            return false;
        } else {
            return true;
        }
    }

    public static final User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] arrayUsers = new User[users.length];
        int countUsersContitionalBalance = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                arrayUsers[countUsersContitionalBalance] = users[i];
                countUsersContitionalBalance++;
            }
        }
        User[] arrayUsersWithContitionalBalance = new User[countUsersContitionalBalance];
        System.arraycopy(arrayUsers, 0, arrayUsersWithContitionalBalance, 0, countUsersContitionalBalance);
        return arrayUsersWithContitionalBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    public static final User[] deleteEmptyUsers(User[] users) {
        User[] arrayWithoutEmptyUsers = new User[getCountEmptyUsers(users)];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() != 0) {
                arrayWithoutEmptyUsers[index] = users[i];
                index++;
            }
        }
        System.out.println("Количество не пустых юзеров = " + index);
        return arrayWithoutEmptyUsers;

    }

    private static int getCountEmptyUsers(User[] users) {
        int count = 0;
        for (User user : users) {
            if (user != null && user.getId() != 0) {
                count++;
            }
        }
        return count;
    }
}
