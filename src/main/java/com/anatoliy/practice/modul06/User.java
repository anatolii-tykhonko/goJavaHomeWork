package com.anatoliy.practice.modul06;

/**
 * Created by anaatolii on 04.03.17.
 */
public class User {
    private static User[] users = new User[20];
    private static int countUsers = 0;
    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User() {
        countUsers++;
        users[countUsers - 1] = this;

    }

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;


    }

    public static User[] getUsers() {
        User[] usersNoNull = UserUtils.deleteEmptyUsers(users);
        return usersNoNull;
    }

    public static int getCountUsers() {
        return countUsers;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (salary != user.salary) return false;
        if (balance != user.balance) return false;
        if (!firstName.equals(user.firstName)) return false;
        return lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        result = 31 * result + balance;
        return result;
    }
}
